/**
 * Genera un programa que divida dos números enteros y muestra el resultado.
 * los numeros se introducen por teclado.
 * 
 */
public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Error: División por cero no permitida.");
        } else {
            double resultado = (double) num1 / num2;
            System.out.println("El resultado de la división es: " + resultado);
        }

        scanner.close();
    }
}
