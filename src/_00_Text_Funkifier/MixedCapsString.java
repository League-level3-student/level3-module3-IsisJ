package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkifiedString = s;
		for (int i = 1; i < s.length(); i++) {
			if(!(i%2==0)) {
				funkifiedString = funkifiedString + s.charAt(i);
				funkifiedString = funkifiedString.toUpperCase();
			}else {
				funkifiedString = funkifiedString + s.charAt(i);
			}

		}
		return funkifiedString;
	}

}
