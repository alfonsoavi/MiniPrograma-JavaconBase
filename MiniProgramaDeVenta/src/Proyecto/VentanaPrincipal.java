
package Proyecto;
import java.util.*;
import java.io.*;
        

public class VentanaPrincipal extends javax.swing.JFrame {
    
    
    public VentanaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuIngresoCliente = new javax.swing.JMenuItem();
        jMenuIngresoArea = new javax.swing.JMenuItem();
        jMenuIngresoVenta = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuConsultaRegistro = new javax.swing.JMenuItem();
        jMenuEstadisticas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pantalla Principal");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        jMenu2.setText("Registros");

        jMenuIngresoCliente.setText("Ingreso Cliente");
        jMenuIngresoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIngresoClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuIngresoCliente);

        jMenuIngresoArea.setText("Ingreso Areas de ejercicio");
        jMenuIngresoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIngresoAreaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuIngresoArea);

        jMenuIngresoVenta.setText("Registro Venta");
        jMenuIngresoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIngresoVentaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuIngresoVenta);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Consultas");

        jMenuItem1.setText("Consulta de clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Consulta de Areas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuConsultaRegistro.setText("Lista de Ventas Registradas");
        jMenuConsultaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuConsultaRegistro);

        jMenuEstadisticas.setText("Estadisticas");
        jMenuEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEstadisticasActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuEstadisticas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuIngresoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIngresoAreaActionPerformed
       Registro_Area Ra=new Registro_Area(this,true,null);
       Ra.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuIngresoAreaActionPerformed

    private void jMenuEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEstadisticasActionPerformed
      Estadisticas e=new Estadisticas(this,true);
      e.show();
      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuEstadisticasActionPerformed

    private void jMenuConsultaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaRegistroActionPerformed
     Consulta_Venta_Datos cv=new Consulta_Venta_Datos(this,true);
     cv.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuConsultaRegistroActionPerformed

    private void jMenuIngresoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIngresoClienteActionPerformed
       Registro_cliente Rc=new Registro_cliente(this,true,null);
       Rc.show();
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuIngresoClienteActionPerformed

    private void jMenuIngresoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIngresoVentaActionPerformed
       Registro_ventas Rv=new Registro_ventas(this,true);
       Rv.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuIngresoVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Consulta_clientes cc=new Consulta_clientes(this,true);
        cc.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Consulta_area ca=new Consulta_area(this,true);
        ca.show();        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuConsultaRegistro;
    private javax.swing.JMenuItem jMenuEstadisticas;
    private javax.swing.JMenuItem jMenuIngresoArea;
    private javax.swing.JMenuItem jMenuIngresoCliente;
    private javax.swing.JMenuItem jMenuIngresoVenta;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
