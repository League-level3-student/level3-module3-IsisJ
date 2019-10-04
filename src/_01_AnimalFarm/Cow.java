package _01_AnimalFarm;

public class Cow extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Mooooo");
	}

	@Override
	public void numLegs() {
		int numLegs = 4;
		System.out.println("I have "+numLegs+" legs");
	}

}
