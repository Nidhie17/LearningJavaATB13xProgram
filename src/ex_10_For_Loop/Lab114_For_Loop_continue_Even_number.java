package ex_10_For_Loop;

public class Lab114_For_Loop_continue_Even_number {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            if(i%2==0){
                continue;
            }
            System.out.printf("%d is Odd number",i);
            System.out.println();
        }
    }
}
