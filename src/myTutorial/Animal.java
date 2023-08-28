package myTutorial;

//Abstract class
abstract class Animal1 {
// Abstract method (does not have a body)
	public abstract void animalSoundPig();
//public abstract void animalSoundTiger();
// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}
}

//Subclass (inherit from Animal)
class Pig extends Animal1 {
	public void animalSoundPig() {
 // The body of animalSound() is provided here
		System.out.println("The pig says: wee wee");
	}
}
/*class Tiger extends Animal {
public void animalSoundTiger() {
 // The body of animalSound() is provided here
 System.out.println("The tiger says: arg arg");
}
}*/

public class Animal {
	public static void main(String[] args) {
		Pig myPig = new Pig(); // Create a Pig object
 //Tiger myTiger = new Tiger();
		myPig.animalSoundPig();
		myPig.sleep();
		System.out.println("Prueba de error");
 //myTiger.animalsoundTiger();
 //myTiger.sleep();
	}
}
