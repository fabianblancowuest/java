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
package ejercicios.servicios;

import ejercicios.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class ServicioCuenta {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
        public Cuenta crearCuenta() {

        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese número de cuenta");
        c1.setNumeroCuenta(sc.nextLong());
        System.out.println("Ingrese su dni");
        c1.setDni(sc.nextLong());
        System.out.println("Ingrese saldo actual");
        c1.setSaldoActual(sc.nextDouble());
        return c1;
    }

    public double ingresar(Cuenta c2) {
        System.out.println("Cuanta cantidad de dinero quiere ingresar");
        double dinero = sc.nextDouble();
        c2.setSaldoActual(c2.getSaldoActual() + dinero);
        System.out.println("Se ingresaron $" + dinero);
        System.out.println("Su saldo actual es: $" + c2.getSaldoActual());

        return c2.getSaldoActual();
    }

    public double retirar(Cuenta c2) {
        double retiro = 0;
        if (c2.getSaldoActual() != 0) {
            System.out.println("Ingrese la cantidad de dinero que quiere retirar");
            retiro = sc.nextDouble();
            c2.setSaldoActual(c2.getSaldoActual() - retiro);
        } else {
            c2.setSaldoActual(0);
        }
        System.out.println("Se extrajeron $" + retiro);
        System.out.println("Su saldo es $" + c2.getSaldoActual());
        return c2.getSaldoActual();
       
    }

    public double extraccionRapida(Cuenta c2) {
        System.out.println("Ingrese la cantidad de dinero a extraer, puede retirar hasta el 20% de su saldo");
        double retiroRapido = sc.nextDouble();
        while(retiroRapido > c2.getSaldoActual() * 0.20) { 
            System.out.println("Solo puede retirar hasta el 20% de su saldo");
            System.out.println("Ingrese un importe menor");
            retiroRapido = sc.nextDouble();
            if(retiroRapido <= c2.getSaldoActual() * 0.20) {
                break;
            }
       
        }
        c2.setSaldoActual(c2.getSaldoActual() - retiroRapido);
        System.out.println("Se retiraron " + retiroRapido);
        System.out.println("Saldo actual: " + c2.getSaldoActual());
        return c2.getSaldoActual();
    }

    public void consultarSaldo(Cuenta c2) {
        System.out.println("Su saldo es " + c2.getSaldoActual());
    }

    public void consultarDatos(Cuenta c2) {
        System.out.println("Sus datos son: \n"
                + "Numero de cuenta: " + c2.getNumeroCuenta() + "\n"
                + "Dni: " + c2.getDni());
    }
}
