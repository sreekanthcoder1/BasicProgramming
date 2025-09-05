import java.util.Scanner;

public class ReversePrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter End Number:");
        int b = sc .nextInt();
        System.out.println("Enter Row Number:");
        int c = sc.nextInt();

        while (a>=b){
            System.out.println(a+"*"+c+"="+(a*c));
            a--;
        }

    }
}
