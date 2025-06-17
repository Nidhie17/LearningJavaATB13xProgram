package ex_10_For_Loop;

public class Lab111_Odd_Even_from_Top50 {
    public static void main(String[] args) {
        for(int i=1;i<=50;i++){
            if(i%2==0) {
                System.out.printf("%d is even ",i);
                System.out.println();
            }
            else{
                System.out.printf("%d is odd ",i);
                System.out.println();

            }
        }
    }
}
