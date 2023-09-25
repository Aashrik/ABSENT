
import java.util.Scanner;

public class result_generetor {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int num = sn.nextInt();

        double totalMarks = 0.0;
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter marks for the Subject " + i + ": ");
            double Your_marks = sn.nextDouble();
            totalMarks += Your_marks;
        }
        System.out.println("Your Total marks is : " + totalMarks);

    }
}