package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import modelo.Persona;

public class ControladorPanelPrincipal implements Initializable{

	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	@FXML
    private BorderPane panelPrincipal;

    @FXML
    private MFXButton btn1;

    @FXML
    private MFXButton btn2;

    @FXML
    void cambiarCentro(ActionEvent event) {
    	
    	Persona p=new Persona();
    	p.setNombre("MANUELMS");
    	cambioCentro("Centro1");
    	
    }
    
    public void cambioCentro(String nombreA) {
    	try {
			Parent p=FXMLLoader.load(getClass().getResource("/vista/"+nombreA+".fxml"));
			panelPrincipal.setCenter(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
