import java.util.Scanner;

public class prac23 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = s.nextInt();
        long factorial = 1;
        for(int i=1; i<=a; ++i){
            factorial *= i;
        }
        System.out.println("Factorial of " + a + " is " + factorial);
    }


}
