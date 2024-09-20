public class Calculadora {

    // Function to sum two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Main function to test the sum function
    public static void main(String[] args) {
        // Test case 1
        int result1 = sum(5, 10);
        System.out.println("Sum of 5 and 10 is: " + result1);  // Expected output: 15

        // Test case 2
        int result2 = sum(-3, 7);
        System.out.println("Sum of -3 and 7 is: " + result2);  // Expected output: 4

        // Test case 3
        int result3 = sum(100, 200);
        System.out.println("Sum of 100 and 200 is: " + result3);  // Expected output: 300
    }
}
