public class LetterGrader {

    public int add(int intA, int intB) {
        return intA + intB;
    }

    public int subtract(int intA, int intB) {
        return intA - intB;
    }

    public char determineLetterGrade(int letterGrade) {
        if (letterGrade < 60) {
            return 'F';
        } else if (letterGrade < 70) {
            return 'D';
        } else if (letterGrade < 80) {
            return 'C';
        } else if (letterGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
