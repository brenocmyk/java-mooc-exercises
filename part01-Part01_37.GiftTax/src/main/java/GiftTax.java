
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Value of the gift?");
        double giftValue = scanner.nextDouble();
        if (giftValue > 5000 && giftValue <= 24999) {
            System.out.println("tax: " + (100 + giftValue - 5000) * 0.08);
        } else {
            System.out.println("No tax!");
        }
        if  (giftValue >= 25000 && giftValue <= 54999) {
            System.out.println("tax: " + (1700 + giftValue - 25000) * 0.10);
        } else {
            System.out.println("No tax!");
        }
        if (giftValue >= 55000 && giftValue <= 200000) {
            System.out.println("tax: " + (4700 + giftValue - 55000) * 0.12);
        } else {
            System.out.println("No tax!");
        }
        if (giftValue >= 200000 && giftValue <= 1000000) {
            System.out.println("tax: " + (22100 + giftValue - 200000) * 0.15);
        } else {
            System.out.println("No tax!");
        }
        if (giftValue > 1000000) {
            System.out.println("tax: " + (142100 + giftValue - 1000000) * 0.17);
        } else {
            System.out.println("No tax!");
        }
        }
}