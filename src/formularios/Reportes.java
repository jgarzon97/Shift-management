
package formularios;

import Entidades.algoritmos;
import javax.swing.ImageIcon;
import tadCola.TadCola;

public class Reportes<T> extends javax.swing.JFrame {
    
    public Reportes() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/file_archive.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        atd_prom_01 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        atd_caja_01 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        atd_caja_02 = new javax.swing.JTextField();
        atd_prom_02 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        atd_caja_03 = new javax.swing.JTextField();
        atd_prom_03 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        turnos_total_atd = new javax.swing.JTextField();
        bnt_imprimir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(213, 224, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("REPORTE DE ATENCIÓN");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 760, 50));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel4.setText("Caja N° 1");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 30));

        jLabel7.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel7.setText("tiempo total atendido  >>>   T. promedio");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        atd_prom_01.setEditable(false);
        atd_prom_01.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_prom_01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        atd_prom_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atd_prom_01ActionPerformed(evt);
            }
        });
        jPanel2.add(atd_prom_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 30));

        jLabel15.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel15.setText("Personas atendidas :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        atd_caja_01.setEditable(false);
        atd_caja_01.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_caja_01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(atd_caja_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 200));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel5.setText("Caja N° 2");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 30));

        jLabel11.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel11.setText("Personas atendidas :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        atd_caja_02.setEditable(false);
        atd_caja_02.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_caja_02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(atd_caja_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, 30));

        atd_prom_02.setEditable(false);
        atd_prom_02.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_prom_02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(atd_prom_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 30));

        jLabel17.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel17.setText("tiempo total atendido  >>>   T. promedio");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 290, 200));

        jPanel4.setBackground(new java.awt.Color(255, 204, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel6.setText("Caja N° 3");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 80, 30));

        jLabel12.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel12.setText("Personas atendidas :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 140, 30));

        atd_caja_03.setEditable(false);
        atd_caja_03.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_caja_03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(atd_caja_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 60, 30));

        atd_prom_03.setEditable(false);
        atd_prom_03.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        atd_prom_03.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(atd_prom_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 30));

        jLabel16.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel16.setText("tiempo total atendido  >>>   T. promedio");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 290, 200));

        jLabel8.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel8.setText("Total de Turnos Atendidos :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 180, 30));

        turnos_total_atd.setEditable(false);
        turnos_total_atd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(turnos_total_atd, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 50, 30));

        bnt_imprimir.setBackground(java.awt.SystemColor.activeCaption);
        bnt_imprimir.setFont(new java.awt.Font("Source Sans Pro", 0, 18)); // NOI18N
        bnt_imprimir.setText("IMPRIMIR REPORTE");
        bnt_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnt_imprimirActionPerformed(evt);
            }
        });
        jPanel1.add(bnt_imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 180, 40));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 40, 40));

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 80, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imprimir.png"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 40, 40));

        btn_atras.setBackground(java.awt.SystemColor.controlDkShadow);
        btn_atras.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        btn_atras.setText("ATRÁS");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        jPanel1.add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 80, 40));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 40, 40));

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa_banco.png"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 580));

        setSize(new java.awt.Dimension(800, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bnt_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnt_imprimirActionPerformed
        turnos_total_atd.setText(algoritmos.Elementos((TadCola<T>) algoritmos.colaatendidos));	
        atd_prom_01.setText(algoritmos.tiempoCaja(algoritmos.caja1));
	atd_prom_02.setText(algoritmos.tiempoCaja(algoritmos.caja2));
	atd_prom_03.setText(algoritmos.tiempoCaja(algoritmos.caja3));
        atd_caja_01.setText(algoritmos.cola(algoritmos.caja1));
	atd_caja_02.setText(algoritmos.cola(algoritmos.caja2));
	atd_caja_03.setText(algoritmos.cola(algoritmos.caja3));
    }//GEN-LAST:event_bnt_imprimirActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        Principal frm = new Principal();
	String s = (String) algoritmos.colanormal.ImprimirC();
        
	String s1 = (String) algoritmos.colaprioridad.ImprimirC();
        
	frm.setVisible(true);
	dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void atd_prom_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atd_prom_01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atd_prom_01ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField atd_caja_01;
    private javax.swing.JTextField atd_caja_02;
    private javax.swing.JTextField atd_caja_03;
    private javax.swing.JTextField atd_prom_01;
    private javax.swing.JTextField atd_prom_02;
    private javax.swing.JTextField atd_prom_03;
    private javax.swing.JButton bnt_imprimir;
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField turnos_total_atd;
    // End of variables declaration//GEN-END:variables
}
