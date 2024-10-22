import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);     
        double n = 0;
        double estatura,suma = 0;
        char continuar = ' ';
        
        do{
            System.out.println("Ingrese el valor de la estatura: ");
            estatura = scanner.nextDouble();
            suma += estatura;
            n++;
            
            System.out.println("¿Desea seguir introduciendo datos? (s/n): ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's');
        if (continuar == 'n'){
            System.out.println("Se recibieron "+ n +" datos");
            System.out.println("La estatura promedio es: " + suma/n);
        } else {
            System.out.println("Opcion incorrecta");
        }
        scanner.close();
    }
}
