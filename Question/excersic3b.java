package Question;

import java.util.Scanner;

public class excersic3b {

    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name please! ");
        String name = in.nextLine();
        System.out.print("Hello " + name);
        in.close();
    }
}