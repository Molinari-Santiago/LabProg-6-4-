package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import paquete.Arquero;
import paquete.Caballero;
import paquete.Guerrero;
import paquete.Juego;
import paquete.Mago;
import paquete.Personaje;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	private JScrollPane scrollPane_1;
	private JPanel panel_2;
	private JScrollPane scrollPane_2;
	private JList<Personaje> list; 
	private JList<Personaje> list_2;
	private JPanel panel_5;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Juego juego = new Juego();
	private DefaultListModel<Personaje> modeloLista = new DefaultListModel<Personaje>();
	private JPanel panel_22;
	private JPanel panel_3;
	private JPanel panel_4;
	private JButton btnNewAtacar;
	private JPanel panel_6;
	private JPanel panel_7;
	private JPanel panel_8;
	private JPanel panel_9;
	private JLabel lblNewLabel;
	private JPanel panel_10;
	private JPanel panel_11;
	private JTextField textFieldMoverX;
	private JPanel panel_12;
	private JPanel panel_13;
	private JLabel lblNewLabel_1;
	private JTextField textFieldMoverY;
	private JButton btnNewButtonMover;
	private JPanel panel_14;
	private JPanel panel_15;
	private JPanel panel_16;
	private JPanel panel_18;
	private JPanel panel_17;
	private JPanel panel_19;
	private JLabel lblNewLabel_2;
	private JTextField textFieldY;
	private JPanel panel_20;
	private JPanel panel_21;
	private JLabel lblNewLabel_3;
	private JPanel panel_23;
	private JTextField textFieldNombre;
	private JPanel panel_24;
	private JPanel panel_25;
	private JLabel lblNewLabel_4;
	private JPanel panel_26;
	private JTextField textFieldX;
	private JButton btnNewButtonAgregarPersonaje;
	private JPanel panel_27;
	private JButton btnNewButtonEliminarPersonaje;
	private JComboBox<Object> comboBox;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1237, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 4, 0, 0));
		
		scrollPane_1 = new JScrollPane();
		panel.add(scrollPane_1);
		
		list = new JList<Personaje>();
		scrollPane_1.setViewportView(list);
		
		panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 1, 0, 0));
		
		panel_5 = new JPanel();
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));
		
		panel_4 = new JPanel();
		panel_5.add(panel_4);
		
		btnNewAtacar = new JButton("Atacar");
		btnNewAtacar.addActionListener(this);
		panel_4.add(btnNewAtacar);
		
		panel_3 = new JPanel();
		panel_5.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));
		
		panel_7 = new JPanel();
		panel_3.add(panel_7);
		panel_7.setLayout(new GridLayout(2, 2, 0, 0));
		
		panel_9 = new JPanel();
		panel_7.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_10 = new JPanel();
		panel_9.add(panel_10);
		
		lblNewLabel = new JLabel("X:");
		panel_10.add(lblNewLabel);
		
		panel_11 = new JPanel();
		panel_9.add(panel_11);
		
		textFieldMoverX = new JTextField();
		panel_11.add(textFieldMoverX);
		textFieldMoverX.setColumns(10);
		
		panel_8 = new JPanel();
		panel_7.add(panel_8);
		panel_8.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_12 = new JPanel();
		panel_8.add(panel_12);
		
		lblNewLabel_1 = new JLabel("Y:");
		panel_12.add(lblNewLabel_1);
		
		panel_13 = new JPanel();
		panel_8.add(panel_13);
		
		textFieldMoverY = new JTextField();
		panel_13.add(textFieldMoverY);
		textFieldMoverY.setColumns(10);
		
		panel_6 = new JPanel();
		panel_3.add(panel_6);
		
		btnNewButtonMover = new JButton("Mover");
		btnNewButtonMover.addActionListener(this);
		panel_6.add(btnNewButtonMover);
		
		scrollPane_2 = new JScrollPane();
		panel.add(scrollPane_2);
		
		list_2 = new JList<Personaje>();
		scrollPane_2.setViewportView(list_2);
		
		panel_22 = new JPanel();
		panel.add(panel_22);
		panel_22.setLayout(new GridLayout(3, 0, 0, 0));
		
		panel_14 = new JPanel();
		panel_22.add(panel_14);
		panel_14.setLayout(new GridLayout(3, 2, 0, 0));
		
		panel_20 = new JPanel();
		panel_14.add(panel_20);
		panel_20.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_21 = new JPanel();
		panel_20.add(panel_21);
		
		lblNewLabel_3 = new JLabel("Nombre: ");
		panel_21.add(lblNewLabel_3);
		
		panel_23 = new JPanel();
		panel_20.add(panel_23);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		panel_23.add(textFieldNombre);
		
		panel_24 = new JPanel();
		panel_14.add(panel_24);
		panel_24.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_25 = new JPanel();
		panel_24.add(panel_25);
		
		lblNewLabel_4 = new JLabel("X:");
		panel_25.add(lblNewLabel_4);
		
		panel_26 = new JPanel();
		panel_24.add(panel_26);
		
		textFieldX = new JTextField();
		textFieldX.setColumns(10);
		panel_26.add(textFieldX);
		
		panel_18 = new JPanel();
		panel_14.add(panel_18);
		panel_18.setLayout(new GridLayout(0, 2, 0, 0));
		
		panel_19 = new JPanel();
		panel_18.add(panel_19);
		
		lblNewLabel_2 = new JLabel("Y:");
		panel_19.add(lblNewLabel_2);
		
		panel_17 = new JPanel();
		panel_18.add(panel_17);
		
		textFieldY = new JTextField();
		panel_17.add(textFieldY);
		textFieldY.setColumns(10);
		
		panel_16 = new JPanel();
		panel_22.add(panel_16);
		panel_16.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		comboBox = new JComboBox<Object>();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mago", "Arquero", "Caballero", "Guerrero"}));
		panel_16.add(comboBox);
		
		panel_15 = new JPanel();
		panel_22.add(panel_15);
		panel_15.setLayout(new GridLayout(0, 1, 0, 0));
		
		panel_27 = new JPanel();
		panel_15.add(panel_27);
		panel_27.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnNewButtonEliminarPersonaje = new JButton("Eliminar personaje");
		btnNewButtonEliminarPersonaje.addActionListener(this);
		panel_27.add(btnNewButtonEliminarPersonaje);
		
		btnNewButtonAgregarPersonaje = new JButton("Agregar personaje");
		btnNewButtonAgregarPersonaje.addActionListener(this);
		panel_27.add(btnNewButtonAgregarPersonaje);
		
		panel_1 = new JPanel();
		panel_1.setPreferredSize(new Dimension(10, 80));
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane, BorderLayout.SOUTH);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		this.list.setModel(modeloLista);
		this.list_2.setModel(modeloLista);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButtonAgregarPersonaje) {
			do_btnNewButtonAgregarPersonaje_actionPerformed(e);
		}
		if (e.getSource() == btnNewButtonEliminarPersonaje) {
			do_btnNewButtonEliminarPersonaje_actionPerformed(e);
		}
		if (e.getSource() == btnNewButtonMover) {
			do_btnNewButtonMover_actionPerformed(e);
		}
		if (e.getSource() == btnNewAtacar) {
			do_btnNewAtacar_actionPerformed(e);
		}
	}
	
	protected void do_btnNewAtacar_actionPerformed(ActionEvent e) {
		Personaje p1 = this.list.getSelectedValue();
		Personaje p2 = this.list_2.getSelectedValue();
		
		boolean ganador = this.juego.Atacar(p1, p2);
		
		String cartelito = "Se enfrentaron: " + p1.getNombre() + " y " + p2.getNombre() + "\n";
		if (ganador == false) {
			cartelito = cartelito + " La distancia es muy larga, acercate mas" + "\n";  
		} if (ganador == true && p2.getVitalidad() <= 0){
			cartelito =cartelito + " El jugador " + p2.getNombre() +  " murió" + "\n";
			this.juego.EliminarPersonaje(p2);
			this.actualizaLista();
		} else if (ganador == true && p2.getVitalidad() > 0) {
			cartelito =cartelito + " El jugador " + p2.getNombre() +  " ahora tiene " + p2.getVitalidad() + " de vida" + "\n";
		}
		this.textArea.append(cartelito);
	}
	protected void do_btnNewButtonMover_actionPerformed(ActionEvent e) {
		double X = Integer.parseInt(this.textFieldMoverX.getText());
		double Y = Integer.parseInt(this.textFieldMoverY.getText());
		Personaje p = this.list.getSelectedValue();
		if (p != null) {
			this.juego.MoverPersonaje(X, Y, p);
			this.actualizaLista();
			this.textArea.append("Se movió a " + p.getNombre() + "\n");
		}
	}
	protected void do_btnNewButtonEliminarPersonaje_actionPerformed(ActionEvent e) {
		Personaje p = this.list.getSelectedValue();
		if (p != null) {
			this.juego.EliminarPersonaje(p);
			this.actualizaLista();
			this.textArea.append("Se eliminó a " + p.getNombre() + "\n");
		}
	}
	protected void do_btnNewButtonAgregarPersonaje_actionPerformed(ActionEvent e) {
		String nombre = this.textFieldNombre.getText();
		double X = Integer.parseInt(this.textFieldX.getText());
		double Y = Integer.parseInt(this.textFieldY.getText());
		
		String tipo = (String) comboBox.getSelectedItem();

		Personaje p = null;

		switch (tipo) {
		    case "Mago":
		        p = new Mago(nombre,"Mago", X, Y);
		        break;
		    case "Arquero":
		        p = new Arquero(nombre, "Arquero",X, Y);
		        break;
		    case "Guerrero":
		        p = new Guerrero(nombre, "Guerrero",X, Y);
		        break;
		    case "Caballero":
		        p = new Caballero(nombre, "Caballero" ,X, Y);
		        break;
		}
		
		
		this.juego.AgregarPersonaje(p);
		this.textArea.append("Se agregó a " + p.getNombre() + "\n");
		this.actualizaLista();	 
	}
	private void actualizaLista() {
		// TODO Auto-generated method stub
		this.modeloLista.clear();
		
		Iterator<Personaje> iterator= this.juego.getpersonajes();
		
		while(iterator.hasNext())
			this.modeloLista.addElement(iterator.next());
	}
}
