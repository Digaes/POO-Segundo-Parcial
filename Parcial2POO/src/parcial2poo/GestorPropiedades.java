package parcial2poo;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author lymich
 */
public class GestorPropiedades {
    
    public GestorPropiedades(){
        
    }
    
    public void añadirPropiedad(Propiedad propiedad,ArrayList<Propiedad> prop){
        boolean sw = true;
        for (int i = 0; i < prop.size(); i++) {
           if (prop.get(i).getDireccion().equals(propiedad.getDireccion())){
                JOptionPane.showMessageDialog(null, "Esta propiedad ya está añadida", "ERROR", 0);
                sw = false;
           } 
    }
        if (sw){
            prop.add(propiedad);
        }
    }
    
    public void modificarPropiedad(Propiedad propiedad, ArrayList<Propiedad> prop){
        
    }
    
    public void eliminarPropiedad(String direccion, ArrayList<Propiedad> prop){
        boolean sw = true;
        for (int i = 0; i < prop.size(); i++) {
           if (prop.get(i).getDireccion().equalsIgnoreCase(direccion)){
                sw = false;
                prop.remove(i);
                JOptionPane.showMessageDialog(null, "Esta propiedad fue eliminada con éxito", "ERROR", 0);
           } 
    }
        if (sw){
            //notificacion no existe
        }
    }
}
