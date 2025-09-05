import java.util.Scanner;

public class ReverseNaturalnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first");
        int a = sc.nextInt();
        System.out.println("Second");
        int b = sc.nextInt();

        while (a>=b){
            System.out.println(a);
            a--;
        }

    }
}
