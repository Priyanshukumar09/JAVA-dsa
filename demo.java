import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a name :");
        String name = input.nextLine();

        System.out.print("Please enter the numbers:");
        int rollno = input.nextInt();

        System.out.println("your age is : " + rollno);
        System.out.println("and : " + name);
        input.close();
    }
}