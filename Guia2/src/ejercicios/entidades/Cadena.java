package ejercicios.entidades;


public class Cadena {
    
    private String frase;
    private Integer longitud;

    public Cadena() {
        this.longitud = frase.length();
    }

    public Cadena(String frase) {
        this.longitud = frase.length();
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }
    
    

}