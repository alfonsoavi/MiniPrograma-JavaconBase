
package Proyecto;
import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;

public class Estadisticas extends javax.swing.JDialog {

    String clave = "1999";
   
    public Estadisticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
        r_area.setSelected(true);
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Area de ejercicio");
       df.addColumn("Cantidad de Ventas");
       df.addColumn("Descuento de la venta");
       df.addColumn("Venta Total");
        
  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

        
        String s="select ra.area, sum(+1),sum(rv.precio_descuento) , sum(rv.precio_total) " +
                 "from registro_venta rv, registro_area ra "+
                 "where rv.codificacion = ra.codificacion and ra.codificacion>0 group by ra.area";
        
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
 
String registro[]={r.getString(1),Integer.toString(r.getInt(2)),
                   Double.toString(r.getDouble(3)),Double.toString(r.getDouble(4))};   
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
        t_tabla.setModel(df);
 
        
        
  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

        String s="select sum(precio_total), sum(1) from registro_venta where factura >0";
          
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
            
            t_gym.setText( Double.toString(r.getDouble(1) ) );
            t_personas.setText( Integer.toString(r.getInt(2) ) );           
         }

    } catch (ClassNotFoundException e) {
        System.out.println("clase no encontrada");
        e.printStackTrace();
    }
     catch (SQLException e) {
        System.out.println("Database Access Error.");
        e.printStackTrace();
    }
  
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        busqueda = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        t_gym = new javax.swing.JTextField();
        t_personas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        r_area = new javax.swing.JRadioButton();
        r_sexo = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estadistica de las venta");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        t_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_tabla);

        jLabel1.setText("Ingresos Totales Del Gym");

        t_gym.setEditable(false);

        t_personas.setEditable(false);

        jLabel2.setText("Cantidad Personas Inscritas");

        busqueda.add(r_area);
        r_area.setText("Area");

        busqueda.add(r_sexo);
        r_sexo.setText("Sexo");

        Buscar.setText("Buscar");
        Buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 60, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t_gym, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(r_area)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(t_personas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(r_sexo)))))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t_gym, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_personas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buscar)
                    .addComponent(r_area)
                    .addComponent(r_sexo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
     if(r_area.isSelected())
     {
         DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Area de ejercicio");
       df.addColumn("Cantidad de Ventas");
       df.addColumn("Descuento de la venta");
       df.addColumn("Venta Total");
        
  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

        
        String s="select ra.area, sum(+1),sum(rv.precio_descuento) , sum(rv.precio_total) " +
                 "from registro_venta rv, registro_area ra "+
                 "where rv.codificacion = ra.codificacion and ra.codificacion>0 group by ra.area";
        
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
 
String registro[]={r.getString(1),Integer.toString(r.getInt(2)),
                   Double.toString(r.getDouble(3)),Double.toString(r.getDouble(4))};   
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
        t_tabla.setModel(df);        
}
     
  if (r_sexo.isSelected())
  {
       DefaultTableModel df=new DefaultTableModel();
      
       df.addColumn("Sexo");
       df.addColumn("Cantidad de Ventas");
       df.addColumn("Descuento de la venta");
       df.addColumn("Venta Total");
        
  try {
       
       Class.forName("org.postgresql.Driver");
       Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", clave);
        
        System.out.println("Database connected");

        String s="select rc.sexo, sum(+1),sum(rv.precio_descuento) , sum(rv.precio_total) " +
                 "from registro_venta rv, registro_cliente rc "+
                 "where rv.cedula = rc.cedula and rv.factura>0 group by rc.sexo";
        
         PreparedStatement p = c.prepareStatement(s);
         ResultSet r=p.executeQuery();
         
         while(r.next())
         {
 
String registro[]={r.getString(1),Integer.toString(r.getInt(2)),
                   Double.toString(r.getDouble(3)),Double.toString(r.getDouble(4))};   
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
        t_tabla.setModel(df);        
  }
       
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Estadisticas dialog = new Estadisticas(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup busqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton r_area;
    private javax.swing.JRadioButton r_sexo;
    private javax.swing.JTextField t_gym;
    private javax.swing.JTextField t_personas;
    private javax.swing.JTable t_tabla;
    // End of variables declaration//GEN-END:variables
}
