package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotapp.entidades.Mascota;


public class ServicioMascota {
    
    private Scanner sc;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota() {
        
        System.out.println("Introducir nombre");
        String nombre = sc.next();
        
        System.out.println("Introducir apodo");
        String apodo = sc.next();
        
        System.out.println("Introducir tipo");
        String tipo = sc.next();
        
        Mascota m = new Mascota(nombre, apodo, tipo);
      
        return m;
       
    }
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }
    public void mostrarMascotas() {
        
        System.out.println("Las mascotas actuales de las lista Mascotas son:");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
    }
    /**
     * 
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     */
    public void fabricaVenus(int cantidad) {
        
        for (int i = 0; i < cantidad; i++) {
            
            mascotas.add(new Mascota("Venus", "Venualda", "Callejera"));
        }
        
    }
    /**
     * Crea mascotas pidiendo datos por teclado
     * @param cantidad 
     */
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
    //TODO Añadir try and Catch
    public void actualizarMascota(int index) {
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }
    //Crea un nuevo objeto y lo pisa en base al índice
    public void actualizaMascota(int index) {
        Mascota m = crearMascota();
        
        mascotas.set(index, m);
    }
    
    public void eliminarMascota(int index) {
        mascotas.remove(index);
    }

}
