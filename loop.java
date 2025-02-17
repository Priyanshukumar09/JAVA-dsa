import java.util.Scanner;

public class loop {
    public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    // for(int a = 10 ; a <= 100 ; a += 10){
    //     System.out.println(a);
    System.out.print("enter the number");
    int num = in.nextInt();
    for (int i = 1; i <=  num; i++) {
        System.out.print(i);
        System.out.println("hello");
        
    }
    System.out.println("priyanshu");
    in.close();
    }
    }
