package Question;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // System.out.println("hello priyanshu");
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number :" );
        int num = in.nextInt();
        if (num <= 1) {
            System.out.println("Not Prime");
        }
        int c = 2;
         while (num < c ) {
            if (num % c == 0) {
                System.out.println(" Not Prime");
            }
            c++;
         }
        in.close();
    }
}
