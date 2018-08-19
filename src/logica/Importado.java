package logica;

public class Importado extends Articulo {
    private double impuesto;
    private int anioImportacion;

    public Importado(double impuesto, int anioImportacion, int codigo, String nombre, double precioCosto) {
        super(codigo, nombre, precioCosto);
        this.impuesto = impuesto;
        this.anioImportacion = anioImportacion;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public int getAnioImportacion() {
        return anioImportacion;
    }

    public void setAnioImportacion(int anioImportacion) {
        this.anioImportacion = anioImportacion;
    }
    
    public double precioVenta() {
        return 0;
    }

    @Override
    public String toString() {
        return "Importado{" + "impuesto=" + impuesto + ", anioImportacion=" + anioImportacion +  super.toString() + '}';
    }
}
