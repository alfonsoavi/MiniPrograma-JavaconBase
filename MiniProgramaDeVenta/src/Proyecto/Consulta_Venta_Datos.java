
package Proyecto;
import java.sql.*;
import javax.swing.table.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Consulta_Venta_Datos extends javax.swing.JDialog {
   String clave = "1999";
    
    public Consulta_Venta_Datos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   
           String s="select rv.factura,rc.cedula, rc.nombre, rv.estudiante, ra.area,rv.precio_descuento," +
                    "rv.precio_total from registro_venta rv, registro_cliente rc, registro_area ra " +
                    "where rv.cedula=rc.cedula and rv.codificacion = ra.codificacion and ra.codificacion>0 ";
    
        DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Factura");
       df.addColumn("Cedula");
       df.addColumn("Nombre de cliente");
       df.addColumn("Estudiante");
       df.addColumn("Area de servicio");
       df.addColumn("Precio descuento");
       df.addColumn("Precio total"); 

  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {

            String registro[]={Integer.toString(r.getInt(1)),r.getString(2),r.getString(3),r.getString(4),r.getString(5)
                               ,Double.toString(r.getDouble(6)),Double.toString(r.getDouble(7))};   
            df.addRow(registro);
                     
         }
       
    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
        Tabla_Datos.setModel(df);
     
        
    DefaultComboBoxModel cbm=new DefaultComboBoxModel();
    cbm.addElement(new DatosArea(0,"",0));;
    String s2="select * from registro_area where codificacion >0";
       try {
       
       Class.forName("org.postgresql.Driver");
       Connection c1 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

         PreparedStatement p1 = c1.prepareStatement(s2);
         ResultSet r1=p1.executeQuery();
         
         while(r1.next())
         {
            DatosArea da=new DatosArea( r1.getInt(1) , r1.getString(2),r1.getDouble(3)  );
            cbm.addElement(da);
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
       
    c_areas1.setModel(cbm);
   }     
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Datos = new javax.swing.JTable();
        c_areas1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        t_cedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Ventas");

        Tabla_Datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla_Datos);

        c_areas1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Area");

        Buscar.setText("Buscar");
        Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Identiificacion Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_areas1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c_areas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(t_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        String sentencia_filtro_area="";

        DatosArea da=(DatosArea)c_areas1.getSelectedItem();
        
        if (da.codificacion!=0)
            sentencia_filtro_area= " and ra.codificacion="+da.codificacion;
        
        String sentencia_filtro_cliente="";
        if (!t_cedula.getText().equals(""))
            sentencia_filtro_cliente= " and rc.cedula='"+t_cedula.getText()+"'";
        
        
          String s="select rv.factura,rc.cedula, rc.nombre, rv.estudiante, " +
                   "ra.area,rv.precio_descuento, rv.precio_total " +
                   "from registro_venta rv, registro_cliente rc, registro_area ra " +
                   "where rv.cedula=rc.cedula and rv.codificacion = ra.codificacion "+
                  sentencia_filtro_area + sentencia_filtro_cliente ;
    
        DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Factura");
       df.addColumn("Cedula");
       df.addColumn("Nombre de cliente");
       df.addColumn("Estudiante");
       df.addColumn("Area de servicio");
       df.addColumn("Precio descuento");
       df.addColumn("Precio total"); 
        

  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

          
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
           String registro[]={Integer.toString(r.getInt(1)),r.getString(2),r.getString(3),r.getString(4),r.getString(5)
                               ,Double.toString(r.getDouble(6)),Double.toString(r.getDouble(7))};   
            df.addRow(registro);
                     
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
        Tabla_Datos.setModel(df);
     
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
   
   
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
            java.util.logging.Logger.getLogger(Consulta_Venta_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Venta_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Venta_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Venta_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                Consulta_Venta_Datos dialog = new Consulta_Venta_Datos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton Buscar;
    private javax.swing.JTable Tabla_Datos;
    private javax.swing.JComboBox<String> c_areas1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_cedula;
    // End of variables declaration//GEN-END:variables
}
