import java.util.Scanner;

public class prac9 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a two floating values: ");
        float a = s.nextFloat();
        float b = s.nextFloat();

        if (a==b){
            System.out.println("The Values are Same");
        }
        else {
            System.out.println("The Values are not same");
        }

    }
}
