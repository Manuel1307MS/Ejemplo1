package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import modelo.Persona;

public class ControladorCentro1 implements Initializable{

	public void initialize(URL location, ResourceBundle resources) {
		Persona p=new Persona();
		lb1.setText(p.getNombre());
		
	}
	
	@FXML
	private Label lb1;

}
