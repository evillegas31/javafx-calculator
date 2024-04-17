package finalproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    
    Button ceButton = new Button("CE");
    Button cButton = new Button("C");
    Button backspaceButton = new Button("Backspace");
    
    Button oneButton = new Button("1");
    Button twoButton = new Button("2");
    Button threebutton = new Button("3");
    Button fourButton = new Button("4");
    Button fiveButton = new Button("5");
    Button sixButton = new Button("6");
    Button sevenButton = new Button("7");
    Button eightButton = new Button("8");
    Button nineButton = new Button("9");

    Button multiplyButton = new Button("X");
    Button divideButton = new Button("/");
    Button additionButton = new Button("+");
    Button subtractionButton = new Button("-");
    Button equalsButton = new Button("=");

    Button secondExponentButton = new Button("x^2");
    Button thirdExponentButton = new Button("x^3");
    Button nthExponentButton = new Button("x^n");
    Text display = new Text();
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();
        HBox displayBox = new HBox();
        scene = new Scene(pane,640, 480);
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    

    public static void main(String[] args) {
        launch();
    }

}