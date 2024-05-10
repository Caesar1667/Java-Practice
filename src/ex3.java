import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int num1 = numInput.nextInt();
        System.out.println("Enter second number  : ");
        int num2 = numInput.nextInt();

        int mult = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + mult);
    }
}
