package _01_AnimalFarm;

public class Sheep extends Animal {

	@Override
	void makeNoise() {
		System.out.println("Baaaaaah");
	}

	@Override
	public void numLegs() {
		int numLegs = 2;
		System.out.println("I have "+numLegs+" legs");		
	}

}
