package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;
    
    @FXML
    private Button btnCancella;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextArea txtTempo;

    @FXML
    private Button btnReset;

    @FXML
    void doInsert(ActionEvent event) {
    	double start=System.nanoTime();
    	this.elenco.addParola(txtParola.getText());
    	double stop=System.nanoTime();

		txtResult.appendText(txtParola.getText()+"\n");
		txtTempo.appendText((stop-start)+"secondi\n");
		
    }

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	this.elenco.reset();
    }
    
    @FXML
    void doCancella(ActionEvent event) {
    	this.elenco.remParola(txtParola.getText());
    	txtResult.clear();
    	for(String l1: this.elenco.l) {
    		txtResult.appendText(l1+"\n");
    	}
    }

    @FXML
    void initialize() {
        assert txtTempo != null : "fx:id=\"txtTempo\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
