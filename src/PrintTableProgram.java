import java.util.Scanner;

public class PrintTableProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the starting numberL");
        int a = sc.nextInt();
        System.out.println("enter end number:");
        int b = sc.nextInt();
        System.out.println("Enter the table number:");
        int c =sc.nextInt();

        while (a<=b){
            System.out.println(a+"*"+c+"="+(a*c));
            a++;
        }
    }
}
