import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        int num1 = input.nextInt();
        System.out.print("Enter the second number :");
        int num2 = input.nextInt();

        System.out.print("The sum is: ");
        System.out.println(num1 + num2);
        input.close();

    }
}
