import java.util.Scanner;
public class ex2 {
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("Input first number : ");
        int num1 = numInput.nextInt();
        numInput = new Scanner(System.in);
        System.out.println("Input second number : ");
        int num2 = numInput.nextInt();
        int Sum = num1 + num2;
        System.out.println("Sum of 2 numbers are : " + Sum);
    }
}
