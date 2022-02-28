
import entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ServicioAlumno;

public class MainAlumno {

    /*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas.
En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bluce tendremos el siguiente método en la clase Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
Nota: encontrarán en Moodle un ejemplo de una Colección como Atributo.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Alumno> alumnos = new ArrayList();

        ServicioAlumno sa = new ServicioAlumno();

        String sino = "";

        do {

            Alumno a1 = sa.crearAlumno();

            alumnos.add(a1);
            System.out.println("Desea agregar otro alumno");
            sino = sc.next();

        } while (sino.equalsIgnoreCase("si"));

        System.out.println("Ingrese el alumno");
        String nombre = sc.next();
        Boolean encontrado = false;

        for (Alumno alumno : alumnos) {
            if (nombre.equalsIgnoreCase(alumno.getNombreAlumno())) {
                System.out.println("El promedio del alumno " + alumno.getNombreAlumno() + " es " + sa.notaFinal(alumno));
                encontrado = true;
                break;
            }

        }
        
        if(!encontrado) {
            System.out.println("No se encontró el alumno");
        }

    }

}
