package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//esta apliacacion te coge todos los lenguajes que tienes en tu ordenador y te los muestra en el combo
public class CajasCombos {
    public static void main(String[] args){
        MarcoCombo2 marco = new MarcoCombo2();
    }
}

class MarcoCombo2 extends JFrame {
    private static final Color fondo = SystemColor.window;
    private JLabel texto = new JLabel("En un lugar de la Mancha...", JLabel.CENTER);
    private JComboBox combo = new JComboBox();
    private JPanel panel2 = new JPanel();
    private String fuentes[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

    public MarcoCombo2(){
        setVisible(true);
        setTitle("Cajas de ComboBox");
        setSize(500,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new PanelCombo2());
    }

    private class PanelCombo2 extends JPanel {
        public PanelCombo2(){
            setLayout(new BorderLayout());
            setBackground(fondo);
            add(texto, BorderLayout.CENTER);
            texto.setFont(new Font("Serif", Font.PLAIN, 18));
            panel2.setBackground(fondo);
            panel2.add(combo);
            add(panel2, BorderLayout.NORTH);
            for(String f:fuentes){
                combo.addItem(f);
            }
            combo.setEditable(true);
            combo.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    texto.setFont(new Font((String)combo.getSelectedItem(), Font.PLAIN, 18));
                }
            });
        }
    }
}