
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {

    /*Se necesita una aplicación para una tienda en la cual queremos almacenar los
distintos productos que venderemos y el precio que tendrán. Además, se necesita
que la aplicación cuente con las funciones básicas.
Estas las realizaremos en el main. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        HashMap<String, Double> productos = new HashMap();
        
        boolean seguir = true;

        do {
            mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    introducirElemento(productos);
                    break;
                case 2:
                    modificarPrecio(productos);
                    break;
                case 3:
                    eliminarProducto(productos);
                    break;
                case 4:
                    mostrarProductos(productos);
                    break;
                case 5:
                    seguir = false;
                    break;
                default:
                 System.out.println("La opción ingresa no se encuentra en el menú");

            }

        } while (seguir);
    }

    public static void mostrarMenu() {
        System.out.println("Seleccione lo que desea hacer");
        System.out.println("1 - Introducir un elemento");
        System.out.println("2 - Modificar su precio");
        System.out.println("3 - Eliminar un producto");
        System.out.println("4 - Mostrar todos los productos");
        System.out.println("5 - Salir");
    }

    public static void introducirElemento(HashMap<String, Double> productos) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese los valores del producto");
        productos.put(sc.next(), sc.nextDouble());
    }

    public static void modificarPrecio(HashMap<String, Double> productos) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre del producto");
        String clave = sc.next();
        if (productos.containsKey(clave)) {
            System.out.println("Ingrese el nuevo precio");
           
            productos.replace(clave, sc.nextDouble());
        } else {
            System.out.println("No se encontró el producto");
        }
 
    }
    
    public static void eliminarProducto(HashMap<String, Double> productos) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String clave = sc.next();
        
        if (productos.containsKey(clave)) {
            productos.remove(clave);
        } else {
            System.out.println("No se encontró el producto");
        }
    }
    
    public static void mostrarProductos(HashMap<String, Double> productos) {
        
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " , precio: " + entry.getValue());
            
        }
    }

}
