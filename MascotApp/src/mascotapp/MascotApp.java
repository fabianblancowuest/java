package mascotapp;

import mascotapp.entidades.Mascota;
import mascotapp.servicios.ServicioMascota;

public class MascotApp {

    public static void main(String[] args) {

//        ServicioMascota sm = new ServicioMascota();
//        
//        sm.fabricaMascota(2);
//        sm.mostrarMascotas();
//        sm.actualizaMascota(0);
//        sm.mostrarMascotas();
//        
//        sm.eliminarMascota(0);
//        sm.mostrarMascotas();
        try {
            double resul = 10 / 0;
            System.out.println("Exito");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético");
        } catch (Exception e) {
            System.out.println("Error exception");
        } finally {
            System.out.println("Terminamos");
        }

    }

}
