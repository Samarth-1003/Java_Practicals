import java.util.Scanner;

public class prac5 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = s.nextInt();

        if (a % 2 == 0){
            System.out.println("Number" + a + " is even");
        }
        else {
            System.out.println("Number" + a + " is odd");
        }


    }
}
