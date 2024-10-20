public class App {
    public static void main(String[] args) throws Exception {
        LetterGrader grader = new LetterGrader();

        System.out.println("Your grade is: " + grader.determineLetterGrade(93));
    }
}
