package com.mycompany.menus;

import java.awt.Color;

/**
 *
 * @author a20alejandrofs
 */
public class Menus extends javax.swing.JFrame {
    public Menus() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoGuardar = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuEdicionColores = new javax.swing.JMenu();
        menuEditarColorRojo = new javax.swing.JMenuItem();
        menuEditarColorVerde = new javax.swing.JMenuItem();
        menuEditarColorAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuArchivoAbrir.setText("Abrir");
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoGuardar.setText("Guardar");
        menuArchivo.add(menuArchivoGuardar);
        menuArchivo.add(separador);

        menuArchivoSalir.setText("Salir");
        menuArchivo.add(menuArchivoSalir);

        menu.add(menuArchivo);

        menuEditar.setText("Editar");

        menuEdicionColores.setText("Colores");

        menuEditarColorRojo.setText("Rojo");
        menuEditarColorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarColorRojoActionPerformed(evt);
            }
        });
        menuEdicionColores.add(menuEditarColorRojo);

        menuEditarColorVerde.setText("Verde");
        menuEditarColorVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarColorVerdeActionPerformed(evt);
            }
        });
        menuEdicionColores.add(menuEditarColorVerde);

        menuEditarColorAzul.setText("Azul");
        menuEditarColorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarColorAzulActionPerformed(evt);
            }
        });
        menuEdicionColores.add(menuEditarColorAzul);

        menuEditar.add(menuEdicionColores);

        menu.add(menuEditar);

        menuInsertar.setText("Insertar");
        menu.add(menuInsertar);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuEditarColorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarColorRojoActionPerformed
        this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuEditarColorRojoActionPerformed

    private void menuEditarColorVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarColorVerdeActionPerformed
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuEditarColorVerdeActionPerformed

    private void menuEditarColorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarColorAzulActionPerformed
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuEditarColorAzulActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoGuardar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenu menuEdicionColores;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenuItem menuEditarColorAzul;
    private javax.swing.JMenuItem menuEditarColorRojo;
    private javax.swing.JMenuItem menuEditarColorVerde;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
