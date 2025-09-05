import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NaturalNUmbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();
        System.out.println("Enter the Second NUmber:");
        int number2 = sc.nextInt();

        while (number1<=number2){
            System.out.println(number1);
            number1++;
        }

    }
    }