import java.util.Scanner;

public class App {
    public static void ciclo() {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un número entre 0 y 10, o -1 para salir:");
            num = sc.nextInt();

            if (num == -1) {
                System.out.println("Programa finalizado.");
                break;
            } else if (num >= 0 && num <= 10) {
                tabla(num);
            } else {
                System.out.println("Solo se permiten números del 0 al 10.");
            }
        } while (true);

        sc.close();
    }

    public static void tabla(int num) {
        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido");
        ciclo(); 
    }
}