import java.util.Scanner;

/**
 * Crea un programa que sume 2 números que sean ingresado por pantalla el
 * resultado
 * muestralo por consola.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Declaración de variables
        int numero1;
        int numero2;
        int suma;

        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        numero1 = scanner.nextInt();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        numero2 = scanner.nextInt();

        // Calcular la suma de los dos números
        suma = numero1 + numero2;

        // Mostrar el resultado por consola
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
