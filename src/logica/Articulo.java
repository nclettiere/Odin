package logica;

public class Articulo {
    private int codigo;
    private String nombre;
    private double precioCosto;

    public Articulo() {
    }

    public Articulo(int codigo, String nombre, double precioCosto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCosto = precioCosto;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    @Override
    public String toString() {
        return " Articulo{" + "codigo=" + codigo + ", nombre=" + nombre + ", precioCosto=" + precioCosto + '}';
    }
    
    
    
}
