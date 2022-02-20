/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo y número de cuenta.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package ejercicios;

import ejercicios.entidades.Cuenta;
import ejercicios.servicios.ServicioCuenta;
import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Cuenta c2 = new Cuenta();
        ServicioCuenta servCuenta = new ServicioCuenta();

        c2 = servCuenta.crearCuenta();
        servCuenta.ingresar(c2);
//        c2 = c2.crearCuenta();
//        c2.ingresar();
        servCuenta.retirar(c2);
        servCuenta.extraccionRapida(c2);
        servCuenta.consultarSaldo(c2);
        servCuenta.consultarDatos(c2);
    }

}
