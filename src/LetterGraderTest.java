import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class LetterGraderTest {

    LetterGrader grader = new LetterGrader();

    // MathUtils Tests
    @Test
    public void twoPlusTwoShouldEqualFour() {
        assertEquals(4, LetterGrader.add(2, 2));
    }

    // LetterGrader Tests
    @Test
    public void zeroShouldReturnIlegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                grader.determineLetterGrade(-10);
            });
    }

    @Test
    public void zeroShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(0));
    } 

    @Test
    public void fiftyShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(50));
    }
    
    @Test
    public void fiftyNineShouldReturnF() {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    public void sixtyNineShouldReturnD() {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    public void seventyNineShouldReturnC() {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    public void eightyNineShouldReturnB() {
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    public void ninetyNineShouldReturnA() {
        assertEquals('A', grader.determineLetterGrade(99));
    }

}
