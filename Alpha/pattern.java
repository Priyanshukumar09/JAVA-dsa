package Alpha;

public class pattern {
    public static void main(String[] args) {

        // To print the numbers patterns

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // To print the numbers patterns

        int num = 5 ;
        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num -i +1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // To print the star patterns

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // To print the star patterns

        int num1 = 5 ;
        for (int i = 0; i < num1; i++) {
            for (int j = 1; j < num1 -i +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // To print the alphabet patterns

        char ch = 'A';
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
