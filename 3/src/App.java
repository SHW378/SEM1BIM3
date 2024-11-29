import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[5]; // arreglo de las frutas
        int[] cantidades = new int[5]; // arreglo de las cantidades de las frutas
        boolean procesoTerminado = false;
        while (!procesoTerminado) {
            var decision = mostrarMenu(scanner);
            switch (decision) {
                case '1':
                    var frutaAgregar = agregarProducto(scanner);
                    var cantidad = agregarCantidad(scanner);
                    boolean limiteExcedido = true;
                    for (int i = 0; i < frutas.length; i++) {
                        if (frutas[i] == null) {
                            limiteExcedido = false;
                            frutas[i] = frutaAgregar;
                            cantidades[i] = cantidad;
                            System.out.println("La fruta se agrego con exito!");
                            break;
                        } else {
                            continue;
                        }
                    }
                    if (limiteExcedido) {
                        System.out.println("El limite de frutas se ha alcanzado!");
                    }
                    break;
                case 2:
                    try {
                        var frutaEliminar = eliminarProducto(scanner);
                        var posicionFruta = buscarFruta(scanner, frutaEliminar, frutas);
                        if (posicionFruta >= 0) {
                            frutas[posicionFruta] = null;
                            cantidades[posicionFruta] = 0;
                            System.out.println("La fruta se elimino con exito!");
                        }
                    } catch (Exception e) {
                        System.out.println("Hubo un error, La fruta probablemente no existe!");
                    }
                    break;
                case 3:
                    mostrarInventario(scanner, frutas, cantidades);
                    break;
                case 4:
//                    procesoTerminado = true;
                    System.exit(150);
                    break;
                default:
                    break;
            }
        }
    }
    public static String agregarProducto(Scanner scanner) {
        System.out.println("Ingrese el nombre del producto a agregar: ");
        return scanner.next();
    }
    public static String eliminarProducto(Scanner scanner) {
        System.out.println("Ingrese el nombre del producto a eliminar: ");
        return scanner.next();
    }
    public static int buscarFruta(Scanner scanner, String frutaBuscar, String[] frutas) {
        for (int i = 0; i < frutas.length; i++) {
            if (frutas[i].equalsIgnoreCase(frutaBuscar)) {
                return i;
            } else {
                continue;
            }
        }
        return -1;
    }
    public static int agregarCantidad(Scanner scanner) {
        System.out.println("Ingrese la cantidad del producto:");
        return scanner.nextInt();
    }
    public static void mostrarInventario(Scanner scanner, String[] frutas, int[] cantidades) {
        System.out.println("== INVENTARIO ACTUAL ==");
        for (int i = 0; i < frutas.length; i++) {
            System.out.printf("- %s: [%d] ", frutas[i], cantidades[i]);
        }
        System.out.println();
    }
    public static int mostrarMenu(Scanner scanner) {
        System.out.println("""
                == MENU ==
                1. Agregar producto\s
                2. Eliminar producto
                3. Mostrar inventario
                4. Salir del programa
               \s
                Selecciona una opcion:\s
               \s""");
        return scanner.nextInt();
    }
}
