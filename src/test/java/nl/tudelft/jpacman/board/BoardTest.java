package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/***
 * Test class for the Board class.
 */
public class BoardTest {
    private Board board;
    private Board boardWithNull;
    private final int width = 1;
    private final int height = 1;

    /***
     * Setup.
     */
    @BeforeEach
    void setUp() {
        Square[][] grid = new Square[width][height];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }

    /***
     * Test height.
     */
    @Test
    void testHeight() {
        assertThat(board.getHeight()).isEqualTo(height);
    }

    /***
     * Test width.
     */
    @Test
    void testWidth() {
        assertThat(board.getWidth()).isEqualTo(width);
    }

    /***
     * Test testInvariant.
     */
    @Test
    void testInvariant() {
        assertThat(board.invariant()).isTrue();
    }

    /***
     * testNullSquare.
     */
    @Test
    void testNullSquare() {
        Square[][] gridWithNull = new Square[width][height];
        gridWithNull[0][0] = new BasicSquare(); // Create a non-null square
        boardWithNull = new Board(gridWithNull);
        Square square = boardWithNull.squareAt(0, 0);
        assertThat(square).isNotNull();
    }
}
