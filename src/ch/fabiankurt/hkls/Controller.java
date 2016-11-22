package ch.fabiankurt.hkls;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    // Button
	@FXML 
	protected Button ueberpruefenb;
	@FXML 
	protected Button neub;
	@FXML 
	protected Button ab;
	@FXML 
	protected Button bb;
	@FXML 
	protected Button cb;
	@FXML 
	protected Button db;
	@FXML 
	protected Button eb;
	@FXML 
	protected Button fb;
	@FXML 
	protected Button gb;
	@FXML 
	protected Button hb;
	@FXML 
	protected Button ib;
	@FXML 
	protected Button jb;
	@FXML 
	protected Button kb;
	@FXML 
	protected Button lb;
	@FXML 
	protected Button mb;
	@FXML 
	protected Button nb;
	@FXML 
	protected Button ob;
	@FXML 
	protected Button pb;
	@FXML 
	protected Button qb;
	@FXML 
	protected Button rb;
	@FXML 
	protected Button sb;
	@FXML 
	protected Button tb;
	@FXML 
	protected Button ub;
	@FXML 
	protected Button vb;
	@FXML 
	protected Button wb;
	@FXML 
	protected Button xb;
	@FXML 
	protected Button yb;
	@FXML 
	protected Button zb;
	
	// Label
	@FXML
	protected Label wort;
	
	// ImageView
	@FXML
	protected ImageView bild;
	
	
	
	// Überprüft ob der Buchstabe im Wort vorkommt
	@FXML
	protected void ueberpruefen(ActionEvent event) {
		wort.setText("Überprüfen"); 
	}
	
	// Überprüft ob der Buchstabe - vorhanden ist
	@FXML
	protected void druecken(ActionEvent event) {
		Button button = (Button)event.getSource();
		System.out.println(button.getText());
		button.setVisible(false);
	}	
		
	// Startet das Spiel neu
	@FXML
	protected void neu(ActionEvent event) throws IOException {
		
		
			
		
		

		// Erstellen einer Zufallszahl
		Werte.zufallszahl = (int)(Math.random() * Werte.wortliste.size()); 
		System.out.println(Werte.zufallszahl);
		
		//Wählt ein neues Wort aus Teil 1
		Werte.worteraten = Werte.wortliste.get(Werte.zufallszahl);
		
		//Teilt das Wort auf in einzelne Buchstaben
		Werte.trennung = Werte.worteraten.split("||");
		Werte.wortlaenge = Werte.worteraten.length();

		//Wählt ein neues Wort aus Teil 2
		String satz = Werte.trennung[0];
		for(int i = 0;i<Werte.worteraten.length()-1;i++){
			satz += "_";
		}
		wort.setText(satz);
		
		// Setzt das Bild wieder auf Anfang
		File file = new File("src/ch/fabiankurt/hkls/resources/0.png");
        Image image = new Image(file.toURI().toString());
        bild.setImage(image);
        
        ab.setVisible(true);
		bb.setVisible(true);
		cb.setVisible(true);
		db.setVisible(true);
		eb.setVisible(true);
		fb.setVisible(true);
		gb.setVisible(true);
		hb.setVisible(true);
		ib.setVisible(true);
		jb.setVisible(true);
		kb.setVisible(true);
		lb.setVisible(true);
		mb.setVisible(true);
		nb.setVisible(true);
		ob.setVisible(true);
		pb.setVisible(true);
		qb.setVisible(true);
		rb.setVisible(true);
		sb.setVisible(true);
		tb.setVisible(true);
		ub.setVisible(true);
		vb.setVisible(true);
		wb.setVisible(true);
		xb.setVisible(true);
		yb.setVisible(true);
		zb.setVisible(true);
        
	}
}
