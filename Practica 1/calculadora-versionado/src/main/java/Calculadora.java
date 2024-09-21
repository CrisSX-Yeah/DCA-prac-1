import java.util.Scanner;

public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Exit");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Exiting...");
                break;
            }

            System.out.println("Enter first number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number:");
            int num2 = scanner.nextInt();

            int result = 0;
            switch (option) {
                case 1:
                    result = sumar(num1, num2);
                    break;
                case 2:
                    result = restar(num1, num2);
                    break;
                case 3:
                    result = multiplicar(num1, num2);
                    break;
                case 4:
                    try {
                        result = dividir(num1, num2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        calculate();
    }
}
