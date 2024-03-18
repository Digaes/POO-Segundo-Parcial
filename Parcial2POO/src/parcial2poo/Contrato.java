
package parcial2poo;

/**
 *
 * @author lymich
 */
public class Contrato {
    private int duracion;
    private float precio;
    private String condiciones;
    private Cliente cli;
    private Propiedad pro;
    
    Contrato(int duracion, float precio, String condiciones, Cliente cli, Propiedad pro){
        this.duracion = duracion;
        this.precio = precio;
        this.condiciones = condiciones;
        this.cli = cli;
        this.pro = pro;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
    
    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
    public Propiedad getPro() {
        return pro;
    }

    public void setPro(Propiedad pro) {
        this.pro = pro;
    }
    
}
