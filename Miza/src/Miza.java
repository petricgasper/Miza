
/*
	Ime datoteke: Miza.java
	Avtor:			Gašper Petrič
	Vhodni podatki: /
	Opis: 			Aplikacija z grafičnim uporabniškim vmesnikom za delo s steklenico
	Izhodni podatki:Okno grafičnega uporabniškega vmesnika
*/

// Uvozimo paket za delo z GUI
import javax.swing.*;

// Uvozimo paket za delo z dogodki
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

// Deklariramo javni razred
public class Miza extends JFrame implements ActionListener {
	
	//Deklariramo zasebna lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField znamkaPolje, alkoholPolje;
	private JTable tabela;
	private PivskaSteklenicaTableModel modelTabele;
	
	// Deklariramo javno statično metodo, ki se izvede ob zagonu programa
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/opis: ustvari novo okno
	// Vrne vrednost: /
	public static void main(String[] args) {
		
		Miza m = new Miza("Miza z pisvskimi steklenicami");
		
	}
	
	// Javni konstruktor
	// Vhodni podatki: n - naslov okna
	// Potek7opis: vrne objekt tipa mize
	// Vrne vrednost
	
	public Miza(String n)  {
		
		// Kličemo konstruktor razreda
		super(n);
		
		// Inicializiramo zasebne lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton ("Dodaj steklenico");
		dodajJButton.setForeground(UIManager.getColor("TextArea.selectionBackground"));
		dodajJButton.setBackground(UIManager.getColor("TextArea.selectionBackground"));
		znamkaPolje = new JTextField(32);
		znamkaPolje.setFont(new Font("Tahoma", Font.BOLD, 11));
		znamkaPolje.setToolTipText("Sem vnesete znamko piva");
		alkoholPolje = new JTextField(8);
		modelTabele = new PivskaSteklenicaTableModel ();
		tabela = new JTable(modelTabele);
		
		// Površino dodamo na Mizo
		getContentPane().add(povrsina);
		
		//Gumbu za dodajanje dodamo action listener
		dodajJButton.addActionListener(this);
		
		// Dodamo gumb vnosna polja  in tabela na povrsino
		JLabel label = new JLabel("Znamka:");
		label.setLabelFor(znamkaPolje);
		povrsina.add(label);
		povrsina.add(znamkaPolje);
		povrsina.add(new JLabel("Stopnja alkohola:"));
		povrsina.add(alkoholPolje);
		povrsina.add (dodajJButton);
		povrsina.add(tabela);
		
		
		// Pokažemo okno
		setVisible(true);
		
		
		// Nastavimo velikost
		setSize (800, 600);
		
		// Nastavimo obnašanje križca (x) - da konča aplikacijo
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam objekt Miza");
		
	}	

	// Metoda, ki jo predpisuje vmesnika ActionListener
	// Vhodni podatki: dogodek
	// Potek/opis: doda steklenico v tabelo
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("Dodajam steklenico...");
		System.out.println("Znamka je " + znamkaPolje.getText());
		System.out.println("Stopnja alkohola je " + alkoholPolje.getText());
		
		// Ustvarimo lokalno spremeljivko flasa
		double d = Double.parseDouble(alkoholPolje.getText());
		PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(), 500, Double.parseDouble(alkoholPolje.getText()));
		
		// Dodamo objekt v seznam
		modelTabele.addPivskaSteklenica(flasa);
		
	}
}
	