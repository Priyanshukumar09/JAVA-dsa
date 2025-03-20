package Alpha;

public class conditional {
    public static void main(String[] args) {
        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;
        System.out.println(x + " , " +y);

        int year = 2025;
        if (year%4 == 0 ) {
            System.out.println("leap year");
        }else{
            System.out.println("not a leap year");
        }
        
        // int n = 4;
        double tem = 103.5;

        if (tem>100) {
            System.out.println("fever");
        }else{
            System.out.println("negative");
        }
    }
}
