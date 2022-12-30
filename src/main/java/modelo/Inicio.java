package modelo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Inicio extends Application{
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent p=FXMLLoader.load(getClass().getResource("/vista/VistaMaterialFx.fxml"));

		primaryStage.setScene(new Scene(p));
		
		primaryStage.setTitle("Maven");
		
		primaryStage.show();
		
	}
}
