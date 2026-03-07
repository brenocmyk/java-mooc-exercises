
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivenumbers = 0;
        int sum = 0;
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());
        while (number != 0) {
            if (number > 0) {
                positivenumbers++;
                sum += number;
            }
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
        }
        if (positivenumbers > 0) {
            double average = (double) sum / positivenumbers;
            System.out.println("Average of the positive numbers: " + average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
