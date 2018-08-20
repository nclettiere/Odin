package logica;

import java.util.ArrayList;

public class Articulos {
    private final ArrayList<Articulo> lista;

    public Articulos() {
        lista = new ArrayList<>();
    }
    
    public void insertar(Articulo articulo) {
        lista.add(articulo);
    }
    
    public boolean eliminar(Articulo articulo) {
        if(encontrar(articulo)) {
            lista.remove(articulo);
            return true;
        }else {
            return false;
        }
    }        
    public boolean encontrar(Articulo articulo) {
        return lista.contains(articulo);
    }    
    public Articulo devolver(int i) {
        return (lista.get(i));
    }    
    public boolean esVacia() {
        return lista.isEmpty();
    }   
    public int cantidad() {
        return lista.size();
    }    
    
    public int cantNacionales() {
        int nacionales = 0;
        for (Articulo actual : lista){
            if(actual instanceof Nacional)
                nacionales++;
        }
        return nacionales;
    }  
    
    public int cantImportados() {
        int importados = 0;
        for (Articulo actual : lista){
            if(actual instanceof Importado)
                importados++;
        }
        return importados;
    }    
    public Articulo articuloCaro() {
        double precioActual = 0;
        int posicion = 0;
         
        for (int i = 0; i < lista.size(); i++){
            if(devolver(i) != null) {
                double precio = devolver(i).getPrecioCosto();
                if(precio > precioActual) {
                    posicion = i;
                    precioActual = precio;
                }else {
                    precioActual = precio;
                }
            }
        }
        
        return lista.get(posicion);
    } 
    
    public Articulo devolverCodigo(int codigo) {
        for(Articulo a : lista) {
            if(codigo ==  a.getCodigo()) {
               return a; 
            }
        }
        return null;
    }
    
    public String[] devolverString(int codigo) {
        String[] articulo = new String[7];
        for(Articulo a : lista) {
            System.out.println(a.getCodigo());
            if(codigo ==  a.getCodigo()) {
                articulo[0] = a.getNombre();
                articulo[1] = String.valueOf(a.getPrecioCosto());
                if(a instanceof Nacional) {
                    articulo[2] = "Nacional";
                    articulo[3] = String.valueOf(((Nacional) a).getDepartamento());
                    articulo[4] = String.valueOf(((Nacional) a).isSubsidiado());
                    articulo[5] = "-";
                    articulo[6] = "-";
                }else if(a instanceof Importado) {
                    articulo[2] = "Importado";
                    articulo[3] = "-";
                    articulo[4] = "-";
                    articulo[5] = String.valueOf(((Importado) a).getAnioImportacion());
                    articulo[6] = String.valueOf(((Importado) a).getImpuesto());
                }
                return articulo;
            }
        }
        return null;
    }
    

    @Override
    public String toString() {
        return ""+ lista + "";
    }
}
