package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private TextField SpejimuLaukas;


    public void Speti(ActionEvent event){
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1;
        int number = Integer.parseInt(SpejimuLaukas.getText());
            while(!Baigti()) {

                if (randomNumber == random) {
                    System.out.println("Atspejote");
                } else {
                    System.out.println("Deja");
                }
            }
    }
    public void Baigti(ActionEvent event){
        System.exit(0);
    }
}
