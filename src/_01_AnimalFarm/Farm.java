package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		Animal cow = new Cow();
		Animal cow2 = new Cow();
		Animal pig = new Pig();
		Animal pig2 = new Pig();
		Animal sheep = new Sheep();
		Animal sheep2 = new Sheep();
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(sheep);
		animals.add(pig);
		animals.add(cow);
		animals.add(sheep2);
		animals.add(pig2);
		animals.add(cow2);
		
		for(int i=0; i< animals.size(); i++) {
			animals.get(i).makeNoise();
			animals.get(i).numLegs();
		}
	}

}
