import java.util.Scanner;

public class prac13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = s.nextInt();

        for (int i = 1; i<=10; i++){
            System.out.println("" + n + " X " + "" + i + " = " + "" + n*i);
            //  System.out.prinf("%d X %d = %d " , n, i, n*i);
        }
    }
}
