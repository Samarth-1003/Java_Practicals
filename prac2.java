import java.util.Scanner;

public class prac2 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = s.nextInt();
        int b = s.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println("Addition: " + add);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
    }
}
