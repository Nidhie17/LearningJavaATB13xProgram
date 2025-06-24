package Assignment_CoreJava;

import java.util.Scanner;

public class leapyear {

        public static void main(String[] args) {
            System.out.println("Enter year ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a%4==0) {
                if (a % 100 == 0) {
                    if(a % 400 == 0) {
                        System.out.printf("%d is  a leap year \n", a);
                    } else {
                        System.out.printf("%d is not a leap year \n", a);
                    }
                }
                else {
                    System.out.printf("%d is a leap year \n",a);
                }
            }
            else
            {
                System.out.printf("%d is not a leap year \n",a);
            }

        }}







