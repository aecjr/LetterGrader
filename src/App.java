import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LetterGrader grader = new LetterGrader();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your final average [0-100]: ");

        int finalGrade = input.nextInt();

        System.out.println("Your grade is: " + grader.determineLetterGrade(finalGrade));

        System.out.println("2 + 2 = " + LetterGrader.add(2, 2));

        System.out.println("3 - 2 = " + LetterGrader.subtract(3, 2));
    }
}
