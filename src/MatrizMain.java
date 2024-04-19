import java.util.Scanner;

public class MatrizMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MatrizOperaciones operaciones = new MatrizOperaciones(scanner);

        System.out.print("¿Cuántas matrices deseas operar?: ");
        int cantidadMatrices = scanner.nextInt();

        for (int i = 0; i < cantidadMatrices; i++) {
            System.out.println("Ingresa los datos para la matriz " + (i + 1) + ":");
            operaciones.agregarMatriz();
        }


        operaciones.multiplicarMatricesSiEsPosible();

        scanner.close();
    }
}
