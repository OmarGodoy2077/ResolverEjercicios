import java.util.Scanner;

public class MatrizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las dimensiones de la primera matriz:");
        int m1 = scanner.nextInt();
        int n1 = scanner.nextInt();

        System.out.println("Introduce las dimensiones de la segunda matriz:");
        int m2 = scanner.nextInt();
        int n2 = scanner.nextInt();

        if (n1 != m2) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        System.out.println("Introduce los elementos de la primera matriz:");
        int[][] matrizA = MatrizUtils.leerMatriz(m1, n1, scanner);

        System.out.println("Introduce los elementos de la segunda matriz:");
        int[][] matrizB = MatrizUtils.leerMatriz(m2, n2, scanner);

        int[][] matrizResultado = MatrizUtils.multiplicarMatrices(matrizA, matrizB);
        MatrizUtils.imprimirMatriz(matrizResultado);
    }
}
