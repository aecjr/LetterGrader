public class LetterGrader {

    public static int add(int intA, int intB) {
        return intA + intB;
    }

    public static int subtract(int intA, int intB) {
        return intA - intB;
    }

    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0) {
            throw new IllegalArgumentException("Number cannot be less than 0.");
        }
        else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        } else if (numberGrade < 80) {
            return 'C';
        } else if (numberGrade < 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
}
