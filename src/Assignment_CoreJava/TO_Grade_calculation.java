package Assignment_CoreJava;

public class TO_Grade_calculation {
    public static void main(String[] args) {
        int marks =98;
        String grade=(marks>90)?"A+":(marks>75)?"A":(marks>60)?"B":(marks>40)?"C":"Fail";
        System.out.printf("Grade is %s",grade);
    }
}
