package Test_19june;

import java.util.Scanner;

public class NumberClassification {
    public static void main(String[] args) {
        System.out.println("Enter a valid number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(number==0){
            System.out.printf("%d is zero \n",number);
        } else if (number>0) {
            System.out.printf("%d is positive \n",number);
        }
        else {
            System.out.printf("%d is negative \n",number);
        }
    }
}
