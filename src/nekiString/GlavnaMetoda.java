package nekiString;

import java.util.Scanner;

public class GlavnaMetoda {

	/**Glavna metoda*/
	public static void main(String[] args) {
		
		//Kreiraj objekat
		Metode o = new Metode();

		//Kreiraj skener objekat
		Scanner unos = new Scanner(System.in);
		
		//Pitaj korisnika da unese neki string
		System.out.println("Unesite neki string:");
		String str = unos.nextLine();
		
		//Ispisi rezultate
		System.out.println("Vas string: " + str);
		System.out.println("Duzina stringa: " + o.duzinaStringa(str));
		System.out.println("Parni karakteri: " + o.parniKarakteri(str));
		System.out.println("Neparni karakteri: " + o.neparniKarakteri(str));
		System.out.println("Velika slova: " + o.velikaSlova(str));
		System.out.println("Mala slova: " + o.malaSlova(str));
		System.out.println("Ostali karakteri: " + o.neSlova(str));
	}	
}
