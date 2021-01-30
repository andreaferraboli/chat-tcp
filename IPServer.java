package program.scene;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class IPServer extends Application{

public static TextField t1;
public static String filestyle = "style.css";


    public void start(Stage stage) throws IOException {

            Pane root =new Pane();
            t1=new TextField();
            t1.setPrefSize(321,31.0);
            t1.setLayoutX(243);
            t1.setLayoutY(82);
            Label l2=new Label("ip pubblico server:");
            l2.setPrefSize(200,31.0);
            l2.setLayoutX(30);
            l2.setLayoutY(82);
            l2.setAlignment(Pos.CENTER);
            l2.setFont(new Font("Arial",23));


            Button invio=new Button("entra nel server");
            invio.setOnAction(e->{
                if(t1.getText().equals(""))
                {
                    Window owner=t1.getScene().getWindow();
                    alert.showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                            "inserire ip pubblico server");
                }
                else{

                        MainProgram prymarystage = new MainProgram();
                    try {
                        prymarystage.start(stage);
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }

                }
            });

            invio.setId("invio");
            invio.setLayoutX(243);
            invio.setLayoutY(150);
            invio.setPrefSize(114,59);
            root.getChildren().addAll(invio,t1,l2);
            Scene scene = new Scene(root,600,300);
            stage.setTitle("ip server");

        scene.getStylesheets().add(getClass().getResource(filestyle).toExternalForm());
            stage.centerOnScreen();
            stage.setScene(scene);
            stage.show();
        }
}



