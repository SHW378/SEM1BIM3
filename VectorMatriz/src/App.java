import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int filas = 0;
        int cols = 0;
        int[][] matriz = new int[filas][cols];

        //Almacenar valores en la matriz
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                System.out.println("Ingrese el elemento ["+ f + "," + c + "]: ");
                matriz[f][c] = sc.nextInt();
            }
        }
        System.out.println();// salto de linea
        System.out.println("********** TABLA DE VALORES **********");   
        System.out.println();// salto de linea

        //Visualizar la tabla de valores de forma matricial
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();// salto de linea
        }

        sc.close();
    }
}
