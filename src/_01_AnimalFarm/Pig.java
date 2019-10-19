package _01_AnimalFarm;

public class Pig extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Oinkkkk");

	}

	@Override
	public void numLegs() {
		int numLegs = 0;
		System.out.println("I have "+numLegs+" legs");	}

}
