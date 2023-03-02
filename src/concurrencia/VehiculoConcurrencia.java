
package concurrencia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class VehiculoConcurrencia extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent proyecto = FXMLLoader.load(getClass().getResource("VistaEstacionamiento.fxml"));
        Scene estacionamiento = new Scene(proyecto);
        primaryStage.setTitle("Estacionamiento");
        primaryStage.setScene(estacionamiento);
        primaryStage.show();
    }
    
}
