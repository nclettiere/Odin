/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author alumno
 */
public class Nacional extends Articulo  {
    private String departamento;
    private boolean subsidiado;

    public Nacional(String departamento, boolean subsidiado, int codigo, String nombre, double precioCosto) {
        super(codigo, nombre, precioCosto);
        this.departamento = departamento;
        this.subsidiado = subsidiado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isSubsidiado() {
        return subsidiado;
    }

    public void setSubsidiado(boolean subsidiado) {
        this.subsidiado = subsidiado;
    }
    
    public double precioVenta() {
        return 0;
    }

    @Override
    public String toString() {
        return "Nacional{" + "departamento=" + departamento + ", subsidiado=" + subsidiado + super.toString() + '}';
    }


}
