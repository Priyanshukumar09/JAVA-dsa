

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tem in C :");
        float temC = input.nextFloat();
        float temF = ( temC * 9/5 ) + 32;
        System.out.print("The temperture in farhrenheit is :" + temF);
        input.close();
    }

}
