import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner y=new Scanner(System.in);

        StringBuilder text;
        System.out.println("Enter a text");
        text= new StringBuilder(y.next());
        text.reverse();
        System.out.println(text);
    }
}
