package formularios;

import Entidades.algoritmos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tadCola.ColaVacia;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/file_archive.png")).getImage());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        Container = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Atender_01 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Atender_02 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Atender_03 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        normal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        prioridad = new javax.swing.JTextArea();
        Generar_01 = new javax.swing.JButton();
        Generar_02 = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        Container.setBackground(new java.awt.Color(213, 224, 247));
        Container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel4.setText("Caja N°1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        Atender_01.setBackground(java.awt.SystemColor.activeCaption);
        Atender_01.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        Atender_01.setText("ATENDER");
        Atender_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atender_01ActionPerformed(evt);
            }
        });
        jPanel1.add(Atender_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 30));

        jLabel7.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel7.setText("Atendido a :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        jLabel11.setFont(new java.awt.Font("Source Sans Pro", 0, 10)); // NOI18N
        jLabel11.setText("PRIORIDAD");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 30));

        Container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 240, 130));

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel5.setText("Caja N°2");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        Atender_02.setBackground(java.awt.SystemColor.activeCaption);
        Atender_02.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        Atender_02.setText("ATENDER");
        Atender_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atender_02ActionPerformed(evt);
            }
        });
        jPanel2.add(Atender_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 30));

        jLabel8.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel8.setText("Atendido a :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        jLabel12.setFont(new java.awt.Font("Source Sans Pro", 0, 10)); // NOI18N
        jLabel12.setText("COMÚN");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 30));

        Container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 240, 130));

        jPanel3.setBackground(new java.awt.Color(255, 204, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/caja_registradora.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));

        jLabel6.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        jLabel6.setText("Caja N°3");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        Atender_03.setBackground(java.awt.SystemColor.activeCaption);
        Atender_03.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        Atender_03.setText("ATENDER");
        Atender_03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Atender_03ActionPerformed(evt);
            }
        });
        jPanel3.add(Atender_03, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 100, 30));

        jLabel9.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        jLabel9.setText("Atendido a :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, 30));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Source Sans Pro", 0, 12)); // NOI18N
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 120, 30));

        jLabel13.setFont(new java.awt.Font("Source Sans Pro", 0, 10)); // NOI18N
        jLabel13.setText("COMÚN");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 70, 30));

        Container.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 240, 130));

        normal.setEditable(false);
        normal.setBackground(new java.awt.Color(151, 184, 249));
        normal.setColumns(10);
        normal.setFont(new java.awt.Font("Source Sans Pro", 0, 16)); // NOI18N
        normal.setRows(5);
        jScrollPane1.setViewportView(normal);

        Container.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 230, 350));

        prioridad.setEditable(false);
        prioridad.setBackground(new java.awt.Color(151, 184, 249));
        prioridad.setColumns(10);
        prioridad.setFont(new java.awt.Font("Source Sans Pro", 0, 16)); // NOI18N
        prioridad.setRows(5);
        jScrollPane2.setViewportView(prioridad);

        Container.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 230, 350));

        Generar_01.setBackground(java.awt.SystemColor.activeCaption);
        Generar_01.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Generar_01.setText("Generar Turno");
        Generar_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_01ActionPerformed(evt);
            }
        });
        Container.add(Generar_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 190, 40));

        Generar_02.setBackground(java.awt.SystemColor.activeCaption);
        Generar_02.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Generar_02.setText("Generar Turno Prioridad");
        Generar_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Generar_02ActionPerformed(evt);
            }
        });
        Container.add(Generar_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 140, 190, 40));

        Reporte.setBackground(java.awt.SystemColor.activeCaption);
        Reporte.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Reporte.setText("Reporte de Cajas");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });
        Container.add(Reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 250, 190, 40));

        Cerrar.setBackground(java.awt.SystemColor.controlDkShadow);
        Cerrar.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Cerrar.setText("CERRA SESION");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        Container.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, -1, 40));

        Salir.setBackground(new java.awt.Color(255, 51, 51));
        Salir.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        Container.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 470, 80, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SISTEMA PARA LA GESTION DE TURNOS");
        Container.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 580, 50));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salida.png"))); // NOI18N
        Container.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 470, 40, 40));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesion.png"))); // NOI18N
        Container.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 40, 40));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empresa_banco.png"))); // NOI18N
        Container.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 40, 50));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(Container, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Atender_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atender_01ActionPerformed
        if (!algoritmos.colaprioridad.colaVacia()) {
            try {
                String turno = algoritmos.colaprioridad.primero();
                turno = algoritmos.colaprioridad.desencolar();
                String s = (String) algoritmos.colaprioridad.ImprimirC();
                prioridad.setText(s);
                jTextField1.setText(turno);
                algoritmos.caja1.encolar(turno);
                algoritmos.colaatendidos.encolar(turno);
                algoritmos.caja1.imprimirCola();
            } catch (ColaVacia e) {
                e.printStackTrace();
            }
        } else {
            try {
                String turno = algoritmos.colanormal.primero();
                turno = algoritmos.colanormal.desencolar();
                String s = (String) algoritmos.colanormal.ImprimirC();
                normal.setText(s);
                jTextField1.setText(turno);
                algoritmos.caja1.encolar(turno);
                algoritmos.colaatendidos.encolar(turno);
                String s1 = (String) algoritmos.colaatendidos.ImprimirC();
            } catch (ColaVacia e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Atender_01ActionPerformed

    private void Generar_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_01ActionPerformed
        try {
            String turno = algoritmos.Turno();
            JOptionPane.showMessageDialog(null, "Su turno es: " + turno);
            algoritmos.colanormal.encolar(turno);
            String s = (String) algoritmos.colanormal.ImprimirC();
            normal.setText(s);
            algoritmos.colanormal.imprimirCola();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_Generar_01ActionPerformed

    private void Generar_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Generar_02ActionPerformed
        try {
            String turnoprio = algoritmos.Turno();
            JOptionPane.showMessageDialog(null, "Su turno es: " + turnoprio);
            algoritmos.colaprioridad.encolar(turnoprio);
            String s = (String) algoritmos.colaprioridad.ImprimirC();
            prioridad.setText(s);
            algoritmos.colaprioridad.imprimirCola();
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }//GEN-LAST:event_Generar_02ActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        Reportes frm = new Reportes();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReporteActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Inicio frm = new Inicio();
        frm.setVisible(true);
        dispose();
    }//GEN-LAST:event_CerrarActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
	dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Atender_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atender_02ActionPerformed
        if (!algoritmos.colanormal.colaVacia()) {
            try {
                String turno = algoritmos.colanormal.primero();
                turno = algoritmos.colanormal.desencolar();
                String s = (String) algoritmos.colanormal.ImprimirC();
                jTextField2.setText(turno);
                normal.setText(s);
                algoritmos.caja2.encolar(turno);
                algoritmos.colaatendidos.encolar(turno);
                String s1 = (String) algoritmos.colaatendidos.ImprimirC();
            } catch (ColaVacia e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_Atender_02ActionPerformed

    private void Atender_03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Atender_03ActionPerformed
        if (!algoritmos.colanormal.colaVacia()) {
            try {
                String turno = algoritmos.colanormal.primero();
                turno = algoritmos.colanormal.desencolar();
                String s = (String) algoritmos.colanormal.ImprimirC();
                jTextField3.setText(turno);
                normal.setText(s);
                algoritmos.caja3.encolar(turno);
                algoritmos.colaatendidos.encolar(turno);
                String s1 = (String) algoritmos.colaatendidos.ImprimirC();
            } catch (ColaVacia e1) {
                e1.printStackTrace();
            }
        }
    }//GEN-LAST:event_Atender_03ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atender_01;
    private javax.swing.JButton Atender_02;
    private javax.swing.JButton Atender_03;
    private javax.swing.JButton Cerrar;
    private javax.swing.JPanel Container;
    private javax.swing.JButton Generar_01;
    private javax.swing.JButton Generar_02;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea normal;
    private javax.swing.JTextArea prioridad;
    // End of variables declaration//GEN-END:variables
}
