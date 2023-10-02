/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconexion;

import Delegate.SistemaDelegate;
import config.UsuariosDao;
import dto.UsuarioDT;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tonny
 */
public class Buscar extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    UsuarioDT dt = new UsuarioDT();
    SistemaDelegate del = new SistemaDelegate();
    Principal pn = new Principal();
    UsuariosDao dao = new UsuariosDao();
    UsuarioDT dto;
    private int busqueda;

    public Buscar() throws Exception {
        initComponents();

        
       
//        txtNombreUsuario = dt.getNombre();
  //      txtUsuarios = dt.getUsuario();
    //    txtPass = dt.getContraseña();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LABElBusqueda = new javax.swing.JLabel();
        txtNombress = new javax.swing.JTextField();
        LbaID = new javax.swing.JLabel();
        LabelUsua = new javax.swing.JLabel();
        LbelNombre = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        LabelContra = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtUsuae = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LABElBusqueda.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        LABElBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LABElBusqueda.setText("BUSQUEDA POR NOMBRE ");
        getContentPane().add(LABElBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 569, 35));

        txtNombress.setEditable(false);
        txtNombress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtNombress, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 182, 330, 31));

        LbaID.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LbaID.setText("IDUsuario");
        getContentPane().add(LbaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 131, 151, -1));

        LabelUsua.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelUsua.setText("Usuario");
        getContentPane().add(LabelUsua, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 256, 151, -1));

        LbelNombre.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LbelNombre.setText("Nombre");
        getContentPane().add(LbelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 188, 151, -1));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 127, 330, 29));

        LabelContra.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        LabelContra.setText("Contraseña");
        getContentPane().add(LabelContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 318, 158, -1));
        getContentPane().add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, 330, 29));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 52, 116, 29));

        btnRegresar.setBackground(new java.awt.Color(204, 255, 153));
        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 180, 40));

        txtUsuae.setEditable(false);
        txtUsuae.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtUsuae, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 330, 30));

        txtPass.setEditable(false);
        txtPass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 330, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
       
        dt.setNombre(txtBusqueda.getText());
        
        try {
            dto = dao.busqueda(dt);
            
            if(dto != null){
                JOptionPane.showMessageDialog(this,"Usuario encontrado");
                txtID.setText(String.valueOf(dto.getIdusuario()));
                txtNombress.setText(dto.getNombre());
                txtUsuae.setText(dto.getUsuario());
                txtPass.setText(dto.getContraseña());
                
                        
            
            }else{
            JOptionPane.showMessageDialog(this,"Usuario No encontrado ");
            txtID.setText("");
            txtNombress.setText("");
            txtUsuae.setText("");
            txtPass.setText("");
                              
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        
        new Principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Buscar().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LABElBusqueda;
    private javax.swing.JLabel LabelContra;
    private javax.swing.JLabel LabelUsua;
    private javax.swing.JLabel LbaID;
    private javax.swing.JLabel LbelNombre;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombress;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuae;
    // End of variables declaration//GEN-END:variables
}
