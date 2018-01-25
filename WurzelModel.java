package mvc.model;

/**
 * Das Model ist komplett unabhängig von den anderen Klassen 
 * und weiß nicht was um ihn herum geschieht. 
 * Es ist völlig egal ob man dieses Model aus einem
 * Fenster oder einer Konsolen Eingabe verwendet - 
 * beiden würde funktionieren.
 * 
 * Wichtig hierbei ist, dass diese Klasse keine Beziehungen 
 * zu den anderen Klassen hat! Man muss sie so aufbauen, 
 * dass man sie ohne eine Änderung in einem anderen Projekt 
 * benutzen könnte.
 */

public class WurzelModel {

	long _value;

	public WurzelModel() {
		zurücksetzen();
	}

	public void zurücksetzen() {
		this._value = 0;
	}

	public void berechneWurzel(long wert) {
		this._value = (wert * wert);
	}

	public long getWurzel() {
		return this._value;
	}

}
