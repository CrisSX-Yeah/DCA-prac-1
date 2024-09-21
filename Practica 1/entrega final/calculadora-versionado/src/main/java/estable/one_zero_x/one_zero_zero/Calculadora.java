package estable.one_zero_x.one_zero_zero;

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
        return a / b;
    }

    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            int option = scanner.nextInt();

            if (option == 5) {
                System.out.println("Saliendo...");
                break;
            }

            System.out.println("Escribe el primer número:");
            int num1 = scanner.nextInt();
            System.out.println("Escribe el segundo número:");
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
                    result = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opción inválida. Inténtelo de nuevo.");
                    continue;
            }
            System.out.println("Resultado: " + result);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        calculate();
    }
}
