package Test_19june;

import java.util.Scanner;

public class Largestamong3number {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second number");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Enter third number");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
        if (a > b && a > c && a != b && a != c && b != c) {
            System.out.printf("Largest number is : %d \n", a);
        } else if (a < b && b > c && a != b && a != c && b != c) {
            System.out.printf("Largest number is : %d \n", b);
        } else if (a < c && c > b && a != b && a != c && b != c) {
            System.out.printf("Largest number is : %d \n", c);
        } else if ((a == b && a > c) || (a == c && a > b)) {
            System.out.printf("Largest number is : %d \n", a);

        } else if ((b == c && b > a) || (b == a && b > a)) {
            System.out.printf("Largest number is : %d \n", b);
        } else if ((c == a && c > b) || (b == c && c > a)) {
            System.out.printf("Largest number is : %d \n", c);
        } else if (a==b &&a==c) {
            System.out.println("all values are equal");
        } else {
            System.out.println("Print valid number");
        }
    }
}
