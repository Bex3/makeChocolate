package tiy.pink;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by bearden-tellez on 8/24/16.
 */
public class ChocolateSolverTest {
    ChocolateSolver solver;

    @Before
    public void setUp() throws Exception {
        solver = new ChocolateSolver();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testEnoughSmallsNoBigs() throws Exception {
        int numSmalls = solver.makeChocolate(12, 0, 7);
        assertEquals(7, numSmalls);
    }

    @Test
    public void testEnoughBigsNoSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(0, 2, 10);
        assertEquals(0, numSmalls);
    }

    @Test
    public void testNoBigsNoSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(0, 0, 2);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testEnoughBigsEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(3, 5, 28);
        assertEquals(3, numSmalls);
    }

    @Test
    public void testNegativeBigsNegativeSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(-3, -4, 23);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testNegativeBigsPositiveSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(2, -3, 17);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testPositiveBigsNegativeSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(-3, 10, 53);
        assertEquals(-1, numSmalls);
    }

    @Test
    public void testMoreBigsThanNeededEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(3, 9, 33);
        assertEquals(3, numSmalls);
    }

    @Test
    public void testWith9() throws Exception {
        int numSmalls = solver.makeChocolate(4, 1, 9);
        assertEquals(4, numSmalls);
    }

    @Test
    public void notEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(4, 1, 10);
        assertEquals(-1, numSmalls);
    }
    @Test
    public void moreThanEnoughSmalls() throws Exception {
        int numSmalls = solver.makeChocolate(6,1,10);
        assertEquals(5, numSmalls);
    }
}