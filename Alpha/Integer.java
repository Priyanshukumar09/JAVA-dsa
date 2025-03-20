package Alpha;

public class Integer {
    public static void main(String[] args) {
        int Evensum = 0;
        int Oddsum = 0;
        for(int i =0 ; i<=10; i++){
            if (i%2 == 0) {
                Evensum += i;
            }else{
                Oddsum +=i;
            }
        }
        System.out.println(Evensum + " , " + Oddsum);
        System.out.println(Evensum+Oddsum);

    }
}
