package Assignment_CoreJava;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the one side value of triangle");
        Scanner sc= new Scanner(System.in);
        int n1= sc.nextInt();
        System.out.println("Enter the second side value of triangle");
        Scanner sc2= new Scanner(System.in);
        int n2= sc2.nextInt();
        System.out.println("Enter the third side value of triangle");
        Scanner sc3= new Scanner(System.in);
        int n3= sc3.nextInt();

        if(n1==n2 && n1==n3){
            System.out.println("Equilateral triangle");
            }
        else if ( (n1==n2||n1==n3||n2==n3)) {
            System.out.println("Isosceles");
        }
        else{
                System.out.println("scalene");
            }
    }
}
