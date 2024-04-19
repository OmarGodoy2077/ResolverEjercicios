import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrizUtils {
    public static int[][] leerMatriz(int filas, int columnas, Scanner scanner) {
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                while (true) {
                    try {
                        System.out.print("Introduce el elemento [" + i + "][" + j + "]: ");
                        if (scanner.hasNextInt()) {
                            matriz[i][j] = scanner.nextInt();
                            break;
                        } else {
                            System.out.println("Por favor, ingresa un número entero válido.");
                            scanner.next(); // Limpiar el buffer del escáner
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Error: " + e.getMessage());
                        scanner.next(); // Limpiar el buffer del escáner
                    }
                }
            }
        }
        return matriz;
    }

    public static int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
        int m = matrizA.length;
        int n = matrizB[0].length;
        int[][] resultado = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < matrizB.length; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
