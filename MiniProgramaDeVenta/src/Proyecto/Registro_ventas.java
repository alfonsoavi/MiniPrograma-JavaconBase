
package Proyecto;
import java.sql.*;
import java.util.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Registro_ventas extends javax.swing.JDialog {
    String clave="1999";
    
    public Registro_ventas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    
        int siguiente=0;
        
        String s="select max(factura)+1 from registro_venta";
        
          try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

          
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
            siguiente=r.getInt(1);
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
        
    factura.setText(Integer.toString(siguiente));
        
    
       DefaultComboBoxModel cbm=new DefaultComboBoxModel();

    String s2="select * from registro_area";
       try {
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");
         PreparedStatement p = c.prepareStatement(s2);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
            DatosArea dr=new DatosArea( r.getInt(1) , r.getString(2), r.getDouble(3)  );
            cbm.addElement(dr);
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
       
    c_areas.setModel(cbm);
    
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_sexo = new javax.swing.ButtonGroup();
        t_cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        t_nomb = new javax.swing.JTextField();
        Edad = new javax.swing.JLabel();
        t_edad = new javax.swing.JTextField();
        Estudios = new javax.swing.JCheckBox();
        Edad1 = new javax.swing.JLabel();
        c_areas = new javax.swing.JComboBox<>();
        Edad2 = new javax.swing.JLabel();
        Calcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t_descuento = new javax.swing.JTextField();
        Nombre1 = new javax.swing.JLabel();
        t_valorp = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        b_volver = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        factura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de ventas");

        jLabel1.setText("Cedula");

        Nombre.setText("Nombre");

        t_nomb.setEditable(false);

        Edad.setText("Edad");

        t_edad.setEditable(false);

        Edad1.setText("Estudiante");

        c_areas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Edad2.setText("Area");

        Calcular.setText("Calcular");
        Calcular.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Descuento (25%)");

        t_descuento.setEditable(false);

        Nombre1.setText("Total a Pagar");

        t_valorp.setEditable(false);

        Limpiar.setText("Limpiar");
        Limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor Mensual");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        jLabel4.setText("REGISTRO \"GYM\"");

        b_volver.setText("Volver");
        b_volver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        b_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_volverActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jLabel5.setText("Factura");

        factura.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 158, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(t_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Nombre1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(t_valorp, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Edad1)
                                .addGap(50, 50, 50)
                                .addComponent(Estudios)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Edad2)
                                .addGap(34, 34, 34)
                                .addComponent(c_areas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(b_volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(68, 68, 68))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Edad, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Consultar))
                                    .addComponent(t_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Consultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_nomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad)
                    .addComponent(t_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estudios)
                    .addComponent(Edad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edad2)
                    .addComponent(c_areas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Calcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(t_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Nombre1)
                    .addComponent(t_valorp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Limpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Guardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(b_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        double dscto=0;
        double pagar=0;
     DatosArea da=(DatosArea)c_areas.getSelectedItem();     
     
     if (Estudios.isSelected())
          dscto= (((double)Math.round((da.valor*0.25)*100d))/100);
        pagar=da.valor-dscto;    

        t_descuento.setText(Double.toString(dscto));
        t_valorp.setText(Double.toString(pagar));
        
      
        // TODO add your handling code here:
    }//GEN-LAST:event_CalcularActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
       limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_LimpiarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
       
        DatosArea da=(DatosArea)c_areas.getSelectedItem();
        String estado ="";
        if (Estudios.isSelected())  estado = "SI"; else estado = "NO";
        
String s="insert into registro_venta values("+factura.getText()+",'"+t_cedula.getText()+"','"+estado+"',"+da.codificacion
        +","+t_descuento.getText()+","+t_valorp.getText()+")";

  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

          
         PreparedStatement p = c.prepareStatement(s);
         p.executeUpdate();

         JOptionPane.showMessageDialog(this,"Se ha registrado la transacción "+factura.getText());
         
        System.out.println("Se ha insertado un registro");
      
       
    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(this,"no se guardó la transaccion"); 
         
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }

    hide();

        // TODO add your handling code here:
    }//GEN-LAST:event_GuardarActionPerformed

    private void b_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_volverActionPerformed
      dispose();
    }//GEN-LAST:event_b_volverActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
   
        String s="select nombre , edad from registro_cliente where cedula='"+t_cedula.getText()+"'";
        String nombre="";
        String edad="";
      try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         while(r.next())
         {
            nombre=r.getString(1);
            edad=r.getString(2);
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }

        t_nomb.setText(nombre);
        t_edad.setText(edad);
        
// TODO add your handling code here:
    }//GEN-LAST:event_ConsultarActionPerformed
 
   public void limpiar(){
    t_cedula.setText("");
    t_nomb.setText("");
    t_edad.setText("");
    Estudios.setSelected(false);
    Grupo_sexo.clearSelection();
    t_descuento.setText("");
    t_valorp.setText("");
    t_cedula.grabFocus();
   }
    

    
    
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
            java.util.logging.Logger.getLogger(Registro_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Registro_ventas dialog = new Registro_ventas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Consultar;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Edad1;
    private javax.swing.JLabel Edad2;
    private javax.swing.JCheckBox Estudios;
    private javax.swing.ButtonGroup Grupo_sexo;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Nombre1;
    private javax.swing.JButton b_volver;
    private javax.swing.JComboBox<String> c_areas;
    private javax.swing.JTextField factura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField t_cedula;
    private javax.swing.JTextField t_descuento;
    private javax.swing.JTextField t_edad;
    private javax.swing.JTextField t_nomb;
    private javax.swing.JTextField t_valorp;
    // End of variables declaration//GEN-END:variables
}
