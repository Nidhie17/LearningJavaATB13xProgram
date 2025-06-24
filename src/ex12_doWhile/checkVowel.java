package ex12_doWhile;

import java.util.Scanner;

public class checkVowel {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner sc = new Scanner(System.in);
        char ch= sc.next().toLowerCase().charAt(0);

        if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch=='u'){
            System.out.println("Character is vowel");
        }
        else {
            System.out.println("Character is consonants");
        }

    }
}
