package animalkingdom;

import java.util.*;
// WARNING: this imports the WHOLE package, in the future IDE's will import only what we are using. importing the whole package can lead to a larger file size than needed.


// https://www.tutorialspoint.com/java/java_constructors.htm 
// above is just a random resource i used to help learn things

public class Main
// every java app must have public 'Main' class. the classname (in this case Main), must relate back to the file name.
{
	public static void main(String[] args)
	// above is the public 'main' method. This is considered an entry point. It's also a child of the public class Main.
	// this has to be 'public' because java looks for the public main method signature. 
	// warning: if this is private the app will compile but not run as the main program's main entry point
	// "(String[] args)" is used when the method needs to pass an Array (yes, array) of string arguments to the application when we run it.
	{
		System.out.println("Hello There");
		// this is just a simple (console.log("hello there") )

		Mammals Panda = new Mammals("Panda", 1869, 2);
		Mammals Zebra = new Mammals("Zebra", 1778, 5);
		Mammals Koala = new Mammals("Koals", 1816, 4);
		Mammals Sloth = new Mammals("Sloth", 1758, 1);
		Mammals Armadillo = new Mammals("Armadillo", 1758, 8);
		Mammals Racoon = new Mammals("Raccoon", 1758, 4);
		Mammals Bigfoot = new Mammals("Bigfoot", 2050, 242450);

		Birds Pigeon = new Birds("Pigeon", 1873, 2);
		Birds Peacock = new Birds("Peacock", 1821, 1);
		Birds Toucan = new Birds("Toucan Sam", 1758, 4);
		Birds Parrot = new Birds("Parrot", 1824, 1);
		Birds Swan = new Birds("Swan", 1758, 3);

		Fish Salmon = new Fish("Salmon", 1758, 2);
		Fish Catfish = new Fish("Catfish", 1817, 3);
		Fish Perch = new Fish("Perch", 1758, 4);
		Fish Shark = new Fish("Shark", 0001, 20);

		// These are ALL Intantiate objects, this means we are making a new object
		// The ReadMe wants us to assign an unique number, name and year discovered // REGARDLESS OF CLASSIFICATION
		// The assigned data is then passed to the respective class to be processed.
		// Once the object is processed, it WILL create an instance of a new class.
		// Here were going to be passing data a bit diffrently. the data were passing is as follows below
		// name, year discovered, food.
		// we are going to use a bit of Java Magic to assign a unique identifying number to each entry.
		// in terms of scalability this would be the best pratice so we could add mass ammounts of data and not worry about manually adding a unique ID

		ArrayList<AnimalActions> myList = new ArrayList<AnimalActions>();
		// what this line above essentially does is create a new empty array named myList
		// we are also telling it where its going to get the data from with <AnimalActions>
		myList.add(Panda);
		myList.add(Zebra);
		myList.add(Koala);
		myList.add(Sloth);
		myList.add(Armadillo);
		myList.add(Racoon);
		myList.add(Bigfoot);
		myList.add(Pigeon);
		myList.add(Peacock);
		myList.add(Toucan);
		myList.add(Parrot);
		myList.add(Swan);
		myList.add(Salmon);
		myList.add(Catfish);
		myList.add(Perch);
		myList.add(Shark);

		// myList.add(objectname) simply adds the object to the array.
		// QUESTION: is there a way to automate this process so i dont have to declare myList.add(objectname); for every object?

		System.out.println("*** thing ***");
	}

	public static void renderAnimal(ArrayList<AnimalActions> animals, CheckAnimal tested)
	// see line 14 - 16 for public static void
	// the strings we are passing in here is an array from AnimalActions containing animals
	// the args we are passing is CheckAnimal, to test it and see if its an animal or not (true/false)
	{
		for (AnimalActions x : animals ){
			if (tested.test(x)){
				System.out.println(x.toString());;
			}
		};
	}
};
