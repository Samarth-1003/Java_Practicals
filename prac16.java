public class prac16 {

    private int num1;
    private int num2;

    public prac16(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add() {

        return this.num1 + this.num2;
    }

    public static void main(String[] args) {
        // Create objects
        prac16 calculator1 = new prac16(5, 10);
        prac16 calculator2 = new prac16(12, 18);

        // Add the numbers using the objects
        int sum1 = calculator1.add();
        int sum2 = calculator2.add();

        // Print the results
        System.out.println("The sum of the first two numbers is: " + sum1);
        System.out.println("The sum of the second two numbers is: " + sum2);
    }
}
