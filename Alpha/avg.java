package Alpha;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = in.nextInt();
        System.out.println("Enter the number");

        int b = in.nextInt();
        System.out.println("Enter the number");
        int c = in.nextInt();

        int average = (a+b+c)/3;
        System.out.println("The average is ");
        System.out.println(average);
        in.close();

        // int A =10 ;
        // int B =10 ;
        // int C =10 ;
        // int N  = (A+B+C)/3;
        // System.out.println(N);
    }
}
