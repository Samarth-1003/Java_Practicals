class CustomException1 extends Exception {
    public CustomException1(String message) {
        super(message);
    }
}


class Example1 {

    public void performAction(int value) throws CustomException {
        if (value < 0) {
            throw new CustomException("Value cannot be negative");
        } else {
            System.out.println("Action performed successfully");
        }
    }
}


public class prac27 {
    public static void main(String[] args) {
        Example example = new Example();

        try {

            example.performAction(-5);
        } catch (CustomException e) {

            System.out.println("Caught CustomException: " + e.getMessage());
        }
    }
}