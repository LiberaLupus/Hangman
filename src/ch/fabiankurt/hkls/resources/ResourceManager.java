package ch.fabiankurt.hkls.resources;

import javafx.scene.image.Image;

public class ResourceManager {
	//Laded Bilder
	public static Image loadImage(String name) {
		return new Image(ResourceManager.class.getResource(name).toString());
	}
	
}
