package ex_UserInput;

import java.util.Scanner;

public class Lab_User_Input_Scanner_2 {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());

        System.out.println("Enter the age");
        Scanner sc1 = new Scanner(System.in);
        System.out.println(sc1.nextInt());

        System.out.println("Enter the double");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.nextDouble());
    }
}
