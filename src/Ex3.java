import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        String text;
        Scanner y=new Scanner(System.in);
        System.out.println("Enter a text");
        text=y.next();
        text=text.replace("i","!");
        text=text.replace("s","$");
        System.out.println(text);
    }
}
