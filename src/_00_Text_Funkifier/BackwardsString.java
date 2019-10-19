package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkifiedString="";
		for(int i = s.length()-1; i>=0;i--) {
			funkifiedString = funkifiedString + s.charAt(i);
		}
		return funkifiedString;
	}

}
