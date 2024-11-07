import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite un valor para la posicion: "+ i + "\n");
            numeros[i] = sc.nextDouble();
    }
    for (int i = numeros.length -1; i >= 0; i--) {
        System.out.println("El Valor guardado en la posicion: "+ i + " es: " + numeros[i]);
    }
    System.out.println("Favor ingrese dato a BUSCAR en el vector:");
    double Buscar = sc.nextDouble();
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == Buscar) {
            System.out.println("El valor guardado esta en la posicion: " + i );
        }           
     if (numeros[1] != Buscar) {
            System.out.println("No se encontro el valor");
        }
    }
        sc.close();
}}
