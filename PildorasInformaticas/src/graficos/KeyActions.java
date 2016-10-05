/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KeyActions.java
 *
 * Created on 1/06/2009, 11:13:08 AM
 */

package graficos;
//esto lo extraje de internet https://jaehoo.wordpress.com/2009/04/06/capturar-teclas-en-swing/
//pq queria ver como se  usaba el inputMap
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author alberto
 */
public class KeyActions extends javax.swing.JFrame {

    /** Creates new form KeyActions */
    public KeyActions() {
        initComponents();

        this.setLocationRelativeTo(null);

        mapeoTeclas();


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Acciones");

        jLabel2.setText("<html>\n\nF1 <br/>\nCTRL + O  \"Abrir/ Open\"<br/>\nCTRL + C  \"Copiar/Copy\"<br/>\nCTRL + V  \"Pegar/Paste\"<br/>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeyActions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    
    
    // ACCIONES
    public void mapeoTeclas(){

        ActionMap mapaAccion = jPanel1.getActionMap();
        InputMap map = jPanel1.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        //F1
        KeyStroke key_F1 = KeyStroke.getKeyStroke(KeyEvent.VK_F1,0);

        // CTRL + O
        KeyStroke ctrl_O = KeyStroke.getKeyStroke(KeyEvent.VK_O,Event.CTRL_MASK);

        // CTRL + C, CTRL + V
        KeyStroke ctrl_C = KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK, true);
        KeyStroke ctrl_V = KeyStroke.getKeyStroke(KeyEvent.VK_V,Event.CTRL_MASK, true);

        //Key Actions
        map.put(key_F1, "accion_F1");
        mapaAccion.put("accion_F1",Accion_F1());

        map.put(ctrl_O , "accion_ctrl_o");
        mapaAccion.put("accion_ctrl_o",Accion_CTRLO());

        map.put(ctrl_C , "accion_ctrl_C");
        mapaAccion.put("accion_ctrl_C",Accion_CTRLC());

        map.put(ctrl_V , "accion_ctrl_V");
        mapaAccion.put("accion_ctrl_V",Accion_CTRLV());
    }
       
    public AbstractAction Accion_CTRLO(){
        return new AbstractAction() {   public void actionPerformed(ActionEvent e) {   imprimir("CTRL + O"); }  };
    }
        
    public AbstractAction Accion_CTRLC(){
        return new AbstractAction() {   public void actionPerformed(ActionEvent e) {   imprimir("CTRL + C"); }  };
    }
        
    public AbstractAction Accion_CTRLV(){
        return new AbstractAction() {   public void actionPerformed(ActionEvent e) {   imprimir("CTRL + V"); }  };
    }

    public AbstractAction Accion_F1(){
        return new AbstractAction() {   public void actionPerformed(ActionEvent e) {   imprimir("F1"); }  };
    }

    public void imprimir(String cadena){
        System.out.println("Accion :"+ cadena);
        jTextField1.setText(cadena);
    }



}
