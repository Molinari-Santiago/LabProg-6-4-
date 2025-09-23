package juego_interfaz;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Enfrentamiento extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JPanel panelCentral;
	private JScrollPane scrollPane_1;
	private JList<Juego> list;
	private JPanel panelPersonajes;
	private JPanel panelEnfrentamiento;
	private JLabel lblNombre;
	private JTextField textFieldNombre;
	private JLabel lblNewLabelFuerza;
	private JTextField textFieldFuerza;
	private JLabel lblNewLabelResistencia;
	private JTextField textFieldResistencia;
	private JLabel lblNewLabelVelocidad;
	private JTextField textFieldVelocidad;
	private JLabel lblNewLabelInteligencia;
	private JTextField textFieldInteligencia;
	private JRadioButton rdbtnInteligencia;
	private JRadioButton rdbtnFuerza;
	private JRadioButton rdbtnResistencia;
	private JRadioButton rdbtnVelocidad;
	private JButton btnEnfrentar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPanel panel_1;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_11;
	private JPanel panel_12;
	private JPanel panel_13;
	private JList<Juego> list_1;
	private Cartas heroes=new Cartas();
	private DefaultListModel<Juego> ModeloLista= new DefaultListModel<Juego>();

	/**
	 * Create the panel.
	 */
	public Enfrentamiento() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		this.panel = new JPanel();
		add(this.panel);
		this.panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		this.scrollPane = new JScrollPane();
		this.panel.add(this.scrollPane);
		
		this.list_1 = new JList<Juego>();
		this.scrollPane.setViewportView(this.list_1);
		
		this.panelCentral = new JPanel();
		this.panel.add(this.panelCentral);
		this.panelCentral.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panelPersonajes = new JPanel();
		this.panelCentral.add(this.panelPersonajes);
		this.panelPersonajes.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panelPersonajes.add(this.panel_2);
		
		this.lblNombre = new JLabel("Nombre");
		this.panel_2.add(this.lblNombre);
		
		this.panel_3 = new JPanel();
		this.panelPersonajes.add(this.panel_3);
		this.panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		this.textFieldNombre = new JTextField();
		this.panel_3.add(this.textFieldNombre);
		this.textFieldNombre.setColumns(10);
		
		this.panel_5 = new JPanel();
		this.panelPersonajes.add(this.panel_5);
		
		this.lblNewLabelFuerza = new JLabel("Fuerza");
		this.panel_5.add(this.lblNewLabelFuerza);
		
		this.panel_4 = new JPanel();
		this.panelPersonajes.add(this.panel_4);
		
		this.textFieldFuerza = new JTextField();
		this.panel_4.add(this.textFieldFuerza);
		this.textFieldFuerza.setColumns(10);
		
		this.panel_6 = new JPanel();
		this.panelPersonajes.add(this.panel_6);
		
		this.lblNewLabelResistencia = new JLabel("Resistencia");
		this.panel_6.add(this.lblNewLabelResistencia);
		
		this.panel_13 = new JPanel();
		this.panelPersonajes.add(this.panel_13);
		
		this.textFieldResistencia = new JTextField();
		this.panel_13.add(this.textFieldResistencia);
		this.textFieldResistencia.setColumns(10);
		
		this.panel_7 = new JPanel();
		this.panelPersonajes.add(this.panel_7);
		
		this.lblNewLabelVelocidad = new JLabel("Velocidad");
		this.panel_7.add(this.lblNewLabelVelocidad);
		
		this.panel_12 = new JPanel();
		this.panelPersonajes.add(this.panel_12);
		
		this.textFieldVelocidad = new JTextField();
		this.panel_12.add(this.textFieldVelocidad);
		this.textFieldVelocidad.setColumns(10);
		
		this.panel_8 = new JPanel();
		this.panelPersonajes.add(this.panel_8);
		
		this.lblNewLabelInteligencia = new JLabel("Inteligencia");
		this.panel_8.add(this.lblNewLabelInteligencia);
		
		this.panel_11 = new JPanel();
		this.panelPersonajes.add(this.panel_11);
		
		this.textFieldInteligencia = new JTextField();
		this.panel_11.add(this.textFieldInteligencia);
		this.textFieldInteligencia.setColumns(10);
		
		this.panel_9 = new JPanel();
		this.panelPersonajes.add(this.panel_9);
		
		this.btnAgregar = new JButton("Agregar");
		this.btnAgregar.addActionListener(this);
		this.panel_9.add(this.btnAgregar);
		
		this.panel_10 = new JPanel();
		this.panelPersonajes.add(this.panel_10);
		
		this.btnEliminar = new JButton("Eliminar");
		this.panel_10.add(this.btnEliminar);
		this.btnEliminar.addActionListener(this);
		
		this.panelEnfrentamiento = new JPanel();
		this.panelCentral.add(this.panelEnfrentamiento);
		this.panelEnfrentamiento.setLayout(new GridLayout(0, 1, 0, 0));
		
		this.rdbtnFuerza = new JRadioButton("Fuerza");
		this.rdbtnFuerza.setSelected(true);
		buttonGroup.add(this.rdbtnFuerza);
		this.panelEnfrentamiento.add(this.rdbtnFuerza);
		
		this.rdbtnResistencia = new JRadioButton("Resistencia");
		buttonGroup.add(this.rdbtnResistencia);
		this.panelEnfrentamiento.add(this.rdbtnResistencia);
		
		this.rdbtnVelocidad = new JRadioButton("Velocidad");
		buttonGroup.add(this.rdbtnVelocidad);
		this.panelEnfrentamiento.add(this.rdbtnVelocidad);
		
		this.rdbtnInteligencia = new JRadioButton("Inteligencia");
		buttonGroup.add(this.rdbtnInteligencia);
		this.panelEnfrentamiento.add(this.rdbtnInteligencia);
		
		this.panel_1 = new JPanel();
		this.panelEnfrentamiento.add(this.panel_1);
		
		this.btnEnfrentar = new JButton("Enfrentar");
		this.panel_1.add(this.btnEnfrentar);
		this.btnEnfrentar.addActionListener(this);
		
		this.scrollPane_1 = new JScrollPane();
		this.panel.add(this.scrollPane_1);
		
		this.list = new JList<Juego>();
		this.scrollPane_1.setRowHeaderView(this.list);
		this.list.setModel(ModeloLista);
		this.list_1.setModel(ModeloLista);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnAgregar) {
			do_btnAgregar_actionPerformed(e);
		}
		if (e.getSource() == this.btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == this.btnEnfrentar) {
			do_btnEnfrentar_actionPerformed(e);
		}
	}
	private void do_btnEnfrentar_actionPerformed(ActionEvent e) {
		Juego h1=this.getSelectedValue();
		Juego h2=this.getSelectedValue();
		String atributo="";
		if(this.rdbtnFuerza.isSelected())
			atributo="Fuerza";
		else if(this.rdbtnResistencia.isSelected())
			atributo="Resistencia";
		else if(this.rdbtnVelocidad.isSelected())
			atributo="Velocidad";
		else if(this.rdbtnInteligencia.isSelected())
			atributo="Inteligencia";
		Juego ganador = this.juego.enfrentar(h1,h2, atributo);
		 
		

	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
		Juego=h this.list.getSelectedValue();
		if(h!=null) {
			this.heroes.eliminarHeroe(h);
			this.actualizaListas();
		}
	}
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
	String nombre=this.textFieldNombre.getText();
	int fuerza=Integer.parseInt(this.textFieldFuerza.getText());
	int resistencia=Integer.parseInt(this.textFieldResistencia.getText());
	int velocidad=Integer.parseInt(this.textFieldVelocidad.getText());
	int inteligencia=Integer.parseInt(this.textFieldInteligencia.getText());
	Juego=h new Juego(nombre,fuerza,resistencia,velocidad,inteligencia);
	this.heroes.agregarHeroe(h);
	
	this.actualizaListas();
	
	}

	private void actualizaListas() {
		this.ModeloLista.clear();
		Iterator<Juego> iterator=this.heroes.getHeroes();
		while(Iterator.hasNext())
			this.ModeloLista.addElement(Iterator.next);
		
	}
	}
