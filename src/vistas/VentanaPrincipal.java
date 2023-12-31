package vistas;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import vistas.consultas.VentanaConsultaAnimales;
import vistas.consultas.VentanaConsultaBioma;
import vistas.consultas.VentanaConsultaTrabajador;
import vistas.consultas.VentanaConsultaVeterinarios;
import vistas.editar.VentanaEditarAnimal;
import vistas.eliminar.VentanaEliminarAnimal;
import vistas.eliminar.VentanaEliminarBioma;
import vistas.eliminar.VentanaEliminarVeterinarios;
import vistas.registrar.VentanaRegistrarAnimal;
import vistas.registrar.VentanaRegistrarBiomas;
import vistas.registrar.VentanaRegistrarTrabajador;
import vistas.registrar.VentanaRegistrarVeterinario;

/**
 * Clase de la ventana principal
 */
public class VentanaPrincipal extends JFrame {

	/**
	 * Ventana principal del GUI.
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private String urlFuenteString = "fuentes/RobotoCondensed-Bold.ttf";
	private JPanel panelPrincipal;

	private static JPanel panelCentral;
	private JPanel panelHome;

	private VentanaRegistro ventanaRegistro;
	private VentanaConsultas ventanaConsultas;
	private VentanaEliminar ventanaEliminar;

	private VentanaConsultaAnimales ventanaConsultaAnimales;
	private VentanaConsultaBioma ventanaConsultaBioma;
	private VentanaConsultaVeterinarios ventanaConsultaVeterinarios;
	private VentanaConsultaTrabajador ventanaConsultaTrabajador;

	private VentanaEliminarBioma ventanaEliminarBioma;
	private VentanaEliminarVeterinarios ventanaEliminarsVeterinarios;
	private VentanaEliminarAnimal ventanaEliminarAnimal;

	private VentanaRegistrarBiomas registrarBiomas;
	private VentanaRegistrarAnimal ventanaRegitrarAnimal;
	private VentanaRegistrarTrabajador ventanaRegistrarTrabajador;

	/**
	 * Crea la ventana
	 */
	public VentanaPrincipal() {
		setTitle("VentanaPrincipal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);

		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {

				if (JOptionPane.showConfirmDialog(contentPane,
						"¿Estás seguro que quieres salir del sistema?", "¿Cerrar ventana?",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				}

			}
		});

		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(new Color(24, 61, 61));
		panelPrincipal.setBounds(0, 0, 777, 454);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);

		JPanel header = new JPanel();
		header.setBackground(new Color(4, 13, 18));
		header.setBounds(0, 0, 777, 48);
		panelPrincipal.add(header);
		header.setLayout(null);

		JLabel lblHome = new JLabel("Home");
		lblHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				changePrincipalPanel(panelHome);
				limpiarVentanas();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblHome.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		lblHome.setForeground(new Color(225, 234, 231));
		lblHome.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblHome.setBounds(21, 11, 49, 29);
		header.add(lblHome);

		JLabel lblRegistrar = new JLabel("Registrar");
		lblRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				VentanaRegistrarTrabajador.changePrincipalPanel(ventanaRegistrarTrabajador.getPanelDerechoContenedor());
				changePrincipalPanel(ventanaRegistro);
				limpiarVentanas();

				

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblRegistrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		lblRegistrar.setForeground(new Color(225, 234, 231));
		lblRegistrar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblRegistrar.setBounds(550, 11, 62, 29);
		header.add(lblRegistrar);

		JLabel lblConsultar = new JLabel("Consultar");
		lblConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePrincipalPanel(ventanaConsultas);
				limpiarVentanas();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblConsultar.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		lblConsultar.setForeground(new Color(225, 234, 231));
		lblConsultar.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblConsultar.setBounds(622, 11, 62, 29);
		header.add(lblConsultar);

