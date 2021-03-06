package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.*;
import mvc.view.*;

/**
 * Der Controller muss beide die View und das Model kennen da dieser für die
 * Kommunikation zwischen den Beiden sorgt.
 */
public class WurzelController {

	private WurzelView _view;
	private WurzelModel _model;

	public WurzelController() {
		this._model = new WurzelModel();
		this._view = new WurzelView();

		addListener();
	}

	public void showView() {
		this._view.setVisible(true);
	}

	/**
	 * Die Listner, die wir aus den Internen Klassen generieren werden der View
	 * bekannt gemacht, sodass diese mit uns (dem Controller) kommunizieren
	 * kann.
	 */
	private void addListener() {
		this._view.setWurzelBerechnenListener(new WurzelBerechnenListener());
		this._view.setResetFormListener(new ResetFormListener());
	}

	/**
	 * Inneren Listener Klassen implementieren das Interface ActionListener
	 *
	 * 1: Hier wird erst der eingegebene Wert aus der View geholt 
	 * 2: Der Wert wird dem Model übergeben und die Wurzel berechnet 
	 * 3: Die berechnete Wurzel wird aus dem Model geladen und 
	 * 4: Wieder der View zum Darstellen übergeben
	 *
	 * ACHTUNG: Fehlerprüfung muss noch implementeirt werden
	 */

	class WurzelBerechnenListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			long wert = Long.valueOf(_view.getEingabe());
			_model.berechneWurzel(wert);
			_view.setErgebnis(String.valueOf(_model.getWurzel()));
		}
	}

	class ResetFormListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			_view.resetView();
			_model.zurücksetzen();
		}
	}
}
