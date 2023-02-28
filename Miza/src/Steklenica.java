
/**
 * Razred za delo s steklanicami
 * @author PetricG
 *
 */
public class Steklenica {

	// Deklariramo statično konstantno lastnost material
	public static final String material = "Steklo";

	// Deklariramo zasebne lastnosti razreda Steklenica
	private int kolicinaVsebine; 	// v ml
	private String vrstaVsebine;
	private boolean jeOdprta;
	private int kapaciteta;			// v ml
	
	//
	// Vhodni parametri: /
	// Potek/opis: ustvari nov objekt tipa Steklenica
	// Vrne vrednost: nov objekt
	/**
	 *  Javni konstruktor
	 *  ustvari nov objekt tipa Steklenica
	 */
	public Steklenica() {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = 0;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica");
		
	}
	
	// Javni konstruktor
	// Vhodni parametri: k - kapaciteta steklenice
	// Potek/opis: ustvari nov objekt tipa Steklenica
	// Vrne vrednost: nov objekt
	/**
	 * 
	 * @param k
	 */
	public Steklenica(int k) {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = k;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
		
	}
	
	
	/**
	 * Javna metoda za polnjenje steklenice
	 * prišteje natočeno količino in doda vrsto vsebine
	 * @param k k - količina vsebine
	 * @param v v - vrsta vsebin
	 * @return količina vsebine po polnjenju
	 * @throws Exception vrže izjemo, če je steklenica zaprta
	 */
	public int napolni(int k, String v) throws Exception {
	
		System.out.println("Steklenico polnim z : " + v);
		System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
		
		// Če je steklenica odprta, poskusi napolniti
		if (jeOdprta) {
			// Prištejemo količino vsebine
			kolicinaVsebine += k;

			// Dodamo vrsto vsebine
			vrstaVsebine += v;
			
			System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
			
		} else {
		
			System.out.println("Steklenica je zaprta!");
			
			// Vržemo izjemo za neuspešno polnjenje
			throw new Exception("Steklenica je zaprta!");
		}
		
		// Vrnemo količino vsebine
		return kolicinaVsebine;
	}
	
	// Javna metoda za odpiranje steklenice
	// Vhodni parametri: /
	// Potek/opis: spremeni vrednost jeOdprta na true
	// Vrne vrednost: true - odpiranje uspešno, false - odpiranje ni uspešno
	public boolean odpri() {
	
	System.out.println("Odpiram steklenico ...");
	
		// Če je steklenica že odprta
		if (jeOdprta) {
		
			// Vrnemo false
			return false;
		
		}
		// Če je zaprta
		else {
		
			// Odpremo steklenico
			jeOdprta = true;
			
			// Vrnemo true
			return true;
		
		}
	
	}
	
	// Javna metoda za zapiranje steklenice
	// Vhodni parametri: /
	// Potek/opis: spremeni vrednost jeOdprta na false
	// Vrne vrednost: true - zapiranje uspešno, false - zapiranje ni uspešno
	public boolean zapri() {
	
	System.out.println("Zapiram steklenico ...");
	
		// Če je steklenica že zaprta
		if (!jeOdprta) {
		
			// Vrnemo false
			return false;
		
		}
		// Če je odprta
		else {
		
			// Zapremo steklenico
			jeOdprta = false;
			
			// Vrnemo true
			return true;
		
		}
	
	}
	
	// Javna getter metoda, ki vrne količino vsebine
	// Vhodni parametri: /
	// Potek/opis: vrne vrednost
	// Vrne vrednost: količina vsebine
	public int getKolicinaVsebine() {
	
		return kolicinaVsebine;
	
	}

}
