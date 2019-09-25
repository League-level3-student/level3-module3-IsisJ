package _00_Text_Funkifier;

public class SpecialString implements TextFunkifier{
	protected String s;
	
	public SpecialString(String s) {
		this.s = funkifyText(s);
	}
	
	public String toString() {
		return s;
	}
	
	public boolean isVowel(char c) {
		if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' ||c == 'u' ||c == 'A' ||c == 'E' ||c == 'I' ||c == 'O' ||c == 'U' ) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String funkifyText(String s) {
		String funkifiedString = "";
		for (int i = 0; i < s.length(); i++) {
			if(!(isVowel(s.charAt(i)))) {
				funkifiedString = funkifiedString + s.charAt(i);
			}
		}
		return funkifiedString;
	}
}
