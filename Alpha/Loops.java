package Alpha;

public class Loops {
    public static void main(String[] args){
        for(int i=0; i<5; i++) {
        System.out.println("Hello");
        i+=2;
        }

        for (int j = 1; j <= 4; j++) {
            System.out.println("****");
        }
        int num = 10938;
        while (num>0) {
           int lastnum = num %10;
           System.out.print(lastnum);
           num = num / 10;
        }


        }
}
