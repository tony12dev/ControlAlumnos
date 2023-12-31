/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaconexion;

import Delegate.SistemaDelegate;
import config.AlumnosDao;
import dto.AlumnosDT;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author tonny
 */
public class BuscarAlumno extends javax.swing.JFrame {

    /** Creates new form BuscarAlumno */
    
    AlumnosDT dt = new AlumnosDT();
    SistemaDelegate del = new SistemaDelegate();
    AlumnosDao dao = new AlumnosDao();
    AlumnosDT dto;
    public BuscarAlumno() {
        initComponents();
         txtIDAlumno.setEditable(false); 
         btnModificar.setEnabled(false);
         btnCambios.setEnabled(false);
    }

     public void CambioColor() {
        
        txtIDAlumno.setBackground(Color.decode("#E7E4E4"));
        txtNombreA.setEditable(false);
        txtNombreA.setBackground(Color.decode("#E7E4E4"));
        txtApaterno.setEditable(false);
        txtApaterno.setBackground(Color.decode("#E7E4E4"));
        txtAMaterno.setEditable(false);
        txtAMaterno.setBackground(Color.decode("#E7E4E4"));
        txtEdadAl.setEditable(false);
        txtEdadAl.setBackground(Color.decode("#E7E4E4"));
       
        }
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        txtAMaterno = new javax.swing.JTextField();
        txtEdadAl = new javax.swing.JTextField();
        txtApaterno = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCambios = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtBusquedaA = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        Limage = new javax.swing.JLabel();
        txtIDAlumno = new javax.swing.JTextField();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BUSQUEDA DE ALUMNO ");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("IDAlumno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 149, 139, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("A.Paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 255, 139, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 197, 139, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 405, 206, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Edad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 139, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("A.Materno");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 313, 139, -1));

        txtNombreA.setEditable(false);
        txtNombreA.setBackground(new java.awt.Color(231, 234, 239));
        txtNombreA.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtNombreA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtNombreA.setFocusCycleRoot(true);
        getContentPane().add(txtNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 195, 370, 33));

        txtAMaterno.setEditable(false);
        txtAMaterno.setBackground(new java.awt.Color(231, 234, 239));
        txtAMaterno.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtAMaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAMaterno.setFocusCycleRoot(true);
        getContentPane().add(txtAMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 311, 370, 33));

        txtEdadAl.setEditable(false);
        txtEdadAl.setBackground(new java.awt.Color(231, 234, 239));
        txtEdadAl.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtEdadAl.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtEdadAl.setFocusCycleRoot(true);
        getContentPane().add(txtEdadAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 369, 370, 33));

        txtApaterno.setEditable(false);
        txtApaterno.setBackground(new java.awt.Color(231, 234, 239));
        txtApaterno.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        txtApaterno.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtApaterno.setFocusCycleRoot(true);
        getContentPane().add(txtApaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 253, 367, 33));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, 187, 41));

        btnModificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 150, 41));

        btnCambios.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnCambios.setText("Guardar Cambios");
        btnCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 160, 40));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 760, 90));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Busqueda Por Nombre");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 310, 40));
        getContentPane().add(txtBusquedaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 350, 30));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 150, 30));

        Limage.setText("jLabel9");
        getContentPane().add(Limage, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 134, 200, 260));

        txtIDAlumno.setEditable(false);
        txtIDAlumno.setBackground(new java.awt.Color(231, 234, 239));
        getContentPane().add(txtIDAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 370, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        dt.setNombre(txtBusquedaA.getText());
        
        try {
            dto = dao.busqueda(dt);
            
            if(dto != null){
                JOptionPane.showMessageDialog(this,"Alumno encontrado");
                txtIDAlumno.setText(String.valueOf(dto.getIdalumnos()));
                txtNombreA.setText(dto.getNombre());
                txtApaterno.setText(dto.getApellidoParterno());
                txtAMaterno.setText(dto.getApellidoMaterno());
                txtEdadAl.setText(String.valueOf(dto.getEdad()));
                btnModificar.setEnabled(true);
                
            }else{
            JOptionPane.showMessageDialog(this,"Alumno No encontrado, ¡Esque no escribe Bien| ");
            txtIDAlumno.setText("");
            txtNombreA.setText("");
            txtApaterno.setText("");
            txtAMaterno.setText("");
            txtEdadAl.setText("");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        new Alumnos().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:.
       // txtIDAlumno.setEditable(true);
        txtIDAlumno.setBackground(Color.WHITE);
        txtNombreA.setEditable(true);
        txtNombreA.setBackground(Color.WHITE);
        txtApaterno.setEditable(true);
        txtApaterno.setBackground(Color.WHITE);
        txtAMaterno.setEditable(true);
        txtAMaterno.setBackground(Color.WHITE);
        txtEdadAl.setEditable(true);
        txtEdadAl.setBackground(Color.WHITE);
        btnCambios.setEnabled(true);
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiosActionPerformed
        // TODO add your handling code here:
        
          try {
            
        String a = txtNombreA.getText();
        String b = txtApaterno.getText();
        String c = txtAMaterno.getText();
        String d = txtEdadAl.getText();
        String e = txtBusquedaA.getText();
        
        
        
        if(a.isEmpty()| b.isEmpty()| c.isEmpty()| d.isEmpty() && e.isEmpty()){
            
            JOptionPane.showInternalMessageDialog(null,"Algun Compo dejo vacio");
            System.out.println("");
        }else{
        
            dt.setNombre(txtNombreA.getText());
            dt.setApellidoParterno(txtApaterno.getText());
            dt.setApellidoMaterno(txtAMaterno.getText());
            dt.setEdad(Integer.parseInt(txtEdadAl.getText()));
            del.actualizarAlumno(dto);
            
            JOptionPane.showMessageDialog(this, "Datos Actualizados correctamente");
            CambioColor();
            btnCambios.setEnabled(false);
         } 
        
         } catch (Exception e) {
         
             Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, e);
             System.out.println(e);
         
         }   
           
    }//GEN-LAST:event_btnCambiosActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
       CambioColor();
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Limage;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambios;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAMaterno;
    private javax.swing.JTextField txtApaterno;
    private javax.swing.JTextField txtBusquedaA;
    private javax.swing.JTextField txtEdadAl;
    private javax.swing.JTextField txtIDAlumno;
    private javax.swing.JTextField txtNombreA;
    // End of variables declaration//GEN-END:variables

}
