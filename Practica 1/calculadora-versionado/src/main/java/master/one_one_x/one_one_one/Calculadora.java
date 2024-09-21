package master.one_one_x.one_one_one;

import java.util.Scanner;

public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Sumar (double)");
            System.out.println("2. Restar (double)");
            System.out.println("3. Multiplicar (int)");
            System.out.println("4. Dividir (int)");
            System.out.println("5. Salir");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Escribe el primer número:");
            double num1 = scanner.nextDouble();
            System.out.println("Escribe el segundo número:");
            double num2 = scanner.nextDouble();

            // Initialize the result for double and int operations accordingly
            double resultDouble = 0;
            int resultInt = 0;

            switch (option) {
                case 1:
                    resultDouble = sumar(num1, num2);
                    System.out.println("Resultado: " + resultDouble);
                    break;
                case 2:
                    resultDouble = restar(num1, num2);
                    System.out.println("Resultado: " + resultDouble);
                    break;
                case 3:
                    resultInt = multiplicar((int) num1, (int) num2);
                    System.out.println("Resultado: " + resultInt);
                    break;
                case 4:
                    resultInt = dividir((int) num1, (int) num2);
                    System.out.println("Resultado: " + resultInt);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        calculate();
    }
}
