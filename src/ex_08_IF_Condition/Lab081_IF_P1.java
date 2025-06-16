package ex_08_IF_Condition;

public class Lab081_IF_P1 {
    public static void main(String[] args) {


        int age = Integer.parseInt(args[0]);
        if (age >= 18) {
            System.out.println("Allowed to Vote");
        } else {
            System.out.println("Not allowed");
        }
    }
}
