import java.util.Scanner;

public class occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        System.out.println("enter the number");
        int num  = in.nextInt();
        System.out.println("enter the occurance number");
        int occ = in.nextInt();
        int n = 0 ;
        while (num > n) {
            int rem = num %10;
            if (rem == occ) {
                count++;
            }
            num = num / 10;
        }
        System.out.println("The number "+ occ+" is occured is: " + count + " times only..");
        in.close();
    }
}
