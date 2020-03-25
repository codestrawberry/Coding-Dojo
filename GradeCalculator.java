public class GradeCalculator {

    public static void printGrade(int rawScore) {
        printResult(calculateGrade(verifyScore(rawScore)));
    }


    private static int verifyScore(int rawScore) {
        if ((rawScore >= 0) && (rawScore <= 100)) {
            return rawScore;
        }
        return -1;
    }


    private static char calculateGrade(int verifiedScore) {
        if (verifiedScore != -1) {
            if (verifiedScore > 90) {
                return 'A';
            } else if (verifiedScore > 80) {
                return 'B';
            } else if (verifiedScore > 70) {
                return 'C';
            } else if (verifiedScore > 60) {
                return 'D';
            }
            return 'F';
        }
        return 'I';
    }


    private static void printResult(char grade) {
        switch (grade) {
            case 'I':
                System.out.println("Invalid score.");
                break;
            case 'A':
                System.out.println("Congratulations! you've got an A!");
                break;
            case 'B':
                System.out.println("Well done! you've got a B");
                break;
            case 'C':
                System.out.println("Good job! you've got a C");
                break;
            case 'D':
                System.out.println("Not bad! you've got a D");
                break;
            case 'F':
                System.out.println("You have got an F");
                System.out.println("Hey cheer up! make sure to try harder next time :D");
                break;
        }
    }
}
