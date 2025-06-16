package ex_UserInput;

import java.util.Scanner;

public class Lab_UserInput_scanner {
    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner sc = new Scanner(System.in);
        int age= sc.nextInt();
        String canIvote=age>18?"Yes":"No";
        System.out.println(canIvote);


    }
}
