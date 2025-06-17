package ex_10_For_Loop;

public class Lab113_For_Loop_Continue {
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i==5||i==10||i==15||i==20||i==25||i==30){
                continue;
            }
            System.out.println(i);
        }
    }
}
