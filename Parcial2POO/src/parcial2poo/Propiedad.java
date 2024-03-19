package parcial2poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lymich
 */
public class Propiedad {
    protected String direccion;
    protected String tipoPropiedad;
    protected double precio;
    protected String estado;
    protected String habitacion;
    protected String baños;
    protected String metros;
    
    
    public Propiedad(String direccion, String tipo, double precio, String estado, String hab, String baños, String m){
        this.direccion = direccion;
        this.tipoPropiedad = tipo;
        this.precio = precio;
        this.estado = estado;
        this.habitacion = hab;
        this.baños = baños;
        this.metros = m;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String hab) {
        this.habitacion = hab;
    }
    
    public String getBaños() {
        return baños;
    }

    public void setBaños(String baño) {
        this.baños = baño;
    }
    
    public String getMetros() {
        return metros;
    }

    public void setMetros(String m) {
        this.metros = m;
    }
    
    public String toString() {
        return "Propiedad{direccion=" + direccion + ", tipo=" + tipoPropiedad + ", precio=" + precio + ", estado=" + estado + ", hab=" + habitacion + ", baños="+ baños + ", metros="+ metros +"}";
    }
}
