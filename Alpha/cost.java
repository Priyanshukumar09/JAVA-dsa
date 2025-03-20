package Alpha;

import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the cost of Pencil");
        float pencil =in.nextFloat();
        System.out.println("Enter the cost of Pen");
        float pen =in.nextFloat();
        System.out.println("Enter the cost of Eraser");
        float eraser =in.nextFloat();
        float total = pen+pencil+eraser;
        System.out.println("the total bill is: "+ total);
        
        float gst = total + (0.18f * total);
        System.out.println( "New bill with 18% GSt is:-" +gst);
        in.close();
        // int $ = 10;
        // System.out.println($);
    }
}
