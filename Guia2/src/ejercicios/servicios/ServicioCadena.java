package ejercicios.servicios;

import ejercicios.entidades.Cadena;


public class ServicioCadena {
    
    public void mostrarVocales() {
        Cadena c1 = new Cadena();
        
        for (int i = 0; i < c1.getLongitud(); i++) {
            c1.getFrase().substring(i, i);
        }
}    }

