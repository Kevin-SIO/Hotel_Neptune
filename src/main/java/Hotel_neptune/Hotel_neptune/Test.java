package Hotel_neptune.Hotel_neptune;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test extends Application {

    @Override
    public void start(Stage stage){
//        String javaVersion = System.getProperty("java.version");
//        String javafxVersion = System.getProperty("javafx.version");
//        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
//        Scene scene = new Scene(new StackPane(l), 640, 480);
//        stage.setScene(scene);
//        stage.show();
    	Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("FXML/SignIn.fxml"));
			stage.setTitle("Hello World");  

	        Scene scene = new Scene(root, 900, 900);  

	        stage.setScene(scene);  
	        stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
    }

    public static void main(String[] args) {
        launch();
    }
}
