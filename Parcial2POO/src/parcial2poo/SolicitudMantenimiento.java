package parcial2poo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lymich
 */
public class SolicitudMantenimiento {
    protected String estado;
    protected Empleado gestor;
    protected Propiedad pro;
    protected Cliente cli;
    
    public SolicitudMantenimiento(String estado, Empleado emp, Propiedad pro, Cliente cli){
        this.estado = estado;
        this.gestor = emp;
        this.pro = pro;
        this.cli = cli;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Empleado getGestor() {
        return gestor;
    }

    public void setGestor(Empleado gestor) {
        this.gestor = gestor;
    }
    
    public Propiedad getPro() {
        return pro;
    }

    public void setPro(Propiedad pro) {
        this.pro = pro;
    }
    
    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
    
}