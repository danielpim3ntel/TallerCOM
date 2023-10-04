/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author lilia
 */
public class EliminarTra extends javax.swing.JFrame {

    /**
     * Creates new form EliminarTra
     */
    
    int x=0,idCl=0,idCa=0;
    String alias="",aliasdb="",placas="",placasdb="";
    boolean ex;
    public EliminarTra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
     @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/Icono16.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LblError2 = new javax.swing.JLabel();
        LblError1 = new javax.swing.JLabel();
        LblError = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnInicio = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblQuien = new javax.swing.JLabel();
        TxtQue = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CboBxSelec = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TallerCom");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(60, 78, 89));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Encabezado.png"))); // NOI18N

        BtnSalir.setBackground(new java.awt.Color(60, 78, 89));
        BtnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/apagar24px.png"))); // NOI18N
        BtnSalir.setContentAreaFilled(false);
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176)
                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(0, 179, 209));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 86));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setText("Agregar cliente o carro");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoCarro.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoCliente.png"))); // NOI18N

        LblError2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LblError2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblError2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblError1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        LblError1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblError1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        LblError.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        LblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblError.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LblError1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(LblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addComponent(LblError, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(LblError1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(LblError2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE)))
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(394, 525));

        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoInicio.png"))); // NOI18N
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(2, 166, 188));
        BtnEliminar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.setBorder(null);
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setText("Eliminar para trabajador");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setText("Elija una opción");

        LblQuien.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        LblQuien.setText("Placas o alias:");

        TxtQue.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoEliminar.png"))); // NOI18N

        CboBxSelec.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        CboBxSelec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cliente", "Carro" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(100, 100, 100))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(LblQuien))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtQue)
                                    .addComponent(CboBxSelec, 0, 196, Short.MAX_VALUE)))
                            .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2))
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CboBxSelec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblQuien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtQue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(BtnInicio)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SesionTrabajador frameTrab= new SesionTrabajador();
        frameTrab.setVisible(true);

    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        // TODO add your handling code here:
       try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/TallerCom","root","");
                Statement stm=con.createStatement();
                if(CboBxSelec.getSelectedItem().equals("Cliente")){
                System.out.println("Entra a cliente");    
                    ResultSet rs=stm.executeQuery("select * from cliente");    
                    while(rs.next()){
                        alias=TxtQue.getText();
                        aliasdb=rs.getString("alias");
                        if(aliasdb.equals(alias)){
                            ex=true;
                            idCl=rs.getInt("id");
                            System.out.println("Si existe el cliente ID="+idCl);
                            break;
                        }else
                            ex=false;
                    }
                    if(aliasdb.equals(alias) && ex){
                        System.out.println("QUERY");
                        x = stm.executeUpdate(" update cliente set estado='"+"Inactivo"+"' where id='"+idCl+"' ");
                    }
                    if(x==1){
                        x=0;
                        LblError.setText("Se eliminó al cliente exitosamente.");
                        LblError2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Correcto.png")));
                    }else{
                        LblError.setText("Verifique que los datos ingresados");
                        LblError1.setText(" sean correctos.");
                        LblError2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Incorrecto.png")));
                    }
                    System.out.println("x="+x);
                    rs.close();
                    stm.close();
                    con.close();
                }else{
                    ResultSet rs=stm.executeQuery("select * from carro");
                    System.out.println("Entra a carro");
                    while(rs.next()){
                        placas=TxtQue.getText();
                        placasdb=rs.getString("placas");
                        if(placasdb.equals(placas)){
                            ex=true;
                            idCa=rs.getInt("id");
                            System.out.println("Si existe el carro ID="+idCl);
                            break;
                        }else
                            ex=false;
                    }
                    if(placasdb.equals(placas) && ex){
                        System.out.println("QUERY");
                        x = stm.executeUpdate(" update carro set estado='"+"No"+"' where id='"+idCa+"' ");
                    }
                    if(x==1){
                        x=0;
                        LblError.setText("Se eliminó el carro exitosamente.");
                        LblError2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Correcto.png")));
                    }else{
                        LblError.setText("Verifique que los datos ingresados");
                        LblError1.setText(" sean correctos.");
                        LblError2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Incorrecto.png")));
                    }
                    System.out.println("x="+x);
                    rs.close();
                    stm.close();
                    con.close();
                    
                }
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarTra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarTra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox<String> CboBxSelec;
    private javax.swing.JLabel LblError;
    private javax.swing.JLabel LblError1;
    private javax.swing.JLabel LblError2;
    private javax.swing.JLabel LblQuien;
    private javax.swing.JTextField TxtQue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}