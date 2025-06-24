package ex12_doWhile;

public class Lab126_while_doWhile_difference {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        do{
            System.out.println(a);
            a++;
        }
        while(a<0);
    }
}
