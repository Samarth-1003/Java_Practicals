import java.util.Scanner;

public class prac6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Kilometers: ");
        double km = s.nextDouble();

        double Miles = km / 1.6;
        System.out.println("Miles = " + Miles);
    }
}
