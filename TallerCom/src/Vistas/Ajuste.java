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
public class Ajuste extends javax.swing.JFrame {
    
    boolean admin;
    /** Creates new form Ajuste */
    public Ajuste() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        InicioSesion InicioSesion=new InicioSesion();
        System.out.println("nombre "+InicioSesion.nombre);
        LblHolaCa.setText(InicioSesion.nombre);
        System.out.println("admin= "+InicioSesion.admin+" trab= "+InicioSesion.trab);
        if(InicioSesion.admin==1)
            admin=true;
        else
            admin=false;
    }
    
    @Override
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Img/Icono16.png"));
        return retValue;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LblHolaCa = new javax.swing.JLabel();
        Lbl3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        BtnAgregarAj = new javax.swing.JButton();
        BtnCita = new javax.swing.JButton();
        BtnInicio = new javax.swing.JButton();
        BtnConsultarC1 = new javax.swing.JButton();
        BtnNota1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TallerCom");
        setIconImage(getIconImage());

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

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel2.setText("Hola");

        LblHolaCa.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        LblHolaCa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHolaCa.setText("jLabel2");
        LblHolaCa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Lbl3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbl3.setText("Estás en TallerCom");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono200.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(LblHolaCa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Lbl3)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(LblHolaCa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(Lbl3)
                .addGap(61, 61, 61)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel4.setPreferredSize(new java.awt.Dimension(394, 525));

        BtnAgregarAj.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnAgregarAj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoAjuste.png"))); // NOI18N
        BtnAgregarAj.setText("Agregar ajuste");
        BtnAgregarAj.setContentAreaFilled(false);
        BtnAgregarAj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarAjActionPerformed(evt);
            }
        });

        BtnCita.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoCita.png"))); // NOI18N
        BtnCita.setText("Cita");
        BtnCita.setContentAreaFilled(false);
        BtnCita.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCitaActionPerformed(evt);
            }
        });

        BtnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoInicio.png"))); // NOI18N
        BtnInicio.setContentAreaFilled(false);
        BtnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInicioActionPerformed(evt);
            }
        });

        BtnConsultarC1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnConsultarC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IconoConsultar.png"))); // NOI18N
        BtnConsultarC1.setText("Consultar ajuste");
        BtnConsultarC1.setContentAreaFilled(false);
        BtnConsultarC1.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnConsultarC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarC1ActionPerformed(evt);
            }
        });

        BtnNota1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        BtnNota1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Nota.png"))); // NOI18N
        BtnNota1.setText("Nota");
        BtnNota1.setContentAreaFilled(false);
        BtnNota1.setPreferredSize(new java.awt.Dimension(217, 73));
        BtnNota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNota1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAgregarAj, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultarC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(BtnAgregarAj, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnConsultarC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnInicio)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 519, Short.MAX_VALUE)))
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

    private void BtnAgregarAjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarAjActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AgregarAj AgAj= new AgregarAj();
        AgAj.setVisible(true);
    }//GEN-LAST:event_BtnAgregarAjActionPerformed

    private void BtnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCitaActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ventana cita= new Ventana();
        cita.setVisible(true);
    }//GEN-LAST:event_BtnCitaActionPerformed

    private void BtnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInicioActionPerformed
        // TODO add your handling code here:
        if(admin){
            this.setVisible(false);
            SesionAdmin frameAdmin= new SesionAdmin();
            frameAdmin.setVisible(true);
        }else{
            this.setVisible(false);
            SesionTrabajador frameTrab= new SesionTrabajador();
            frameTrab.setVisible(true);
        }
    }//GEN-LAST:event_BtnInicioActionPerformed

    private void BtnConsultarC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarC1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ConsultarAj ConAj= new ConsultarAj();
        ConAj.setVisible(true);
    }//GEN-LAST:event_BtnConsultarC1ActionPerformed

    private void BtnNota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNota1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Nota nota= new Nota();
        nota.setVisible(true);
    }//GEN-LAST:event_BtnNota1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajuste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajuste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarAj;
    private javax.swing.JButton BtnCita;
    private javax.swing.JButton BtnConsultarC1;
    private javax.swing.JButton BtnInicio;
    private javax.swing.JButton BtnNota1;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel Lbl3;
    private javax.swing.JLabel LblHolaCa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}