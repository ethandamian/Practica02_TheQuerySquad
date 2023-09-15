package main;

import vistas.VentanaConsultas;
import vistas.VentanaEliminar;
import vistas.VentanaMenu;
import vistas.VentanaPrincipal;
import vistas.VentanaRegistro;
import vistas.consultas.VentanaConsultaAnimales;
import vistas.consultas.VentanaConsultaBioma;
import vistas.consultas.VentanaConsultaVeterinarios;
import vistas.editar.VentanaEditarAnimal;
import vistas.editar.VentanaEditarBioma;
import vistas.editar.VentanaEditarVeterinario;
import vistas.eliminar.VentanaEliminarAnimal;
import vistas.eliminar.VentanaEliminarBioma;
import vistas.eliminar.VentanaEliminarVeterinarios;
import vistas.registrar.VentanaRegistrarAnimal;
import vistas.registrar.VentanaRegistrarBiomas;
import vistas.registrar.VentanaRegistrarTrabajador;
import vistas.registrar.VentanaRegistrarTrabajadorContinuacion;
import vistas.registrar.VentanaRegistrarVeterinario;

public class Relaciones {
	
	private VentanaPrincipal ventanaPrincipal;
	private VentanaRegistro ventanaRegistro;
	private VentanaConsultas ventanaConsultas;
	private VentanaEliminar ventanaEliminar;
	private VentanaMenu ventanaMenu;
	
	private VentanaConsultaAnimales ventanaConsultaAnimales;
	private VentanaConsultaBioma ventanaConsultaBioma;
	private VentanaConsultaVeterinarios ventanaConsultaVeterinarios;
	
	private VentanaEliminarBioma ventanaEliminarBioma;
	private VentanaEliminarVeterinarios ventanaEliminarsVeterinarios;
	private VentanaEliminarAnimal ventanaEliminarAnimal;
	
	private VentanaRegistrarTrabajador ventanaRegistrarTrabajador;
	private VentanaRegistrarTrabajadorContinuacion ventanaRegistrarTrabajadorContinuacion;
	private VentanaRegistrarBiomas ventanaRegistrarBiomas;
	private VentanaRegistrarAnimal ventanaRegitrarAnimal;
	private VentanaRegistrarVeterinario ventanaRegistrarVeterinario;
	
	private VentanaEditarAnimal ventanaEditarAnimal;
	private VentanaEditarBioma ventanaEditarBioma;
	private VentanaEditarVeterinario ventanaEditarVeterinario;
	
	public void build() {
		//instanciamos las clases del proyecto
		ventanaPrincipal = new VentanaPrincipal();
		ventanaRegistro = new VentanaRegistro();
		ventanaConsultas = new VentanaConsultas();
		ventanaEliminar = new VentanaEliminar();
		ventanaMenu = new VentanaMenu();
		
		ventanaConsultaAnimales = new VentanaConsultaAnimales();
		ventanaConsultaBioma = new VentanaConsultaBioma();
		ventanaConsultaVeterinarios = new VentanaConsultaVeterinarios();
		
		ventanaEliminarBioma = new VentanaEliminarBioma();
		ventanaEliminarsVeterinarios = new VentanaEliminarVeterinarios();
		ventanaEliminarAnimal = new VentanaEliminarAnimal();
		
		ventanaRegistrarBiomas = new VentanaRegistrarBiomas();
		ventanaRegitrarAnimal = new VentanaRegistrarAnimal();
		ventanaRegistrarTrabajador = new VentanaRegistrarTrabajador();
		ventanaRegistrarTrabajadorContinuacion = new VentanaRegistrarTrabajadorContinuacion();
		ventanaRegistrarVeterinario = new VentanaRegistrarVeterinario();
		
		ventanaEditarAnimal = new VentanaEditarAnimal();
		ventanaEditarBioma = new VentanaEditarBioma();
		ventanaEditarVeterinario = new VentanaEditarVeterinario();
		
		
		
		
		//relaciones ventanaPrincipal - vistas
		ventanaPrincipal.setVentanaRegistro(ventanaRegistro);
		ventanaPrincipal.setVentanaConsultas(ventanaConsultas);
		ventanaPrincipal.setVentanaEliminar(ventanaEliminar);
		
		ventanaPrincipal.setVentanaConsultaAnimales(ventanaConsultaAnimales);
		ventanaPrincipal.setVentanaConsultaBioma(ventanaConsultaBioma);
		ventanaPrincipal.setVentanaConsultaVeterinarios(ventanaConsultaVeterinarios);
		
		ventanaPrincipal.setVentanaEliminarBioma(ventanaEliminarBioma);
		ventanaPrincipal.setVentanaEliminarVeterinario(ventanaEliminarsVeterinarios);
		ventanaPrincipal.setVentanaEliminarAnimal(ventanaEliminarAnimal);
		
		ventanaPrincipal.setVentanaRegistrarBioma(ventanaRegistrarBiomas);
		ventanaPrincipal.setVentanaRegistrarTrabajador(ventanaRegistrarTrabajador);
		ventanaPrincipal.setVentanaRegitrarAnimal(ventanaRegitrarAnimal);
		
		
		//relaciones ventana principal-vistas
		ventanaConsultas.setVentanaPrincipal(ventanaPrincipal);
		ventanaEliminar.setVentanaPrincipal(ventanaPrincipal);
		ventanaRegistro.setVentanaPrincipal(ventanaPrincipal);
		
		//relaciones ventanaRegistrarTrabajador- ventanasRegistrarVet
		ventanaRegistrarTrabajador.setVentanaRegistrarTrabajadorContinuacion(ventanaRegistrarTrabajadorContinuacion);
		ventanaRegistrarTrabajador.setVentanaRegistrarVeterinario(ventanaRegistrarVeterinario);
		
		ventanaRegistrarTrabajadorContinuacion.setVentanaRegistrarTrabajador(ventanaRegistrarTrabajador);
		ventanaRegistrarVeterinario.setVentanaRegistrarTrabajador(ventanaRegistrarTrabajador);
		
		//relaciones vistas consultas - ventanas editar 
		ventanaConsultaAnimales.setVentanaEditarAnimal(ventanaEditarAnimal);
		ventanaConsultaBioma.setVentanaEditarBioma(ventanaEditarBioma);
		ventanaConsultaVeterinarios.setVentanaEditarVeterinario(ventanaEditarVeterinario);
		
		//relaciones vistas editar - vistas consulta
		ventanaEditarAnimal.setVentanaConsultaAnimales(ventanaConsultaAnimales);
		ventanaEditarBioma.setVentanaConsultaBioma(ventanaConsultaBioma);
		ventanaEditarVeterinario.setVentanaConsultaVeterinarios(ventanaConsultaVeterinarios);
		
		//mostramos la ventana principal
		ventanaPrincipal.setVisible(true);
		
	}

}
