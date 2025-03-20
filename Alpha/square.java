package Alpha;

import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side is ");
        int side1 = in.nextInt();
        System.out.println("Enter the side is ");
        int side2 = in.nextInt();

        int area = side1*side2;
        System.out.println("The area of square is :" +area);
        in.close();

    }
}
