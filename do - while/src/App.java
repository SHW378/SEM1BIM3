import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pares = 0;
        int impares = 0;
        int i = 1;
        do{
            if (i% == 0)
            pares ++;
            else 
            impares ++;
            i++;
        } while (i <= n);
        System.out.println("El total de pares es: "+ pares + "y el total de impares es: "+ impares);
    }
}
