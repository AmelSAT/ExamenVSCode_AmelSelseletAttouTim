import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce la operación (suma o resta): ");
        String operacion = scanner.next();


        if (operacion.equalsIgnoreCase("suma")) {
            suma(num1, num2);
        } else if (operacion.equalsIgnoreCase("resta")) {
            resta(num1, num2);
        } else {
            System.out.println("Operación no reconocida.");
        }

        scanner.close();
    }

    //REALIZAMOS LA SUMA de los numeros
    public static void suma(double a, double b) {
        double resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

    //REALIZAMOS LA RESTA
    public static void resta(double a, double b) {
        double resultado = a - b;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}
