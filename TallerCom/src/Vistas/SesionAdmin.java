/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author lilia
 */
public class SesionAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SesionAdmin
     */
    boolean admin;
    
    public SesionAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        InicioSesion InicioSesion=new InicioSesion();
        //System.out.println("nombre "+InicioSesion.nombre);
        LblHolaAdmin.setText(InicioSesion.nombre);
        System.out.println("admin= "+InicioSesion.admin+" trab= "+InicioSesion.trab);
        if(InicioSesion.admin==1)
            admin=true;
        else
            admin=false;
    }
    
    //Icono Ventana
     @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/Icono16.png"));
        return retValue;
    }
    //Fin Icono Ventana
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        LblHolaAdmin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnAgregarTrab = new javax.swing.JButton();
        BtnEditarT = new javax.swing.JButton();
        BtnConsultarT = new javax.swing.JButton();
        BtnEliminarT = new javax.swing.JButton();
        BtnCliente = new javax.swing.JButton();
        BtnCarro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TallerCom");
        setIconImage(getIconImage());
        setLocation(new java.awt.Point(200, 75));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));

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

        jPanel3.setBackground(new java.awt.Color(0, 179, 209));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 525));

        LblHolaAdmin.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LblHolaAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHolaAdmin.setText("jLabel2");
        LblHolaAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setText("Hola");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Estás en TallerCom");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono200.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblHolaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(123, 123, 123))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LblHolaAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(241, 241, 241));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 525));

        BtnAgregarTrab.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnAgregarTrab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoTrabajador.png"))); // NOI18N
        BtnAgregarTrab.setText("Agregar trabajador");
        BtnAgregarTrab.setContentAreaFilled(false);
        BtnAgregarTrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarTrabActionPerformed(evt);
            }
        });

        BtnEditarT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnEditarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Iconoeditar.png"))); // NOI18N
        BtnEditarT.setText("Editar Trabajador");
        BtnEditarT.setContentAreaFilled(false);
        BtnEditarT.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnEditarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarTActionPerformed(evt);
            }
        });

        BtnConsultarT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnConsultarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoConsultar.png"))); // NOI18N
        BtnConsultarT.setText("Consultar trabajador");
        BtnConsultarT.setContentAreaFilled(false);
        BtnConsultarT.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnConsultarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarTActionPerformed(evt);
            }
        });

        BtnEliminarT.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnEliminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoEliminar.png"))); // NOI18N
        BtnEliminarT.setText("Elimitar trabajador");
        BtnEliminarT.setContentAreaFilled(false);
        BtnEliminarT.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnEliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarTActionPerformed(evt);
            }
        });

        BtnCliente.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BtnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoCliente.png"))); // NOI18N
        BtnCliente.setText("Cliente");
        BtnCliente.setContentAreaFilled(false);
        BtnCliente.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClienteActionPerformed(evt);
            }
        });

        BtnCarro.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BtnCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoCarro.png"))); // NOI18N
        BtnCarro.setText("Carro");
        BtnCarro.setContentAreaFilled(false);
        BtnCarro.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCarroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnEliminarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnConsultarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnAgregarTrab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditarT, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(BtnAgregarTrab, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEditarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnConsultarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void BtnAgregarTrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarTrabActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AgregarTrab AgTrab= new AgregarTrab();
        AgTrab.setVisible(true);
    }//GEN-LAST:event_BtnAgregarTrabActionPerformed

    private void BtnConsultarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ConsultarTrab ConTrab= new ConsultarTrab();
        ConTrab.setVisible(true);
    }//GEN-LAST:event_BtnConsultarTActionPerformed

    private void BtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClienteActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SesionTrabajador frameTrabajador= new SesionTrabajador();
        frameTrabajador.setVisible(true);
    }//GEN-LAST:event_BtnClienteActionPerformed

    private void BtnCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCarroActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Carro Carro= new Carro();
        Carro.setVisible(true);
    }//GEN-LAST:event_BtnCarroActionPerformed

    private void BtnEditarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarTActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EditarTrab EdT= new EditarTrab();
        EdT.setVisible(true);
    }//GEN-LAST:event_BtnEditarTActionPerformed

    private void BtnEliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarTActionPerformed
        // TODO add your handling code here:
        if(admin){
            this.setVisible(false);
            EliminarAd ElAd= new EliminarAd();
            ElAd.setVisible(true);
        }else{
            this.setVisible(false);
            EliminarTra ElTra= new EliminarTra();
            ElTra.setVisible(true);
        }
    }//GEN-LAST:event_BtnEliminarTActionPerformed

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
            java.util.logging.Logger.getLogger(SesionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SesionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SesionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SesionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SesionAdmin().setVisible(true);
            }
        });
        //TxtHola.setText("Hola, "+);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarTrab;
    private javax.swing.JButton BtnCarro;
    private javax.swing.JButton BtnCliente;
    private javax.swing.JButton BtnConsultarT;
    private javax.swing.JButton BtnEditarT;
    private javax.swing.JButton BtnEliminarT;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblHolaAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}