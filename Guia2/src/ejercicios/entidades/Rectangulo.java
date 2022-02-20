/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Rectangulo {
    private double base = 25;
    private double altura = 30;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public Rectangulo crearRectangulo() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Rectangulo r1 = new Rectangulo();
        System.out.println("Ingrese base del rectángulo");
        r1.setBase(sc.nextDouble());
        System.out.println("Ingrese altura del rectángulo");
        r1.setAltura(sc.nextDouble());
        return r1;
        
    }
    
    public double calcularSuperficie() {
        double superficie = base * altura;
        return superficie;
    }
    
    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }
    
    public void dibujar(){
        for(int i=0; i<this.base; i++){
        System.out.print("*");
        }
        System.out.println(" ");
        for(int i=0; i<this.altura-2; i++){
          for(int j=0; j<this.base; j++){
              if(j==0) {
                  System.out.print("*");
              } else if(j==this.base-1){
                  System.out.println("*");
              } else {
                  System.out.print(" ");
              }
          }
        }
//        for(int i=0; i<this.base ;i++){  
//        System.out.print("*");}
        
    }

}
