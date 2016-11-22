package ch.fabiankurt.hkls;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static Stage mainStage;
	
	
	
	
	//Programm Grundeinstellungen
	public void start(Stage primaryStage) throws Exception{
		mainStage = primaryStage;
		spiel();
	}
	public static void spiel() throws IOException{
		Parent root = FXMLLoader.load(Main.class.getResource("hkls.fxml"));
		Scene scene = new Scene(root);
		mainStage.setTitle("H�nkerlis");
		mainStage.centerOnScreen();
		mainStage.setScene(scene);
		mainStage.show();
		//primaryStage.setMinHeight(403);
		//primaryStage.setMinWidth (333);
		//primaryStage.setMaxHeight(403);
	    //primaryStage.setMaxWidth (333);

		
		//Liste der m�glichen W�rter
		Werte.wortliste.add("Wortschmuck");
		Werte.wortliste.add("Wortkritik");
		Werte.wortliste.add("Wortarm");
		Werte.wortliste.add("Worthagel");
		Werte.wortliste.add("Worthandlung");
		Werte.wortliste.add("Wortakzent");
		Werte.wortliste.add("Wortspielmacher");
		Werte.wortliste.add("Wortw�hler");
		Werte.wortliste.add("Wortbildungen");
		Werte.wortliste.add("Wortl�ge");
		Werte.wortliste.add("Wortwerk");
		Werte.wortliste.add("Wortspielerei");
		Werte.wortliste.add("Wortwurzel");
		Werte.wortliste.add("Wortgleichheit");
		Werte.wortliste.add("Wortzusammensetzung");
		Werte.wortliste.add("Wortzwischenraum");
		Werte.wortliste.add("Wort�hnlichkeit");
		Werte.wortliste.add("Wort�bersetzungen");
		Werte.wortliste.add("Wortstand");
		Werte.wortliste.add("Wortw�rtlichkeit");
		Werte.wortliste.add("Wortmarke");

	}
}
