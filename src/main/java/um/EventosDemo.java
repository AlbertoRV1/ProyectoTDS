package um;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class EventosDemo extends Application{

	@Override
    public void start(Stage stage) {
		
		VBox root = new VBox(10);
		root.setStyle("-fx-background-color: #D0D0D0; -fx-alignment: top_center;");
		Scene scene = new Scene(root, 400, 500);
		
		HBox cajaH= new HBox(10);
		cajaH.setPrefHeight(300);
		cajaH.setStyle("-fx-background-color: #A0D0A0; -fx-alignment: center;");
		
		VBox cajaV=new VBox(10);
		cajaV.setPrefSize(150, 150);
		cajaV.setMaxSize(150,150);
		cajaV.setStyle("-fx-background-color: #00A0A0; -fx-alignment: center;");
		
		TextField texto=new TextField();
		texto.setPromptText("escribe hola");
		Button boton=new Button("pulsa");
		
		cajaV.getChildren().addAll(texto, boton);
		cajaH.getChildren().add(cajaV);
		root.getChildren().add(cajaH);
		boton.requestFocus();
		
		stage.setTitle("Ejemplo de eventos en JavaFX");
        stage.setScene(scene);
        stage.show();
	}
	
    public static void main(String[] args) {
        launch(args);
    }
}
