
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int TempNum = 1; TempNum <= 10; TempNum++) {
            System.out.println("Ingrese la temperatura #" + TempNum + ": ");
            int temperatura = sc.nextInt();
            if (temperatura > 100 || temperatura < -30) {
                System.out.println( "El  equipo puede fallar, programa terminano ");
                break;
            } else if (temperatura <= -10 || temperatura >= 80) {
                System.out.println("Advertencia: El equipo está llegando al limite");
                continue;
            }
                System.out.println("Temperaturas registrada: "+ temperatura + "°C. El equipo está sen condiciones perfectas");
            
    }
        sc.close();
}}