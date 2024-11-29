import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Escaner = new Scanner(System.in);
        //Arreglos
        String [] Frutas = new String [5];
        int [] Cantidades = new int [5];
        //Decision
        int Decision;
        String productoEliminar = " ";
        //Menu
        do {
            System.out.printf("Menú:%n1. Agrega producto%n2. Eliminar producto %n3. Mostrar inventario%n4. Salir%n");
            //Seleccionar una opcion
            System.out.print("Seleccione una opcion: ");
            Decision = Escaner.nextInt();
            Escaner.nextLine();
            switch (Decision) {
                case 1:
                    try {
                        AgregarProducto(Escaner, Frutas, Cantidades);
                    }
                    catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        EliminarProducto(Escaner, Frutas, Cantidades);
                    }
                    catch (Exception e ) {
                        System.out.println("Error: "+e.getMessage());
                    }
                    break;
                case 3:
                    MostrarProducto(Escaner, Frutas, Cantidades);
                    break;
                default:
                    System.out.println("opcion no valida");

            }
        }
        while (Decision != 4);
    }
    //2-Metodo para agregar frutas.
    public static void AgregarProducto(Scanner Escaner, String[] Frutas, int[] Cantidades) throws Exception {
        // Buscar espacio libre para agregar una fruta
        for (int i = 0; i < Frutas.length; i++) {
            if (Frutas[i] == null) { // Si el espacio está vacío
                //Ingresar nombre del producto
                System.out.print("Ingrese el nombre del producto: ");
                Frutas[i] = Escaner.next();
                //En caso de estar lleno
                if (i == 4){
                    throw new Exception("Inventario lleno. No se pueden agregar mas productos");
                }
                //Ingresar la cantidad
                System.out.print("Ingrese la cantidad del producto: ");
                Cantidades[i] = Escaner.nextInt();
                //Mensaje de exito
                System.out.println("Producto'" + Frutas[i] + "' agregado exitosamente");
                break;
            }
        }
    }
    //3-Metodo para eliminar productos
    public static void EliminarProducto(Scanner Escaner, String[] Frutas, int[] Cantidades) throws Exception {
        boolean EncontradoProducto = false;
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String productoEliminar = Escaner.nextLine();
        for (int i = 0; i < Frutas.length; i++) {
                if (Frutas[i] != null && Frutas[i].equalsIgnoreCase(productoEliminar)) {
                    Frutas[i] = null;
                    Cantidades[i] = 0;
                    System.out.println("Producto'" + productoEliminar + "' eliminado exitosamente");
                    EncontradoProducto = true;
                    break;
                }
                if (!EncontradoProducto) {
                    throw new Exception("El producto '" + productoEliminar + "' no existe en el inventario.");
                }
        }
    }
    public static void MostrarProducto(Scanner Escaner, String[] Frutas, int[] Cantidades)  {
        System.out.println(" Inventario actual:");
        for (int i = 0; i < Frutas.length; i++) {
            System.out.println("-"+ Frutas[i]+": "+ Cantidades[i]);
        }
        System.out.println();
    }
}