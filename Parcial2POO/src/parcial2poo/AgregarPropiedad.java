
package parcial2poo;

import java.util.ArrayList;

/**
 *
 * @author lymich
 */
public class AgregarPropiedad extends javax.swing.JPanel {
    
    static ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
    
    public AgregarPropiedad() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTipo = new javax.swing.ButtonGroup();
        GroupEstado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHabitaciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBaños = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        comboEstado = new javax.swing.JComboBox<>();
        comboTipo = new javax.swing.JComboBox<>();
        btnMostrar1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel1.setText("Dirección");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        txtDireccion.setFont(new java.awt.Font("Arial Unicode MS", 0, 15)); // NOI18N
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 242, -1));

        jLabel2.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel2.setText("Tipo de propiedad");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        txtPrecio.setFont(new java.awt.Font("Arial Unicode MS", 0, 15)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 242, -1));

        jLabel3.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel3.setText("Precio");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel4.setText("Estado");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        txtHabitaciones.setFont(new java.awt.Font("Arial Unicode MS", 0, 15)); // NOI18N
        txtHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHabitacionesKeyTyped(evt);
            }
        });
        add(txtHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 150, -1));

        jLabel5.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel5.setText("Número de habitaciones");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        txtBaños.setFont(new java.awt.Font("Arial Unicode MS", 0, 15)); // NOI18N
        txtBaños.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBañosKeyTyped(evt);
            }
        });
        add(txtBaños, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 150, -1));

        jLabel6.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel6.setText("Número de baños");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Unicode MS", 0, 16)); // NOI18N
        jLabel7.setText("Metros cuadrados");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, -1, -1));

        txtMetros.setFont(new java.awt.Font("Arial Unicode MS", 0, 15)); // NOI18N
        txtMetros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMetrosKeyTyped(evt);
            }
        });
        add(txtMetros, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 150, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Vendido", "Alquilado" }));
        add(comboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", "Local Comercial" }));
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });
        add(comboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        btnMostrar1.setText("jButton1");
        btnMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrar1ActionPerformed(evt);
            }
        });
        add(btnMostrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHabitacionesKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtHabitacionesKeyTyped

    private void txtBañosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBañosKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBañosKeyTyped

    private void txtMetrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMetrosKeyTyped
        Character c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMetrosKeyTyped

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        if(!txtDireccion.getText().isEmpty()&&!comboTipo.getSelectedItem().toString().isEmpty()&&!txtPrecio.getText().isEmpty()&&!comboEstado.getSelectedItem().toString().isEmpty()
                &&!txtHabitaciones.getText().isEmpty()&&!txtBaños.getText().isEmpty()&&!txtMetros.getText().isEmpty()){
            String direccion = txtDireccion.getText();
            Propiedad prop = new Propiedad(txtDireccion.getText(),comboTipo.getSelectedItem().toString(),Double.parseDouble(txtPrecio.getText()),comboEstado.getSelectedItem().toString(),
            txtHabitaciones.getText(), txtBaños.getText(), txtMetros.getText());
            GestorPropiedades gestor = new GestorPropiedades();
            gestor.añadirPropiedad(prop,propiedades);
            
            txtDireccion.setText("");
            txtPrecio.setText("");
            txtHabitaciones.setText("");
            txtBaños.setText("");
            txtMetros.setText("");
            System.out.println("Ingresado correctamente");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    private void btnMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrar1ActionPerformed
        String resultado = "";
        for(int i=0;i<propiedades.size();i++){
            resultado = resultado + propiedades.get(i).toString()+"\n";
        }
        System.out.println(resultado);
    }//GEN-LAST:event_btnMostrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupEstado;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMostrar1;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.ButtonGroup groupTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBaños;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtHabitaciones;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
