package _01_AnimalFarm;

public class Animal {

	void makeNoise(){
		System.out.println("making an animal noise");
	}
	void numLegs(){
		System.out.println("default implementation of numLegs");
	}
	//create a method that is common to all farm animals
	//create 4 subclasses of animal (cow, pig, sheep)
	//testing
	//create a Farm class with a main method
		//make an ArrayList of Animals called farm
		//add 6 animals
		//use a loop to call makeNoise and your custom method for each animal
}
