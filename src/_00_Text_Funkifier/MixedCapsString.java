package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String funkifiedString = "";
		char capLetter;
		for (int i = 0; i < s.length(); i++) {
			capLetter = s.charAt(i);
			if(Character.isLowerCase(capLetter) && !(i%2==0)) {
				capLetter = Character.toUpperCase(capLetter);
				funkifiedString = funkifiedString + capLetter;
			}else {
				capLetter = Character.toLowerCase(capLetter);
				funkifiedString = funkifiedString + capLetter;
			}

		}
		return funkifiedString;
	}

}
