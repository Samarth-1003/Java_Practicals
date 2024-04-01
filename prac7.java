import java.util.Scanner;

public class prac7 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Temperature in Celsius");
        double temp  = s.nextDouble();

        double Fahrenhit = ((temp*9)/5) + 32;
        System.out.println("Temperature in Fahrenhit " + Fahrenhit);
    }
}
