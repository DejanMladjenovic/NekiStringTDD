package nekiString;

import java.util.ArrayList;

public class Metode {

	/**Vraca duzinu datog stringa*/
	public int duzinaStringa(String str){
		int brojac = str.length();
		return brojac;
	}
	
	/**Vraca parne karaktere u datom stringu*/
	public ArrayList<String> parniKarakteri(String str){
		ArrayList<String> list = new ArrayList<>();
		for(int i = 1; i < str.length(); i+= 2){
			String a = Character.toString(str.charAt(i));
			list.add(a);
		}
		return list;
	}
	
	/**Vraca neparne karaktere u datom stringu*/
	public ArrayList<String> neparniKarakteri(String str){
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i+= 2){
			String a = Character.toString(str.charAt(i));
			list.add(a);
		}
		return list;
	}
	
	/**Vraca broj velikih slova u datom stringu*/
	public int velikaSlova(String str){
		int brojac= 0;
		char[] slova = str.toCharArray();
		for(char c: slova){
			if(Character.isUpperCase(c))
				brojac++;
		}
		return brojac;
	}
	
	/**Vraca broj malih slova u datom stringu*/
	public int malaSlova(String str){
		int brojac= 0;
		char[] slova = str.toCharArray();
		for(char c: slova){
			if(Character.isLowerCase(c))
				brojac++;
		}
		return brojac;
	}

	/**Vraca karaktere u datom stringu koji nisu slova*/
	public ArrayList<String> neSlova(String str){
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0; i < str.length(); i++){
			if(!Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
				String s = Character.toString(str.charAt(i));
				list.add(s);
			}
		}
		return list;
	}
}
