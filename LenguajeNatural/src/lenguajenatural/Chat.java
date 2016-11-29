/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 * Prueba para #Slack
 */

package lenguajenatural;

import com.inet.jortho.FileUserDictionary;
import com.inet.jortho.PopupListener;
import com.inet.jortho.SpellChecker;
import com.inet.jortho.SpellCheckerOptions;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.StyleConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyledDocument;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Color;
//import Gramatica.*;


/**
 *
 * @author basu
 */
public class Chat extends javax.swing.JFrame {

    /**
     * Creates new form Chat
     */
    private int fontSize;
    private boolean bandera;
    public char gramatica;
    private VoiceManager freettsVM;
    private Voice freettsVoice;
    private String dir;
    private String vozNombre;
    private String temaOntologia = "Francia";
    
    public Chat() {
        initComponents();
        txtMsg.setRows(2);
        txtMsg.setColumns(10);
        txtMsg.setLineWrap(true);
        txtMsg.setWrapStyleWord(true);
        fontSize = 13;
        bandera = false;
        vozNombre = "mbrola_us1";
        cargaDominios();
        //gramatica = '';//default
        
        SpellChecker.setUserDictionaryProvider(new FileUserDictionary());      
        SpellChecker.registerDictionaries(this.getClass().getResource("/dictionary"), "es");
        SpellChecker.register(txtMsg);
        
        SpellCheckerOptions sco = new SpellCheckerOptions();
        sco.setCaseSensitive(true);
        sco.setSuggestionsLimitMenu(10);
        JPopupMenu popup = SpellChecker.createCheckerPopup(sco);
        txtMsg.addMouseListener(new PopupListener(popup));
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
        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cbDominio = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        sldVolumen = new javax.swing.JSlider();
        jPanel5 = new javax.swing.JPanel();
        cbTipoVoz = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMsg = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat"));

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

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrar)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dominio"));

