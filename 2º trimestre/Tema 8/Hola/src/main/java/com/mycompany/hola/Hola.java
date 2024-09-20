package com.mycompany.hola;

import java.awt.Color;

/**
 *
 * @author a20alejandrofs
 */
public class Hola extends javax.swing.JFrame {
    public Hola() {
        initComponents();
        this.getContentPane().setBackground(Color.CYAN);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton = new javax.swing.JButton();
        texto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        boton.setText("Escribir");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        texto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        texto.setText("...");
        getContentPane().add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 271, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        texto.setText("Hola mundo");
    }//GEN-LAST:event_botonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
