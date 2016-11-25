package ch.fabiankurt.hkls;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static Stage mainStage;
	
	public static void main(String[] args) {

		launch(args);
	}
	
	
	//Programm Grundeinstellungen
	public void start(Stage primaryStage) throws Exception{
		mainStage = primaryStage;
		primaryStage.setMinHeight(531);
		primaryStage.setMinWidth (349);
		primaryStage.setMaxHeight(531);
	    primaryStage.setMaxWidth (349);
		spiel();
	}
	public static void spiel() throws IOException{
		Parent root = FXMLLoader.load(Main.class.getResource("hkls.fxml"));
		Scene scene = new Scene(root);
		mainStage.setTitle("Hangman v1.0");
		mainStage.centerOnScreen();
		mainStage.setScene(scene);
		mainStage.show();
		

		
		//Liste der möglichen Wörter
		Werte.wortliste.add("Wortschmuck");
		Werte.wortliste.add("Wortkritik");
		Werte.wortliste.add("Wortarm");
		Werte.wortliste.add("Worthagel");
		Werte.wortliste.add("Worthandlung");
		Werte.wortliste.add("Wortakzent");
		Werte.wortliste.add("Wortspielmacher");
		Werte.wortliste.add("Wortbildungen");
		Werte.wortliste.add("Wortwerk");
		Werte.wortliste.add("Wortspielerei");
		Werte.wortliste.add("Wortwurzel");
		Werte.wortliste.add("Wortgleichheit");
		Werte.wortliste.add("Wortzusammensetzung");
		Werte.wortliste.add("Wortzwischenraum");
		Werte.wortliste.add("Wortstand");
		Werte.wortliste.add("Wortmarke");

	}
}
