/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * Prueba para #Slack
 */

package lenguajenatural;

import java.io.IOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyleConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;

/**
 *
 * @author basu
 */
public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    private int fontSize;
    
    public Chat() {
        initComponents();
        txtMsg.setRows(2);
        txtMsg.setColumns(10);
        txtMsg.setLineWrap(true);
        txtMsg.setWrapStyleWord(true);
        fontSize = 13;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        sldVolumen = new javax.swing.JSlider();
        lblVolumen = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane2);

        jButton1.setText("Guardar");

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 243, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar chat");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver al menú");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        txtMsg.setColumns(20);
        txtMsg.setRows(5);
        txtMsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMsgKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMsgKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(txtMsg);

        lblVolumen.setText("Volumen");

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtChat.setEditable(false);
        jScrollPane3.setViewportView(txtChat);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(13, 5, 20, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel1.setText("Tamaño de fuente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEnviar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sldVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVolumen))
                    .addComponent(btnBorrar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar)
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEnviar)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVolumen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sldVolumen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMsgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgKeyPressed
        int key = evt.getKeyCode();
                
        if(key == java.awt.event.KeyEvent.VK_ENTER)
            try {
                    if(txtMsg.getText().length()!=0)
                {
                    this.addString();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No se puede enviar un Mensaje Vacio");
                }
        } catch (BadLocationException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_txtMsgKeyPressed

    private void txtMsgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgKeyReleased
        // TODO add your handling code here:
         int key = evt.getKeyCode();
         
         if(key == java.awt.event.KeyEvent.VK_ENTER)
             txtMsg.setText(null); 
    }//GEN-LAST:event_txtMsgKeyReleased

    private void addString() throws BadLocationException {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int sec = Calendar.getInstance().get(Calendar.SECOND);
        String entrada;
        
        entrada = "[U" + hour + ":" + min + ":" + sec + "] "
                            +txtMsg.getText() + "\n";
        
        StyledDocument doc = txtChat.getStyledDocument();
        int length = doc.getLength();
            
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        
        StyleConstants.setBold(attrs, true);
        StyleConstants.setAlignment(attrs, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontSize(attrs, fontSize);
                
        doc.insertString(doc.getLength(), entrada, null);
        doc.setParagraphAttributes(length+1, 1, attrs, false);
        
        this.GeneraRespuesta();
        
        txtMsg.setText(null);
    }
    
    private void GeneraRespuesta() throws BadLocationException {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int sec = Calendar.getInstance().get(Calendar.SECOND);
        
        String respuesta;
        respuesta = "[S" + hour + ":" + min + ":" + sec + "] "
                            + "Respuesta generada por el sistema (temp)" + "\n";
        
        StyledDocument doc = txtChat.getStyledDocument();
        int length = doc.getLength();
        SimpleAttributeSet attrsResp = new SimpleAttributeSet();
        StyleConstants.setBold(attrsResp, false);
        StyleConstants.setAlignment(attrsResp, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setFontSize(attrsResp, fontSize);
        doc.insertString(doc.getLength(), respuesta, null);
        doc.setParagraphAttributes(length+1, 1, attrsResp, false);
    }
    
    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        try
        {
            if(txtMsg.getText().length()!=0)
            {
                this.addString();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se puede enviar un Mensaje Vacio");
            }
        } 
        catch (BadLocationException ex)
        {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(txtMsg.getText().length()!=0)
        {
            javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        
            String[] opciones = {"Completo", "Parcial", "Cancelar" };

            int opcion = JOptionPane.showOptionDialog(
                                   null                             //componente
                                 , "¿Cómo desea guardar la conversación?"            // Mensaje
                                 , "Guardar conversación"         // Titulo en la barra del cuadro
                                 , JOptionPane.DEFAULT_OPTION       // Tipo de opciones
                                 , JOptionPane.INFORMATION_MESSAGE  // Tipo de mensaje (icono)
                                 , null                             // Icono (ninguno)
                                 , opciones                         // Opciones personalizadas
                                 , null                             // Opcion por defecto
                               );
            switch(opcion) {
                case 0:
                    if (fileChooser.showSaveDialog(null) == javax.swing.JFileChooser.APPROVE_OPTION) {
                        java.io.File file = fileChooser.getSelectedFile();
                        try {
                            try (java.io.FileWriter fileWriter = new java.io.FileWriter(file)) {
                                fileWriter.write(txtChat.getText());
                            }
                        } catch (IOException ex) {
                            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    break;
                case 1:
                    GuardaParcial parcial = new GuardaParcial();
                    try {
                        parcial.setHistorial(txtChat.getText());
                    } catch (BadLocationException ex) {
                        Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    parcial.setVisible(true);
                    String text = parcial.getHistorial();
                case 2:
                    break;
            }

        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se puede Guardar una Conversacion Vacia");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
        if(txtChat.getText().length()!= 0)
        {
            String mensaje = "Estas seguro que deseas volver al menu Principal";
            String titulo = "Volver al menu Principal";
      
            int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION)
            {
                Principal p = new Principal();
                this.setVisible(false);
                p.setVisible(true);
            }
        }
        else
        {
            Principal p = new Principal();
            this.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        String mensaje = "Estas seguro que deseas Borrar el Historial de Conversacion?";
        String titulo = "Borrar Historial";
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION)
        {
            txtChat.setText("");
        }
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        fontSize = (int)jSpinner1.getValue();
        StyledDocument doc = txtChat.getStyledDocument();
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        int length = doc.getLength();
        StyleConstants.setFontSize(attrs, fontSize);
        
        doc.setParagraphAttributes(0, length, attrs, false);
    }//GEN-LAST:event_jSpinner1StateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if(txtChat.getText().length()!= 0)
        {
            String mensaje = "Estas seguro que desea Salir";
            String titulo = "Volver al menu Principal"; 
      
            int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION)
            {
                Principal p = new Principal();
                this.setVisible(false);
                p.setVisible(true);
            }
        }
        else
        {
            Principal p = new Principal();
            this.setVisible(false);
            p.setVisible(true);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel lblVolumen;
    private javax.swing.JSlider sldVolumen;
    private javax.swing.JTextPane txtChat;
    private javax.swing.JTextArea txtMsg;
    // End of variables declaration//GEN-END:variables
}
