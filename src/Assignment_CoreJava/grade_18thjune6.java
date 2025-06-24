package Assignment_CoreJava;

import java.util.Scanner;

public class grade_18thjune6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number =sc.nextInt();
        if(number>=90 && number<=100){
            System.out.println("Grade A");
        } else if (number >=80 && number < 90) {
            System.out.println("Grade B");
        } else if (number >=70 && number < 80) {
            System.out.println("Grade C");
        }
        else if (number >= 60 && number < 70) {
            System.out.println("Grade D");
        }
        else if (number >=0 && number < 60) {
            System.out.println("Grade E");
        }
        else{
            System.out.println("Enter number between 0-100");
        }
    }
}
