package Alpha;

import java.util.Scanner;

public class ternary{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = in.nextInt() ;
        String type = ((num%2) == 0)? "This is a Even number.":"This is a Odd number.";
        System.out.print(type);
        in.close();
    }
}