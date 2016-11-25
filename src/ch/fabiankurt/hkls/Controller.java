package ch.fabiankurt.hkls;


import java.io.IOException;

import ch.fabiankurt.hkls.resources.ResourceManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    // Button
	@FXML 
	protected Button startenb;
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
	@FXML
	protected Label startsch;
	
	// ImageView
	@FXML
	protected ImageView bild;
	@FXML
	protected ImageView cover;
	@FXML
	protected ImageView gewonnen;
	@FXML
	protected ImageView verloren;
	
	
	//Macht den bestätigten Button unsichtbar
	@FXML
	protected void druecken(ActionEvent event) {
		Werte.falsch1 = 1;
		Button button = (Button)event.getSource();
		System.out.println(button.getText());
		button.setVisible(false);
		
		// Überprüft ob der Buchstabe - vorhanden ist
		for(int i=1;i<Werte.worteraten.length();i++){
			if(button.getText().charAt(0) == Werte.worteraten.charAt(i) || (button.getText().charAt(0) + 32) == Werte.worteraten.charAt(i)){
				Werte.erraten[i] = button.getText().charAt(0);
				Werte.richtig++;
				}else{
					Werte.falsch1++;
					System.out.println(Werte.falsch1);
				}
			}
		wort.setText(String.valueOf(Werte.erraten));

		if(Werte.falsch1 == Werte.worteraten.length()){
			Werte.falsch2++;
	        Image image = ResourceManager.loadImage(Werte.falsch2 +".png");
	        bild.setImage(image);
			System.out.println("Falsch");
		}
		
		//Gewonnen
		if(Werte.richtig == Werte.pruefen){
	        Image image = ResourceManager.loadImage("gewonnen.png");
	        gewonnen.setImage(image);
			 bild.setImage(null);
			 ab.setVisible(false);
			 bb.setVisible(false);
			 cb.setVisible(false);
			 db.setVisible(false);
			 eb.setVisible(false);
			 fb.setVisible(false);
			 gb.setVisible(false);
			 hb.setVisible(false);
			 ib.setVisible(false);
			 jb.setVisible(false);
			 kb.setVisible(false);
			 lb.setVisible(false);
			 mb.setVisible(false);
			 nb.setVisible(false);
			 ob.setVisible(false);
			 pb.setVisible(false);
			 qb.setVisible(false);
			 rb.setVisible(false);
			 sb.setVisible(false);
			 tb.setVisible(false);
			 ub.setVisible(false);
			 vb.setVisible(false);
			 wb.setVisible(false);
			 xb.setVisible(false);
			 yb.setVisible(false);
			 zb.setVisible(false);
		}
		//Verloren
		if( Werte.falsch2 == 10){
			wort.setText(Werte.worteraten);
	        Image image = ResourceManager.loadImage("verloren.png");
	        verloren.setImage(image);
			 ab.setVisible(false);
			 bb.setVisible(false);
			 cb.setVisible(false);
			 db.setVisible(false);
			 eb.setVisible(false);
			 fb.setVisible(false);
			 gb.setVisible(false);
			 hb.setVisible(false);
			 ib.setVisible(false);
			 jb.setVisible(false);
			 kb.setVisible(false);
			 lb.setVisible(false);
			 mb.setVisible(false);
			 nb.setVisible(false);
			 ob.setVisible(false);
			 pb.setVisible(false);
			 qb.setVisible(false);
			 rb.setVisible(false);
			 sb.setVisible(false);
			 tb.setVisible(false);
			 ub.setVisible(false);
			 vb.setVisible(false);
			 wb.setVisible(false);
			 xb.setVisible(false);
			 yb.setVisible(false);
			 zb.setVisible(false);
		}
		
		
	}	
		
	// Startet das Spiel neu
	@FXML
	protected void neu(ActionEvent event) throws IOException {
		
		Werte.falsch2 = 0;
		Werte.richtig = 0;
		
		startenb.setVisible(false);
		
		//Blended Begrüssungs Text aus
		startsch.setText(null);
		
		// Erstellen einer Zufallszahl
		Werte.zufallszahl = (int)(Math.random() * Werte.wortliste.size()); 
		System.out.println(Werte.zufallszahl);
		
		//Wählt ein neues Wort aus Teil 1
		Werte.worteraten = Werte.wortliste.get(Werte.zufallszahl);
		Werte.pruefen = Werte.worteraten.length()-1;
		

		//Wählt ein neues Wort aus Teil 2
		Werte.erraten = new char[Werte.worteraten.length()];
		Werte.erraten[0] = Werte.worteraten.charAt(0);
		for(int i = 1;i<Werte.worteraten.length();i++){
			Werte.erraten[i] += '_';
		}
		wort.setText(String.valueOf(Werte.erraten));
		
		// Setzt das Bild wieder auf Anfang
        Image image = ResourceManager.loadImage("0.png");
        bild.setImage(image);
        cover.setImage(null);
        gewonnen.setImage(null);
        verloren.setImage(null);
        
        //Macht alle Buttons wieder sichtbar
        neub.setVisible(true);
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
