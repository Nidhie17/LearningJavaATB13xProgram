package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float gst= 18.45f;
        float total2 = course+gst;
        float total3 = (float)course+gst;
        System.out.println(total2);
        System.out.println(total3);
    }
}
