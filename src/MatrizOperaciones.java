import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizOperaciones {
    private List<int[][]> matrices;
    private Scanner scanner;

    public MatrizOperaciones(Scanner scanner) {
        this.scanner = scanner;
        this.matrices = new ArrayList<>();
    }

    public void agregarMatriz() {
        System.out.println("Introduce las dimensiones de la matriz:");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        System.out.println("Introduce los elementos de la matriz:");
        int[][] nuevaMatriz = MatrizUtils.leerMatriz(filas, columnas, scanner);
        matrices.add(nuevaMatriz);

        System.out.println("Matriz agregada:");
        MatrizUtils.imprimirMatriz(nuevaMatriz);
    }





    public void multiplicarMatricesSiEsPosible() {
        if (matrices.size() > 1) {
            int[][] resultado = matrices.get(0);
            for (int i = 1; i < matrices.size(); i++) {
                if (resultado[0].length != matrices.get(i).length) {
                    System.out.println("No se pueden multiplicar las matrices. El número de columnas de la matriz " + i + " debe ser igual al número de filas de la matriz " + (i+1) + ".");
                    return;
                }
                resultado = MatrizUtils.multiplicarMatrices(resultado, matrices.get(i));
                System.out.println("Matriz resultado de la multiplicación " + i + ":");
                MatrizUtils.imprimirMatriz(resultado);
            }
        } else {
            System.out.println("No hay suficientes matrices para realizar la multiplicación.");
        }
    }


    }


