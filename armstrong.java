// import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        // System.out.println(isarmstron(n));

        // To check three digit Armstrong numbere between 1 to 999.
        for (int i = 1; i < 1000; i++) {
            if (isarmstron(i)) {
                System.out.print(i + " ");
            }
        }
    }
    static boolean isarmstron(int n){
        int sum = 0;
        int Original = n ;
        while (n > 0 ) {
            int rem = n % 10 ;
            n = n / 10 ;
            sum = sum + rem*rem*rem;
        }
         return sum == Original;
        // if (sum == Original) {
        //     return true;
        // }
        // return false;
    }
}