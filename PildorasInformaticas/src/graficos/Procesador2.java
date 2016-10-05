package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.FontSizeAction;

public class Procesador2 {

	public static void main(String[] args) {
		MarcoProcesador2 mimarco = new MarcoProcesador2();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoProcesador2 extends JFrame{
	public MarcoProcesador2() {
		setBounds(500,300,500,420);
		
		LaminaProcesador2 milamina = new LaminaProcesador2();
		add(milamina);
		setVisible(true);
	}
}
class LaminaProcesador2 extends JPanel{
	public LaminaProcesador2(){
		setLayout(new BorderLayout());
		JPanel laminamenu= new JPanel();
		fuente = new JMenu("Fuente");
		 tamano = new JMenu("Tama�o");
    	 estilo = new JMenu("Estilo");
    	 //todas las fuentes pero no queda bien pq es muy largo
    	  String [] array_fuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    	  String letra;
    	  for (int i=0;i<=array_fuentes.length-1;i++){
    		  letra=(String)array_fuentes[i];
    		  configura_menu(letra, "fuente",letra,0,0,"");
    	  }
		//estos elementos cambiar la letra
//		configura_menu("arial", "fuente","Arial",0,0,"");
//		configura_menu("courier", "fuente","Courier",0,0,"");
//		configura_menu("verdana", "fuente","Verdana",0,0,"");
    	  
    	  
    	  
		//este cambia el estilo. Lo comento para usar los checkbos
		configura_menu("Negrita", "estilo","",Font.BOLD,1,"src/graficos/negrita.gif");
		configura_menu("Cursiva", "estilo","",Font.ITALIC,1,"src/graficos/cursiva.gif");
		//no existe la constante para el subrayado, asi que le paso el codigo 99 y lo tratare como subrayado
		configura_menu("Subrayado", "estilo","",99,1,"src/graficos/subrayado.gif");
		//***********************************
		// ahora  voy a hacer los estilos  con checbox
		//***************************************
		 negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/graficos/negrita.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/graficos/cursiva.gif"));
		JCheckBoxMenuItem subrayado = new JCheckBoxMenuItem("Subrayado", new ImageIcon("src/graficos/subrayado.gif"));		
		negrita.addActionListener(new StyledEditorKit.BoldAction());		
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		subrayado.addActionListener(new StyledEditorKit.UnderlineAction());
		
		//Teclas rapidas y que aparezcan junto al menu
		negrita.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		cursiva.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		subrayado.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		
		
		estilo.add(negrita);
		estilo.add(cursiva);
		estilo.add(subrayado);
		//este configura el tamano. Ponemos 9 pq no equivale a ningun estilo
		configura_menu("12", "tamano","",9,12,"");
		configura_menu("16", "tamano","",9,16,"");
		configura_menu("20", "tamano","",9,20,"");
		configura_menu("24", "tamano","",9,24,"");
		//***********************************
		// ahora  voy a hacer los tama�os  con radiobutton
		//******************************************
		ButtonGroup tamanoo_letra = new ButtonGroup();
		JRadioButtonMenuItem tam12 = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem tam16 = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem tam20 = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem tam24 = new JRadioButtonMenuItem("24");
		//le pongo teclas rapidas
		tam24.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		tamanoo_letra.add(tam12);
		tamanoo_letra.add(tam16);
		tamanoo_letra.add(tam20);
		tamanoo_letra.add(tam24);
		tam12.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 12));
		tam16.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 16));
		tam20.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 20));
		tam24.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", 24));
		tamano.add(tam12);
		tamano.add(tam16);
		tamano.add(tam20);
		tamano.add(tam24);
		
		mibarra = new JMenuBar();
		mibarra.add(fuente);
		
		mibarra.add(estilo);
		mibarra.add(tamano);
		add(mibarra);//agrego el menu a la lamina
		laminamenu.add(mibarra);
		add(laminamenu, BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		//---------------------------------------------------
		//anado la Barra de Heramientas ToolBar a la izquierda video 111-112-113
/*		JToolBar barra = new JToolBar();
		//le ponemos vertical para que los botones se pongan en vertical
		barra.setOrientation(1);
		JButton negritaBarra = new JButton( new ImageIcon("src/graficos/negrita.gif"));
		//tengo una clase oyente que habilita o desabilita el check negrita del menu
		//esta clase herada de StyleEditorKit
		negritaBarra.addActionListener(new Oyente()); 
		
		JButton cursivaBarra = new JButton( new ImageIcon("src/graficos/cursiva.gif"));
        cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
        
		JButton subrayadoBarra = new JButton( new ImageIcon("src/graficos/subrayado.gif"));
		cursivaBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		//voy a anadir el cambiar el color al texto video 113
		//************************************************************************/
	/*	JButton azulBarra = new JButton( new ImageIcon("src/graficos/azul.gif"));
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.blue));
		JButton amarilloBarra = new JButton( new ImageIcon("src/graficos/amarillo.gif"));
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("amarillo", Color.blue.YELLOW));
		JButton rojoBarra = new JButton( new ImageIcon("src/graficos/rojo.gif"));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("rojo", Color.RED));
		//************************************************************************/
	/*	JButton a_izquierda = new JButton( new ImageIcon("src/graficos/izquierda.gif"));		
		a_izquierda.addActionListener(new StyledEditorKit.AlignmentAction("left", 0));		
		JButton a_centro = new JButton( new ImageIcon("src/graficos/centro.gif"));
		a_centro.addActionListener(new StyledEditorKit.AlignmentAction("centro",1));		
		JButton a_derecha = new JButton( new ImageIcon("src/graficos/derecha.gif"));
		a_derecha.addActionListener(new StyledEditorKit.AlignmentAction("derecha", 2));		
		JButton a_justificada = new JButton( new ImageIcon("src/graficos/justificado.gif"));
		a_justificada.addActionListener(new StyledEditorKit.AlignmentAction("justificado",StyleConstants.ALIGN_JUSTIFIED));	
		
		barra.add(negritaBarra);
		barra.add(cursivaBarra);
		barra.add(subrayadoBarra);
		barra.add(azulBarra);
		barra.add(amarilloBarra);
		barra.add(rojoBarra);

		barra.add(a_izquierda);
		barra.add(a_centro);
		barra.add(a_derecha);
		barra.add(a_justificada);*/
		
		
		/*optimizamos el codigo de arriba como se ve el el video 114*/
	    barra = new JToolBar();
		configura_barra("src/graficos/negrita.gif").addActionListener(new Oyente());
		configura_barra("src/graficos/subrayado.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		configura_barra("src/graficos/cursiva.gif").addActionListener(new StyledEditorKit.ItalicAction());
		
		barra.addSeparator();
		configura_barra("src/graficos/azul.gif").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.blue));
		configura_barra("src/graficos/rojo.gif").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.RED));
		configura_barra("src/graficos/amarillo.gif").addActionListener(new StyledEditorKit.ForegroundAction("azul", Color.YELLOW));
		barra.addSeparator();
		configura_barra("src/graficos/izquierda.gif").addActionListener(new StyledEditorKit.AlignmentAction("left", 0));	
		configura_barra("src/graficos/centro.gif").addActionListener(new StyledEditorKit.AlignmentAction("left", 1));	
		configura_barra("src/graficos/derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("left", 2));	
		configura_barra("src/graficos/derecha.gif").addActionListener(new StyledEditorKit.AlignmentAction("left", StyleConstants.ALIGN_JUSTIFIED));	
		barra.setOrientation(1);
		add(barra, BorderLayout.WEST);
		
		/*creamos un metodo para crear la barra de herramientas*/
		
		//****************************************
		//anado el menu contextual
		//***********************************************
		JPopupMenu emergente = new JPopupMenu();
		//agregamos lo elementos del menu
		JMenuItem  negritam = new JMenuItem("Negrita");
		emergente.add(negritam);
		JMenuItem  cursivam= new JMenuItem("Cursiva");
		emergente.add(cursivam);
		JMenuItem  subrayadom= new JMenuItem("Subrayado");
		emergente.add(subrayadom);
		miarea.setComponentPopupMenu(emergente);
		negritam.addActionListener(new Oyente());
		cursivam.addActionListener(new StyledEditorKit.ItalicAction());
		subrayadom.addActionListener(new StyledEditorKit.UnderlineAction());
		
	}
	 
	private JMenuBar mibarra;
	private JTextPane miarea ;
	JMenu fuente, estilo, tamano;
	Font letras;
	JCheckBoxMenuItem negrita;
	JButton negritaBarra, cursivaBarra, subrayadoBarra, rojoBarra, amarilloBarra, azulBarra, a_izquierda, a_centrado, a_derecha, a_justificado;
	JToolBar barra;
	
	
	/*creamos un metodo para crear la barra de herramientas*/
	public JButton configura_barra(String ruta) {
		JButton boton = new JButton(new ImageIcon(ruta));
		barra.add(boton);
		return boton;
	}
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilos, int tamanoo, String ruta){
		JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta));
		
	    if (menu=="fuente") {
	    	fuente.add(elem_menu);
	    	elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("", tipo_letra));
	    }else if (menu=="estilo") {
	    	estilo.add(elem_menu);
	    	if (estilos == Font.BOLD){
	    		elem_menu.addActionListener(new StyledEditorKit.BoldAction());
	    	}else if (estilos == Font.ITALIC){
	    		elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
	    	}else if (estilos == 99){
	    		elem_menu.addActionListener(new StyledEditorKit.UnderlineAction());
	    	}
	    }else if (menu=="tamano") {
	    	tamano.add(elem_menu);
	    	//el primer arg ponemos cualquier cosas
	    	elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", tamanoo));
	    }
		//elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos,tamanoo));
	
	}
	class Oyente extends StyledEditorKit.BoldAction {
		public  Oyente(){
			super();
		}
		public void actionPerformed(ActionEvent e) {
			super.actionPerformed( e);
			
				negrita.setSelected(!negrita.isSelected());
			 
		} 
	}
}
