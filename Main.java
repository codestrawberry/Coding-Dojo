import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        GradeCalculator.printGrade(input.nextInt());

        input.close();
    }
}