		JLabel lblEliminar = new JLabel("Eliminar");
		lblEliminar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				changePrincipalPanel(ventanaEliminar);
				limpiarVentanas();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}
		});
		lblEliminar.setForeground(new Color(225, 234, 231));
		lblEliminar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminar.setFont(FuenteProyecto.createFont(urlFuenteString, 14));
		lblEliminar.setBounds(694, 11, 62, 29);
		header.add(lblEliminar);

		panelCentral = new JPanel();
		panelCentral.setBackground(new Color(24, 61, 61));
		panelCentral.setBounds(0, 47, 777, 407);
		panelPrincipal.add(panelCentral);
		panelCentral.setLayout(null);

		panelHome = new JPanel();
		panelHome.setBackground(new Color(24, 61, 61));
		panelHome.setBounds(0, 0, 777, 407);
		panelCentral.add(panelHome);
		panelHome.setLayout(null);

		JLabel lblLogo = new JLabel("   ");
		lblLogo.setBounds(179, 128, 421, 205);
		panelHome.add(lblLogo);
		lblLogo.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/imagenes/logo.png")));

		JLabel lblNewLabel = new JLabel("BIENVENIDO! ");
		lblNewLabel.setForeground(new Color(225, 234, 231));
		lblNewLabel.setFont(FuenteProyecto.createFont(urlFuenteString, 30));
		lblNewLabel.setBounds(283, 69, 233, 32);
		panelHome.add(lblNewLabel);

	}

	/**
	 * Cambia el panelCentral cuando un menu es seleccionado en alguna parte de la
	 * aplicacion
	 * 
	 * @param panel El panel por el que se va a cambiar el panelPrincipal
	 */
	public static void changePrincipalPanel(JPanel panel) {
		panel.setSize(777, 407);
		panel.setLocation(0, 0);

		panelCentral.removeAll();
		panelCentral.add(panel, BorderLayout.CENTER);
		panelCentral.revalidate();
		panelCentral.repaint();
	}
	
	/**
	 * Metodo para limpiar los campos de las ventanas
	 */
	public void limpiarVentanas() {
	
		
		ventanaConsultaAnimales.limpiarCampos();
		ventanaConsultaBioma.limpiarCampos();
		ventanaConsultaVeterinarios.limpiarTodosLosCampos();
		
		
		ventanaConsultaAnimales.getVentanaEditarAnimal().limpiaCampos();
		ventanaConsultaBioma.getVentanaEditarBioma().limpiaCampos();
		ventanaConsultaVeterinarios.getVentanaEditarVeterinario().limpiaCampos();
		
		
		ventanaRegitrarAnimal.limpiaCampos();
		ventanaRegistrarTrabajador.limpiaCampos();
		registrarBiomas.limpiaCampos();
		
		ventanaEliminarAnimal.limpiarCampos();
		ventanaEliminarBioma.limpiarCampos();
		ventanaEliminarsVeterinarios.limpiarCampos();
	}

	/**
	 * Metodo para obtener la ventana de registro
	 * @return VentanaMenu
	 */
	public VentanaMenu getVentanaRegistro() {
		return ventanaRegistro;
	}

	/**
	 * Metodo para asignar la ventana de registro
	 * @param ventanaRegistro
	 */
	public void setVentanaRegistro(VentanaRegistro ventanaRegistro) {
		this.ventanaRegistro = ventanaRegistro;
	}

	/**
	 * Metodo para obtener la ventana de consultas
	 * @return VentanaConsultas
	 */
	public VentanaConsultas getVentanaConsultas() {
		return ventanaConsultas;
	}

	/**
	 * Metodo para asignar la ventana de consultas
	 * @param ventanaConsultas
	 */
	public void setVentanaConsultas(VentanaConsultas ventanaConsultas) {
		this.ventanaConsultas = ventanaConsultas;
	}

	/**
	 * Metodo para obtener la ventana de eliminar
	 * @return VentanaEliminar
	 */
	public VentanaEliminar getVentanaEliminar() {
		return ventanaEliminar;
	}

	/**
	 * Metodo para asignar la ventana para eliminar
	 * @param ventanaEliminar
	 */
	public void setVentanaEliminar(VentanaEliminar ventanaEliminar) {
		this.ventanaEliminar = ventanaEliminar;
	}

	/**
	 * Metodo para obtener la ventana de consulta de animales
	 * @return VentanaConsultaAnimales
	 */
	public VentanaConsultaAnimales getVentanaConsultaAnimales() {
		return ventanaConsultaAnimales;
	}

	/**
	 * Metodo para asignar la ventana de consulta de animales
	 * @param ventanaConsultaAnimales
	 */
	public void setVentanaConsultaAnimales(VentanaConsultaAnimales ventanaConsultaAnimales) {
		this.ventanaConsultaAnimales = ventanaConsultaAnimales;
	}

	/**
	 * Obtiene la ventana de consulta de bioma
	 * @return VentanaConsultaBioma
	 */
	public VentanaConsultaBioma getVentanaConsultaBioma() {
		return ventanaConsultaBioma;
	}

	/**
	 * Asigna la ventana de consulta de bioma
	 * @param ventanaConsultaBioma
	 */
	public void setVentanaConsultaBioma(VentanaConsultaBioma ventanaConsultaBioma) {
		this.ventanaConsultaBioma = ventanaConsultaBioma;
	}

	/**
	 * Obtiene la ventana de consulta de veterinarios
	 * @return VentanaConsultaVeterinarios
	 */
	public VentanaConsultaVeterinarios getVentanaConsultaVeterinarios() {
		return ventanaConsultaVeterinarios;
	}

	/**
	 * Asignar la ventana de consulta de veterinarios
	 * @param ventanaConsultaVeterinarios
	 */
	public void setVentanaConsultaVeterinarios(VentanaConsultaVeterinarios ventanaConsultaVeterinarios) {
		this.ventanaConsultaVeterinarios = ventanaConsultaVeterinarios;
	}

	/**
	 * Obtener la ventana para eliminar biomas
	 * @return VentanaEliminarBioma
	 */
	public VentanaEliminarBioma getVentanaEliminarBioma() {
		return ventanaEliminarBioma;
	}

	/**
	 * Asignar la ventana para eliminar biomas
	 * @param ventanaEliminarBioma
	 */
	public void setVentanaEliminarBioma(VentanaEliminarBioma ventanaEliminarBioma) {
		this.ventanaEliminarBioma = ventanaEliminarBioma;
	}

	/**
	 * Obtener la ventana para eliminar veterinarios
	 * @return VentanaEliminarVeterinarios
	 */
	public VentanaEliminarVeterinarios getVentanaEliminarVeterinario() {
		return ventanaEliminarsVeterinarios;
	}

	/**
	 * Asignar la ventana para eliminar veterinarios
	 * @param ventanaEliminarsVeterinarios
	 */
	public void setVentanaEliminarVeterinario(VentanaEliminarVeterinarios ventanaEliminarsVeterinarios) {
		this.ventanaEliminarsVeterinarios = ventanaEliminarsVeterinarios;
	}

	/**
	 * Obtener la ventana para eliminar animales
	 * @return VentanaEliminarAnimal
	 */
	public VentanaEliminarAnimal getVentanaEliminarAnimal() {
		return ventanaEliminarAnimal;
	}

	/**
	 * Asignar la ventana para eliminar animales
	 * @param ventanaEliminarAnimal
	 */
	public void setVentanaEliminarAnimal(VentanaEliminarAnimal ventanaEliminarAnimal) {
		this.ventanaEliminarAnimal = ventanaEliminarAnimal;
	}

	/**
	 * Obtener la ventana para registrar animales
	 * @return VentanaRegistroAnimal
	 */
	public VentanaRegistrarAnimal getVentanaRegitrarAnimal() {
		return ventanaRegitrarAnimal;
	}

	/**
	 * Asignar la ventana para registrar animales
	 * @param ventanaRegitrarAnimal
	 */
	public void setVentanaRegitrarAnimal(VentanaRegistrarAnimal ventanaRegitrarAnimal) {
		this.ventanaRegitrarAnimal = ventanaRegitrarAnimal;
	}

	/**
	 * Obtener la ventana para registrar biomas
	 * @return VentanaRegistrarBiomas
	 */
	public VentanaRegistrarBiomas getRegistrarVentanaBioma() {
		return registrarBiomas;
	}

	/**
	 * Metodo para asignar la ventana para registrar biomas
	 * @param registrarBiomas
	 */
	public void setVentanaRegistrarBioma(VentanaRegistrarBiomas registrarBiomas) {
		this.registrarBiomas = registrarBiomas;
	}

	/**
	 * Metodo para obtener la ventana para registrar trabajadores
	 * @return ventanaRegistrarTrabajador
	 */
	public VentanaRegistrarTrabajador getVentanaRegistrarTrabajador() {
		return ventanaRegistrarTrabajador;
	}

	/**
	 * Metodo para asignar la ventana para registrar trabajadores
	 * @param ventanaRegistrarTrabajador
	 */
	public void setVentanaRegistrarTrabajador(VentanaRegistrarTrabajador ventanaRegistrarTrabajador) {
		this.ventanaRegistrarTrabajador = ventanaRegistrarTrabajador;
	}

	/**
	 * Obtener la ventana para consultar trabajadores
	 * @return ventanaConsultaTrabajador
	 */
	public VentanaConsultaTrabajador getVentanaConsultaTrabajador() {
		return ventanaConsultaTrabajador;
	}

	/**
	 * Asignar la ventana de consulta de trabajadores
	 * @param ventanaConsultaTrabajador
	 */
	public void setVentanaConsultaTrabajador(VentanaConsultaTrabajador ventanaConsultaTrabajador) {
		this.ventanaConsultaTrabajador = ventanaConsultaTrabajador;
	}
	
	

}
