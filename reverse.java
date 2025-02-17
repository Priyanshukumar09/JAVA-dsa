import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number is :");
        int num = in.nextInt();
        int n =0;
        int ans = 0;
        while (num > n) {
            int rem = num % 10 ;
        num = num / 10;
        ans = ans * 10 + rem;
        }
        System.out.println(ans);
        in.close();
    }

}
