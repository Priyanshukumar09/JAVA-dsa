package Alpha;

import java.util.Scanner;

public class scinput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String answer = in.nextLine();
        
        System.out.println( "hello " + answer);
        System.out.print( "hey " + name);
        in.close();

    }
}
