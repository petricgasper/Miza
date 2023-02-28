/*
	Ime datoteke: PivskaSteklenicaTableModel.java
	Avtor:			Gašper Petrič
*/
import javax.swing.table.*;


public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	//Konstruktor
	public PivskaSteklenicaTableModel() {
		
		//Kliče konstruktor nadrazrede
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		
		//Dodamo naslovno vrstico
		//Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
		//Dodamo vrstico v tabelo
		//Syytem.out.println("Dodajam vrstico"),
		addRow(vrstica);
		
		
	}
	
	
	// Vhodni parametri: ps - PivskaSteklenica
	// Potek/opis: Metoda, ki doda pivsko steklenico ActionListenerna seznam in tabelo
	// Vrne vrednost: /
	public void addPivskaSteklenica(PivskaSteklenica ps)  {
		
		//Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		
		//Dodamo vrstico v tabelo
		addRow(vrstica);
		
		
	}	
}	