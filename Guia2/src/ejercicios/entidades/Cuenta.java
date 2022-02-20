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
package ejercicios.entidades;

import java.util.Scanner;

/**
 *
 * @author Fabián
 */
public class Cuenta {

    public long numeroCuenta;
    public long dni;
    public double saldoActual;
    // private String nombreApellido;
    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Cuenta() {
    }

    public Cuenta(long numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        //  this.nombreApellido = nombreApellido;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

//    public Cuenta crearCuenta() {
//
//        Cuenta c1 = new Cuenta();
//        System.out.println("Ingrese número de cuenta");
//        c1.setNumeroCuenta(sc.nextLong());
//        System.out.println("Ingrese su dni");
//        c1.setDni(sc.nextLong());
//        System.out.println("Ingrese saldo actual");
//        c1.setSaldoActual(sc.nextDouble());
//        return c1;
//    }
//
//    public double ingresar() {
//        System.out.println("Cuanta cantidad de dinero quiere ingresar");
//        double dinero = sc.nextDouble();
//        saldoActual = saldoActual + dinero;
//        System.out.println("Se ingresaron $" + dinero);
//        System.out.println("Su saldo actual es: $" + saldoActual);
//
//        return saldoActual;
//    }
//
//    public double retirar() {
//        double retiro = 0;
//        if (saldoActual != 0) {
//            System.out.println("Ingrese la cantidad de dinero que quiere retirar");
//            retiro = sc.nextDouble();
//            saldoActual = saldoActual - retiro;
//        } else {
//            saldoActual = 0;
//        }
//        System.out.println("Se extrajeron $" + retiro);
//        System.out.println("Su saldo es $" + saldoActual);
//        return saldoActual;
//
//    }
//
//    public double extraccionRapida() {
//        System.out.println("Ingrese la cantidad de dinero a extraer, puede retirar hasta el 20% de su saldo");
//        double retiroRapido = sc.nextDouble();
//        while (retiroRapido > saldoActual * 0.20) {
//            System.out.println("Solo puede retirar hasta el 20% de su saldo");
//            System.out.println("Ingrese un importe menor");
//            retiroRapido = sc.nextDouble();
//            if (retiroRapido <= saldoActual * 0.20) {
//                break;
//            }
//
//        }
//        saldoActual = saldoActual - retiroRapido;
//        System.out.println("Se retiraron " + retiroRapido);
//        System.out.println("Saldo actual: " + saldoActual);
//        return saldoActual;
//    }
//
//    public void consultarSaldo() {
//        System.out.println("Su saldo es " + saldoActual);
//    }
//
//    public void consultarDatos() {
//        System.out.println("Sus datos son: \n"
//                + "Numero de cuenta: " + numeroCuenta + "\n"
//                + "Dni: " + dni);
//    }
}
