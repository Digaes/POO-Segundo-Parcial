package parcial2poo;


import java.util.ArrayList;



/**
 *
 * @author lymich
 */
public class Cliente extends Persona {
    private long idCliente;
    private String tipoCliente;
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();
    private ArrayList<SolicitudMantenimiento> solMantenimiento = new ArrayList<SolicitudMantenimiento>();
    
    public Cliente(String nombre, String apellido, long idCliente, String tipoCliente, ArrayList<Contrato> cont, ArrayList<SolicitudMantenimiento> sol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idCliente = idCliente;
        this.tipoCliente = tipoCliente;
        this.contratos = cont;
        this.solMantenimiento = sol;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public void registrarContratos(Contrato cont) {
        contratos.add(cont);
    }
    
    public void registrarSolicitudes(SolicitudMantenimiento sol) {
        solMantenimiento.add(sol);
    }
    
}
