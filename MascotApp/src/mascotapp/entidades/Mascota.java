package mascotapp.entidades;

public class Mascota {

    private String nombre;
    private String apodo;
    private String tipo;
    private Integer edad;
    private Boolean cola;
    private String raza;
    private String color;
    private Integer energia;

    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.energia = 1000;

    }

    public Mascota(String nombre, String apodo, String tipo, Integer edad, Boolean cola, String raza, String color) {
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho")) {
            this.tipo = tipo;
        }
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.color = color;
        this.energia = 1000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 2) {
            this.nombre = nombre;
        }

    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getCola() {
        return cola;
    }

    public void setCola(Boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param energiaRestar
     * @return energia
     */
    public int pasear(Integer energiaRestar) {

        this.energia -= energiaRestar;

        return energia;
    }
    /**
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(Integer energiaRestar, Integer vueltas) {
        for (int i = 0; i < vueltas; i++) {
            this.energia -= energiaRestar;
        }

        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", color=" + color + ", energia=" + energia + '}';
    }

}
