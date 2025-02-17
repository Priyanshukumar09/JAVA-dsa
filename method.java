import java.util.Scanner;

public class method {

    public static void main(String[] args){
        sum();
        greeting();
        int ans = diff();
        System.out.println(ans);
        String message = greet();
        System.out.println(message);
    }
    
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number :");
        int num1 = in.nextInt();
        System.out.println("enter the number :");
        int num2 = in.nextInt();
        int sum = num1 + num2 ;
        System.out.println("the sum is: " + sum );
        in.close();

    }
    static void greeting (){
    System.out.println("good night boss");
    }
    //  return  type is  intger
    static int diff(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number1 :");
        int num1 = in.nextInt();
        System.out.println("enter the number2 :");
        int num2 = in.nextInt();
        int diff =num1 - num2 ;
        in.close();
            return diff;
            
        
    }
    static String greet(){
    String greet = "how are you !";
        return greet;
    }
    

}