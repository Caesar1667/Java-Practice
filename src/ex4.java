import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = numInput.nextInt();
        System.out.println("Enter second number : ");
        int num2 = numInput.nextInt();
        int add = num1 + num2,
                sub = num1 - num2,
                mul = num1 * num2,
                div = num1 / num2,
                mod = num1 % num2;
        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " x " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " mod " + num2 + " = " + mod);
    }
}
