import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = numInput.nextInt();
        for(int i = 1; i <= 10; i++){
            int newNum = num * i;
            System.out.println(num + " x " + i + " = " + newNum);
        }
    }
}
