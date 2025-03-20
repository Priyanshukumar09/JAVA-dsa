package Question;

import java.util.Scanner;

public class test {
public static void main(String[] args){

    // int i = 1 ;
    // int k ;
    // System.out.println();
    // System.out.println("***-----print the numbers 1 to 10-----***");
    // for (i = 1; i <= 10; i++) {
    //     System.out.println(i);
    // }
    // System.out.println();
    // System.out.println("***-----multiple of two-----***");
    // System.out.println();
    // for (int j = 0; j <= 10; j = j + 2) {
    //     System.out.println(j);
    // }
    // System.out.println();
    // System.out.println("***-----Table-----***");
    // System.out.println();
    // for(k= 1 ; k <= 10 ; k++){
    //     System.out.println( " 2 * " + k + " = " + 2*k );
    // }


    // for (int i = 1; i <= 5; i++) {
    //     for( int j = 1 ; j <= i ; j++){

    //         System.out.print("*");

    //     }
    //     System.out.println();
    // }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt() ;
        for(int i = 1 ; i <= 10 ; i++ ){
            System.out.print(i * n +" ");
        }
    in.close();
}

}

