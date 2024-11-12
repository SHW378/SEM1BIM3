import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Númemro de filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.println("Númemro de columnas de la matriz: ");
        int cols = sc.nextInt();

        int[][] MAT = new int[filas][cols];
        
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                System.out.println("Ingrese el elemento ["+ f + ", " + c + "]: ");
                MAT[f][c] = sc.nextInt();
            }
        }
        System.out.println();// salto de linea

        int TMAT[][] = new int[filas][cols];
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                TMAT[f][c] = MAT[f][c];
            }
        }
        
        System.out.println("\n********* MATRIZ ORIGINAL **********");
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < cols; c++) {
                System.out.print(MAT[f][c] + " ");
            }
            System.out.println();
        }

        System.out.println("\n********* MATRIZ TRANSPUESTA **********");
        for (int f = 0; f < cols; f++) {
            for (int c = 0; c < filas; c++) {
                System.out.print(TMAT[c][f] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
