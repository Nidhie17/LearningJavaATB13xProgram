package Assignment_CoreJava;

public class Increment_Operator_05 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a);

        System.out.println("b: " + b);
    }
}
