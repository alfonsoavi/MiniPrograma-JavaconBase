
package Proyecto;
import java.sql.*;
import javax.swing.*;

public class Registro_cliente extends javax.swing.JDialog {
DatosClientes Dc;
 
String clave ="1999";

    public Registro_cliente(java.awt.Frame parent, boolean modal, DatosClientes Datcl) {
        super(parent, modal);
        initComponents();
        Dc = Datcl;
    if (Dc!=null)
        {
           t_cedula.setText(Dc.cedula);
           t_nomb.setText(Dc.nombre);
           t_edad.setText(Dc.edad);       
           t_direccion.setText(Dc.direccion);
           t_contacto.setText(Dc.contacto);
           
         if (Dc.sexo.equals("Masculino"))
               r_masc.setSelected(true);
           else
               r_fem.setSelected(true);
        }   
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_sexo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        t_cedula = new javax.swing.JTextField();
        t_nomb = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        t_edad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_contacto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Edad3 = new javax.swing.JLabel();
        r_masc = new javax.swing.JRadioButton();
        r_fem = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de cliente");

        jLabel1.setText("Cedula:");

        Nombre.setText("Nombre:");

        Edad.setText("Edad:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("REGISTRO DE CLIENTE");

        jLabel3.setText("Dirección Domicilio:");

        jLabel4.setText("Contacto:");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Edad3.setText("Sexo:");

        Grupo_sexo.add(r_masc);
        r_masc.setText("Masculiino");

        Grupo_sexo.add(r_fem);
        r_fem.setText("Femenino");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Edad, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Edad3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(r_masc)
                                .addGap(9, 9, 9)
                                .addComponent(r_fem))
                            .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(132, 132, 132))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Edad)))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r_masc)
                    .addComponent(r_fem)
                    .addComponent(Edad3))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String sexo=""; 
        if (r_masc.isSelected()) sexo="Masculino"; else sexo ="Femenino";

        String envio="";           
        if (Dc!=null)
        {
            envio="update registro_cliente " +
            "set   nombre='"+t_nomb.getText()+"', edad='"+t_edad.getText()+"', sexo='"+sexo+
            "', direccion='"+t_direccion.getText()+"', contacto='"+t_contacto.getText()+"' " +
            "where cedula='"+t_cedula.getText()+"'";
            
            hide();
            JOptionPane.showMessageDialog(this,"Se actualizo correctamente");
        }
        else
        {
        
             envio="insert into registro_cliente values('"
             +t_cedula.getText()+"','"+t_nomb.getText()+"','"+t_edad.getText()+"','"+sexo+
             "','"+t_direccion.getText()+"','"+t_contacto.getText()+"')";
            
             hide();
             JOptionPane.showMessageDialog(this,"Se registro correctamente");
        }
        
        try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

          
         PreparedStatement p = c.prepareStatement(envio);
         p.executeUpdate();
       
        System.out.println("Se ha insertado un registro");
      
       
    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
  /*      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro_cliente dialog = new Registro_cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        //</editor-fold>

        /* Create and display the dialog */
  /*      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro_cliente dialog = new Registro_cliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });     */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Edad3;
    private javax.swing.ButtonGroup Grupo_sexo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton r_fem;
    private javax.swing.JRadioButton r_masc;
    private javax.swing.JTextField t_cedula;
    private javax.swing.JTextField t_contacto;
    private javax.swing.JTextField t_direccion;
    private javax.swing.JTextField t_edad;
    private javax.swing.JTextField t_nomb;
    // End of variables declaration//GEN-END:variables
}
