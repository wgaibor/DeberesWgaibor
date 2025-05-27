/**
 * Crea un programa que multiplique dos números enteros y muestre el resultado
 * por consola.
 * El programa debe solicitar los números al usuario.
 */
public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int resultado = numero1 * numero2;

        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}
