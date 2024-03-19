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
    
    public boolean añadirPropiedad(Propiedad propiedad,ArrayList<Propiedad> prop){
        boolean sw = true;
        for (int i = 0; i < prop.size(); i++) {
           if (prop.get(i).getDireccion().equals(propiedad.getDireccion())){
                JOptionPane.showMessageDialog(null, "Esta propiedad ya está añadida", "ERROR", 0);
                sw = false;
           } 
    }
        if (sw == true){
            prop.add(propiedad);
        }
        return sw;
    }
    
    public void modificarPropiedad(Propiedad propiedad){
        
    }
    
    public void eliminarPropiedad(Propiedad propiedad){
        
    }
}
