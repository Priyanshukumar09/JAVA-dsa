import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number A");
        int a = in.nextInt();
        System.out.println("Enter the number B");
        int b = in.nextInt();
        System.out.println("Enter the number C");
        int c = in.nextInt();
        if (a>b) {
            System.out.println(a + " is greater");
        }
         else if (b>c) {
            System.out.println(b + " is greater");
        } else {
            System.out.println(c + " is greater");
        }
        in.close();
        // System.out.println("error in number");
    }
}
