package colecciones;

import java.util.ArrayList;

public class Colecciones {
 
    public static void main(String[] args) {
        
        String nombresArray[] = new String[4];
        
        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Caniche" + (i + 1);
        }
        
        for (String nombresArray1 : nombresArray) {
            System.out.println(nombresArray1);
        }
        
        //Colecciones
        ArrayList<String> nombresArrayList = new ArrayList();
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList);
        
       
        
        
       
    }
    
}
