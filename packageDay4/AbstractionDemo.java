package packageDay4;

//Abstract class
abstract class Animal {
	
 // Abstract method (no implementation)
 abstract void makeSound();
 abstract void move();

 // Concrete method (has implementation)
 void breathe() {
     System.out.println("Breathing...");
 }
 
}

//Concrete class 1
class Dog extends Animal {
	
 @Override
 void makeSound() {
     System.out.println("Bark!");
 }

 @Override
 void move() {
     System.out.println("Runs on four legs.");
 }
}

//Concrete class 2
class Bird extends Animal {
 @Override
 void makeSound() {
     System.out.println("Chirp!");
 }

 @Override
 void move() {
     System.out.println("Flies in the sky.");
 }
}

//Main class
public class AbstractionDemo {
 public static void main(String[] args) {
	 
     // Create objects of Dog and Bird
     Animal dog = new Dog();
     Animal bird = new Bird();

     // Dog behavior
     System.out.println("Dog:");
     dog.breathe(); // Concrete method from abstract class
     dog.makeSound(); // Implementation in Dog class
     dog.move();      // Implementation in Dog class

     System.out.println();

     // Bird behavior
     System.out.println("Bird:");
     bird.breathe(); // Concrete method from abstract class
     bird.makeSound(); // Implementation in Bird class
     bird.move();      // Implementation in Bird class
     
     
     System.out.println();
     
     Dog dog2 = new Dog();
     Bird bird2 = new Bird();
     
     

     // Dog behavior
     System.out.println("Dog2:");
     dog2.breathe(); // Concrete method from abstract class
     dog2.makeSound(); // Implementation in Dog class
     dog2.move();      // Implementation in Dog class

     System.out.println();

     // Bird behavior
     System.out.println("Bird2:");
     bird2.breathe(); // Concrete method from abstract class
     bird2.makeSound(); // Implementation in Bird class
     bird2.move();   
 }
}
