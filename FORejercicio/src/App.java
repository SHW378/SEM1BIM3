import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int aprobado = 0;
        int reprobado = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese la nota: ");
            double nota = sc.nextDouble();
            if (nota >= 7.0) {
                aprobado++;
            } else {
                reprobado++;
            }
        }
            System.out.println("Cantidad de aprobados: " + aprobado);
            System.out.println("Cantidad de reprobados: " + reprobado);
            sc.close();
        }
}

