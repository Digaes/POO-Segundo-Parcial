package parcial2poo;


import java.util.ArrayList;



/**
 *
 * @author lymich
 */
public class Empleado extends Persona {
    protected long idEmpleado;
    protected String cargo;
    ArrayList<Propiedad> propiedadesGestionadas = new ArrayList<Propiedad>();
    
    public Empleado(String nombre, String apellido, long idEmpleado, String cargo, ArrayList<Propiedad> prop){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.propiedadesGestionadas = prop;
    }

    public void registrarPropiedadesGestionadas(Propiedad prop) {
        propiedadesGestionadas.add(prop);
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
