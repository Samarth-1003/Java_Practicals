import java.util.Scanner;

public class prac3 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Three Numbers");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();

        if (n1>n2 && n1>n3) {
            System.out.println("N1 is the Greatest");
        }
        else if (n2>n1 && n2>n3){
            System.out.println("N2 is the Greatest");
        }
        else{
            System.out.println("N3 is the Greatest");
        }
    }
}
