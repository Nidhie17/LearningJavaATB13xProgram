package Test_19june;

public class OperatorprecedenceandtypeCasting {
    public static void main(String[] args) {
        int a=10;
        float b=3.5f;
        int operatorprec=(a*2)+(int)b;
        float c= a+b;
        int d= (int)a+(int)b;
        System.out.printf("Expression result:%d\n", operatorprec);
        System.out.printf("Implicit casting: %f \n", c);
        System.out.printf("Explicit casting: %d \n", d);
    }
}
