package mvc.main;
import mvc.controller.*;

public class Main {
	
	static WurzelController controller;
	
	/**
	 * Diese Klasse wird nur dazu benutzt alle nötigen
	 * Komponenten zu Initialisieren und die erste
	 * Viev anzuzeigen
	 */

	public static void main(String[] args) {
		controller = new WurzelController();
		
		controller.showView();		
	}

}