        cbDominio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Francia", "Ferrari", "Bill Gates", "Python" }));
        cbDominio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDominioItemStateChanged(evt);
            }
        });
        cbDominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDominioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbDominio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(cbDominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tamaño de Fuente"));

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(13, 5, 20, 1));
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Volumen"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(sldVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sldVolumen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Voz"));

        cbTipoVoz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mujer", "Hombre 1", "Hombre 2" }));
        cbTipoVoz.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTipoVozItemStateChanged(evt);
            }
        });
        cbTipoVoz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoVozActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbTipoVoz, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cbTipoVoz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat"));

        txtChat.setEditable(false);
        jScrollPane3.setViewportView(txtChat);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Mensaje"));

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

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnEnviar)
                .addContainerGap(37, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
        } catch (BadLocationException | IOException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }           
    }//GEN-LAST:event_txtMsgKeyPressed

    private void cargaDominios(){
        //cbDominio.removeAllItems();
        /*File dir = new File("Ontologias/");
        String[] ficheros = dir.list();
        if (ficheros == null)
        {*/
        //System.out.println("No hay ficheros en el directorio especificado");
        /*}
        else { 
          for (int x=0;x<ficheros.length;x++)
            //System.out.println(ficheros[x]);
          cbDominio.addItem(ficheros[x]);
        }
        bandera = true;*/
    }
    
    private void txtMsgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgKeyReleased
        // TODO add your handling code here:
         int key = evt.getKeyCode();
         
         if(key == java.awt.event.KeyEvent.VK_ENTER)
             txtMsg.setText(null); 
    }//GEN-LAST:event_txtMsgKeyReleased

    private void addString() throws BadLocationException, IOException {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int sec = Calendar.getInstance().get(Calendar.SECOND);
        String entrada;
        
        entrada = "[Usted][" + hour + ":" + min + ":" + sec + "] "
                            +txtMsg.getText() + "\n";
        
        StyledDocument doc = txtChat.getStyledDocument();
        int length = doc.getLength();
            
        SimpleAttributeSet attrs = new SimpleAttributeSet();
        
        StyleConstants.setBold(attrs, true);
        StyleConstants.setForeground(attrs, Color.BLUE);
        StyleConstants.setAlignment(attrs, StyleConstants.ALIGN_LEFT);
        StyleConstants.setFontSize(attrs, fontSize);
                
        doc.insertString(doc.getLength(), entrada, null);
        doc.setParagraphAttributes(length+1, 1, attrs, false);
        
        this.GeneraRespuesta(txtMsg.getText());
        
        txtMsg.setText(null);
    }
    
    private String hacePregunta(String preg) throws IOException {
        String respuesta = "";
        ANTLRInputStream input;
        try {
            MyErrorListener listener = new MyErrorListener();
            input = new ANTLRInputStream(preg);
            if(gramatica == 'd'){
                GramaticaLexer lexer = new GramaticaLexer(input);
                lexer.removeErrorListeners();
                lexer.addErrorListener(listener);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                GramaticaParser parser = new GramaticaParser(tokens);
                parser.removeErrorListeners();    
                parser.addErrorListener(listener);
                //parser.prog();
                parser.s();
            } else if(gramatica == 'c'){
                input = new ANTLRInputStream(preg+"\n");
                MyGrammarLexer lexer = new MyGrammarLexer(input);
                lexer.removeErrorListeners();
                lexer.addErrorListener(listener);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                MyGrammarParser parser = new MyGrammarParser(tokens);
                parser.removeErrorListeners();    
                parser.addErrorListener(listener);
                //parser.prog();
                parser.prog();
                respuesta = String.valueOf(parser.resultado);
            }
            
            if(listener.error){
                respuesta = "Lo siento, no te entiendo";
            }
        } catch (RecognitionException ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return respuesta;
    }
    
    private void GeneraRespuesta(String pregunta) throws BadLocationException, IOException {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        int min = Calendar.getInstance().get(Calendar.MINUTE);
        int sec = Calendar.getInstance().get(Calendar.SECOND);
        
        String respuesta;
        String res = "";
        res = this.hacePregunta(pregunta);
        
        ConsultaOntologia con = new ConsultaOntologia(temaOntologia,pregunta);
        res = con.getResultado().trim();
        System.out.println("*" + res + "*" + res.length());
        
        
        if(res.length() > 0) {
            respuesta = "[OntoBot][" + hour + ":" + min + ":" + sec + "] "
                            + res + "\n";
        } else {
            res = "Lo siento, no poseo esa información";
            respuesta = "[OntoBot][" + hour + ":" + min + ":" + sec + "] "
                            + res + "\n";
            //res = "OK";
        }
        
        reproduceVoz(res);
        
        StyledDocument doc = txtChat.getStyledDocument();
        int length = doc.getLength();
        SimpleAttributeSet attrsResp = new SimpleAttributeSet();
        StyleConstants.setForeground(attrsResp, Color.RED);
        StyleConstants.setBold(attrsResp, false);
        StyleConstants.setAlignment(attrsResp, StyleConstants.ALIGN_RIGHT);
        StyleConstants.setFontSize(attrsResp, fontSize);
        doc.insertString(doc.getLength(), respuesta, null);
        doc.setParagraphAttributes(length+1, 1, attrsResp, false);
        
        
    }
    
    private void reproduceVoz(String texto) {
        File miDir = new File (".");
        try {
          dir = (miDir.getCanonicalPath() + "\\mbrola");
          }
        catch(Exception e) {
          e.printStackTrace();
       }
        // Most important part!
        System.out.println(dir);
        System.setProperty("mbrola.base", dir);
        freettsVM = VoiceManager.getInstance();

        // Simply change to MBROLA voice
        freettsVoice = freettsVM.getVoice(vozNombre);
        // Allocate your chosen voice
        freettsVoice.allocate();
        sayWords(texto);    
    }
    
    private void sayWords(String words) {
        // Make her speak!
        freettsVoice.speak(words);
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
        catch (BadLocationException | IOException ex)
        {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if(txtChat.getText().length()!=0)
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
        
        if(txtChat.getText().length() != 0)
        {
            String mensaje = "Estas seguro que deseas Borrar el Historial de Conversacion?";
        String titulo = "Borrar Historial";
        int respuesta = JOptionPane.showConfirmDialog(null, mensaje, titulo, JOptionPane.YES_NO_OPTION);
        
        if (respuesta == JOptionPane.YES_OPTION)
        {
            txtChat.setText("");
        }
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

    private void cbDominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDominioActionPerformed
        // TODO add your handling code here:
        if(!bandera) {
            JOptionPane.showMessageDialog(null, "Se ha cambiado el dominio a " + cbDominio.getSelectedItem());
            temaOntologia = cbDominio.getSelectedItem().toString();
            System.out.println("Este es el tema:" + temaOntologia);
            
            
        }
        
    }//GEN-LAST:event_cbDominioActionPerformed

    private void cbDominioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDominioItemStateChanged
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Se ha cambiado el dominio a " + cbDominio.getSelectedItem());
    }//GEN-LAST:event_cbDominioItemStateChanged

    private void cbTipoVozActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoVozActionPerformed
        // TODO add your handling code here:
        switch(cbTipoVoz.getSelectedIndex()){
            case 0:
                vozNombre = "mbrola_us1";
                break;
            case 1:
                vozNombre = "mbrola_us2";
                break;
            case 2:
                vozNombre = "mbrola_us3";
                break;
        }
    }//GEN-LAST:event_cbTipoVozActionPerformed

    private void cbTipoVozItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTipoVozItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoVozItemStateChanged

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
    private javax.swing.JComboBox<String> cbDominio;
    private javax.swing.JComboBox<String> cbTipoVoz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JSlider sldVolumen;
    private javax.swing.JTextPane txtChat;
    private javax.swing.JTextArea txtMsg;
    // End of variables declaration//GEN-END:variables
}
