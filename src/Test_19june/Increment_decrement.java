package Test_19june;

public class Increment_decrement {
    public static void main(String[] args) {

//increment and decrement
        int a = 5;
        System.out.printf("Original: %d\n",a);

        System.out.printf("Pre-increment : %d\n",++a);
        System.out.printf("Post-increment : %d (returned %d)\n",a++,a);
        System.out.printf("Pre-decrement : %d\n",--a);
        System.out.printf("Post-decrement : %d (returned %d)\n",a--,a);
    }
}
