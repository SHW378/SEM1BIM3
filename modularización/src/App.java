import java.util.Scanner;
public class App {
public static int enSegundos(int horas , int minutos , int segundos){
    int segsal; 
    segsal = horas*3600 + minutos*60 + segundos;
    return segsal;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hr, min, seg, segFin;
        System.out.println("Ingrese hora, minuto y segundo de la hora de inicio");
        hr = sc.nextInt();
        min = sc.nextInt();
        seg = sc.nextInt();
        System.out.println("Ingrese hora, minuto y segundo de la hora de finalizacion");
        hr = sc.nextInt();
        min = sc.nextInt();
        seg = sc.nextInt();
        segFin = enSegundos(hr, min, seg);
        System.out.println("La duracion es de " + segFin + " segundos");
        sc.close();
    }
}