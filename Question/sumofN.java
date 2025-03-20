package Question;

public class sumofN {
    public static void main(String[] args){
        
       int val = 1;
       int n = 6;
       int sum = 0;
       while (val <= n ) {
        sum = sum +val;
        val++;
       }
    //    System.out.println(sum);
    //    for (int i = 1; i < 11; i++) {
    //     // System.out.println( +  i % 2== 0  );
    //     if (i%2 == 0) {
    //         // System.out.print("even number : ");
    //         System.out.println("Even number is : " + i );
    //     }
    //     else 
    //     System.out.println("not a Even number :" + i);
    //    }

    for (int i = 4; i >= 1; i--) {
        for (int j = 4; j >= i; j--) {
        System.out.print("*");
            
        }
        System.out.println();
    }


    }
    
}
