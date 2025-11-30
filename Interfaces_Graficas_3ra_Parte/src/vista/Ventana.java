package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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

import paquete.Asignaturas;
import paquete.Curso;
import paquete.Estudiantes;
import paquete.Profesores;
import paquete.Persona;
import paquete.Sistema;
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
    private JList<Persona> list; 
    private JList<Curso> list_2;
    private JPanel panel_5;
    private JTextArea textArea;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private Sistema sistema = new Sistema();
    private DefaultListModel<Persona> modeloListaPersonas = new DefaultListModel<Persona>();
    private DefaultListModel<Curso> modeloListaCursos = new DefaultListModel<Curso>();
    private JPanel panel_22;
    private JPanel panel_3;
    private JPanel panel_4;
    private JButton btnAsignarCurso;
    private JPanel panel_6;
    private JPanel panel_7;
    private JPanel panel_8;
    private JPanel panel_9;
    private JLabel lblNewLabel;
    private JPanel panel_10;
    private JPanel panel_11;
    private JTextField textFieldNombre;
    private JPanel panel_12;
    private JPanel panel_13;
    private JLabel lblNewLabel_1;
    private JTextField textFieldEdad;
    private JButton btnActualizar;
    private JPanel panel_14;
    private JPanel panel_15;
    private JPanel panel_16;
    private JPanel panel_18;
    private JPanel panel_17;
    private JPanel panel_19;
    private JLabel lblNewLabel_2;
    private JTextField textFieldID;
    private JPanel panel_20;
    private JPanel panel_21;
    private JLabel lblNewLabel_3;
    private JPanel panel_23;
    private JTextField textFieldNombrePersona;
    private JPanel panel_24;
    private JPanel panel_25;
    private JLabel lblNewLabel_4;
    private JPanel panel_26;
    private JTextField textFieldEspecialidad;
    private JButton btnAgregarPersona;
    private JPanel panel_27;
    private JButton btnEliminarPersona;
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
        
        list = new JList<Persona>();
        scrollPane_1.setViewportView(list);
        
        panel_2 = new JPanel();
        panel.add(panel_2);
        panel_2.setLayout(new GridLayout(1, 1, 0, 0));
        
        panel_5 = new JPanel();
        panel_2.add(panel_5);
        panel_5.setLayout(new GridLayout(2, 1, 0, 0));
        
        panel_4 = new JPanel();
        panel_5.add(panel_4);
        
        btnAsignarCurso = new JButton("Asignar Curso");
        btnAsignarCurso.addActionListener(this);
        panel_4.add(btnAsignarCurso);
        
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
        
        lblNewLabel = new JLabel("Nombre:");
        panel_10.add(lblNewLabel);
        
        panel_11 = new JPanel();
        panel_9.add(panel_11);
        
        textFieldNombre = new JTextField();
        panel_11.add(textFieldNombre);
        textFieldNombre.setColumns(10);
        
        panel_8 = new JPanel();
        panel_7.add(panel_8);
        panel_8.setLayout(new GridLayout(0, 2, 0, 0));
        
        panel_12 = new JPanel();
        panel_8.add(panel_12);
        
        lblNewLabel_1 = new JLabel("DNI:");
        panel_12.add(lblNewLabel_1);
        
        panel_13 = new JPanel();
        panel_8.add(panel_13);
        
        textFieldEdad = new JTextField();
        panel_13.add(textFieldEdad);
        textFieldEdad.setColumns(10);
        
        panel_6 = new JPanel();
        panel_3.add(panel_6);
        
        btnActualizar = new JButton("Actualizar");
        btnActualizar.addActionListener(this);
        panel_6.add(btnActualizar);
        
        scrollPane_2 = new JScrollPane();
        panel.add(scrollPane_2);
        
        list_2 = new JList<Curso>();
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
        
        lblNewLabel_3 = new JLabel("Nombre:");
        panel_21.add(lblNewLabel_3);
        
        panel_23 = new JPanel();
        panel_20.add(panel_23);
        
        textFieldNombrePersona = new JTextField();
        textFieldNombrePersona.setColumns(10);
        panel_23.add(textFieldNombrePersona);
        
        panel_24 = new JPanel();
        panel_14.add(panel_24);
        panel_24.setLayout(new GridLayout(0, 2, 0, 0));
        
        panel_25 = new JPanel();
        panel_24.add(panel_25);
        
        lblNewLabel_4 = new JLabel("DNI:");
        panel_25.add(lblNewLabel_4);
        
        panel_26 = new JPanel();
        panel_24.add(panel_26);
        
        textFieldID = new JTextField();
        textFieldID.setColumns(10);
        panel_26.add(textFieldID);
        
        panel_18 = new JPanel();
        panel_14.add(panel_18);
        panel_18.setLayout(new GridLayout(0, 2, 0, 0));
        
        panel_19 = new JPanel();
        panel_18.add(panel_19);
        
        lblNewLabel_2 = new JLabel("CUIL/Legajo:");
        panel_19.add(lblNewLabel_2);
        
        panel_17 = new JPanel();
        panel_18.add(panel_17);
        
        textFieldEspecialidad = new JTextField();
        panel_17.add(textFieldEspecialidad);
        textFieldEspecialidad.setColumns(10);
        
        panel_16 = new JPanel();
        panel_22.add(panel_16);
        panel_16.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        comboBox = new JComboBox<Object>();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Estudiante", "Profesor"}));
        panel_16.add(comboBox);
        
        panel_15 = new JPanel();
        panel_22.add(panel_15);
        panel_15.setLayout(new GridLayout(0, 1, 0, 0));
        
        panel_27 = new JPanel();
        panel_15.add(panel_27);
        panel_27.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        btnEliminarPersona = new JButton("Eliminar persona");
        btnEliminarPersona.addActionListener(this);
        panel_27.add(btnEliminarPersona);
        
        btnAgregarPersona = new JButton("Agregar persona");
        btnAgregarPersona.addActionListener(this);
        panel_27.add(btnAgregarPersona);
        
        panel_1 = new JPanel();
        panel_1.setPreferredSize(new Dimension(10, 80));
        contentPane.add(panel_1, BorderLayout.SOUTH);
        panel_1.setLayout(new BorderLayout(0, 0));
        
        JScrollPane scrollPane = new JScrollPane();
        panel_1.add(scrollPane, BorderLayout.SOUTH);
        
        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);
        
        this.list.setModel(modeloListaPersonas);
        this.list_2.setModel(modeloListaCursos);
        
        actualizarListas();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregarPersona) {
            do_btnAgregarPersona_actionPerformed(e);
        }
        if (e.getSource() == btnEliminarPersona) {
            do_btnEliminarPersona_actionPerformed(e);
        }
        if (e.getSource() == btnActualizar) {
            do_btnActualizar_actionPerformed(e);
        }
        if (e.getSource() == btnAsignarCurso) {
            do_btnAsignarCurso_actionPerformed(e);
        }
    }
    
    protected void do_btnAsignarCurso_actionPerformed(ActionEvent e) {
        Persona persona = this.list.getSelectedValue();
        Curso curso = this.list_2.getSelectedValue();
        
        if (persona != null && curso != null) {
            if (persona instanceof Profesores) {
                Profesores profesor = (Profesores) persona;
                for (Asignaturas asignatura : curso.getAsignaturas()) {
                    profesor.getAsignaturasDadas().add(asignatura);
                }
                this.textArea.append("Se asignaron las asignaturas del curso " + curso.getNombre() + 
                                   " al profesor " + persona.getNombre() + "\n");
            } else if (persona instanceof Estudiantes) {
                this.textArea.append("Curso " + curso.getNombre() + " asignado al estudiante " + 
                                   persona.getNombre() + "\n");
            }
        } else {
            this.textArea.append("Seleccione una persona y un curso para asignar\n");
        }
    }
    
    protected void do_btnActualizar_actionPerformed(ActionEvent e) {
        Persona persona = this.list.getSelectedValue();
        if (persona != null) {
            String nuevoNombre = this.textFieldNombre.getText();
            String dni = this.textFieldEdad.getText();
            
            if (!nuevoNombre.isEmpty()) {
                persona.setNombre(nuevoNombre);
            }
            if (!dni.isEmpty()) {
                persona.setDni(dni);
            }
            this.actualizarListas();
            this.textArea.append("Se actualizó la información de " + persona.getNombre() + "\n");
        }
    }
    
    protected void do_btnEliminarPersona_actionPerformed(ActionEvent e) {
        Persona persona = this.list.getSelectedValue();
        if (persona != null) {
            if (persona instanceof Estudiantes) {
                sistema.EliminarAlumno((Estudiantes) persona);
            } else if (persona instanceof Profesores) {
                sistema.EliminarProfesor((Profesores) persona);
            }
            this.actualizarListas();
            this.textArea.append("Se eliminó a " + persona.getNombre() + "\n");
        }
    }
    
    protected void do_btnAgregarPersona_actionPerformed(ActionEvent e) {
        String nombre = this.textFieldNombrePersona.getText();
        String dni = this.textFieldID.getText();
        String cuilLegajo = this.textFieldEspecialidad.getText();
        
        String tipo = (String) comboBox.getSelectedItem();

        Persona persona = null;

        if (tipo.equals("Estudiante")) {
            persona = new Estudiantes(nombre, dni, cuilLegajo);
            sistema.AgregarAlumno((Estudiantes) persona);
        } else if (tipo.equals("Profesor")) {
            ArrayList<Asignaturas> asignaturasVacias = new ArrayList<>();
            persona = new Profesores(nombre, dni, cuilLegajo, asignaturasVacias);
            sistema.AgregarProfesor((Profesores) persona);
        }
        
        if (persona != null) {
            this.textArea.append("Se agregó a " + persona.getNombre() + " como " + tipo + "\n");
            this.textFieldNombrePersona.setText("");
            this.textFieldID.setText("");
            this.textFieldEspecialidad.setText("");
            this.actualizarListas();
        }     
    }
    
    private void actualizarListas() {
        this.modeloListaPersonas.clear();
        
        Iterator<Persona> iteratorPersonas = sistema.getTodasLasPersonas();
        while(iteratorPersonas.hasNext()) {
            this.modeloListaPersonas.addElement(iteratorPersonas.next());
        }
        
        this.modeloListaCursos.clear();
        Iterator<Curso> iteratorCursos = sistema.getcursos();
        while(iteratorCursos.hasNext()) {
            this.modeloListaCursos.addElement(iteratorCursos.next());
        }
    }
}