package ex_06_Ternary_Operator;

public class Lab068_TO_Three_Max {
    public static void main(String[] args) {
        int n1=2;
        int n2=-3;
        int n3=-9;
        //A= n1>n2 and n1>n3
        //B= n2>n1 and n2> n3
        int max=n1>n2? n1>n3?n1:n3: n2>n3? n2:n3;
        //A= n1>n3?n1:n3
        //B= n2>n3? n2:n3
        System.out.println(max);
    }
}
