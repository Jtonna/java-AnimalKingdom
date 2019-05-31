package animalkingdom;

public class Mammals extends AnimalActions{

	// extends means its extending the class 'AnimalActions'
	// the class that gets extended MUST BE 'abstract'
	// in a nutshell this is inhereting information (for a lack of a better word in my vocabulary) from the base class.
	// see AnimalActions.java line 3

	public Mammals(String Name, int year, int food)
	// This is a class constructor
	// What this does is take in a single parameter or multiple parameters.
	// Since Java is such a strictly typed language we need to tell it what type of data is being passed in as a parameter, in this case its a string, int (integer), int (integer)
	{
		this.name = itsName;
		this.year = yearFound;
		this.food = foodNeeded;

		// In Java when we pass parameters we need a way to easily access them.
		// We need to do this because the field is shadowed by a method or constructor parameter.
		// for an example on this see the link here > https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html
		// So whats happening here is the data is getting imported from Main.java. passed into here and processed, we then are assigning the data to a new name using the this._data_name_ = newName.

	};

	@Override
	public String getName(){
		return itsName;
	};
	// Overrides are a bit complex > https://www.geeksforgeeks.org/overriding-in-java/
	// Essentially whats happening is @Override is 'overridding' its parent public method.
	// note how i said public. A private Method or class method cannot, again CANNOT be overridden.
	// The @Override is followed by a class constructor that returns the value of 'itsName'

	@Override
	public String getMoveType(){
		return "walk";
	};
	// Whats happening here is the same as whats happening above.
	// The Diffrence is this is a pre defined string returning how the mammel moves.
	// this will be something that will ge used in a System.out.println()

	@Override
	public String getBreathingType(){
		return "lungs";
	};
	// this one returns how it breaths

	@Override
	public String getReproductionType(){
		return "live birth";
	};
	// this one returns how it gives birth

	@Override
	public String toString(){
		return "Mammel Type: " + getName() + ". It was originally discovered in " + yearFound + ". It moved with its " + getMoveType() + " and breaths with its" + getBreathingType() + "." + "\n" ;
		// (forwardSlash)n makes a new line
	}
	// This one is unique > https://www.tutorialspoint.com/java/number_tostring.htm > https://www.javatpoint.com/understanding-toString()-method > https://stackoverflow.com/questions/3615721/how-to-use-the-tostring-method-in-java
	// toString() allows us to represent any OBJECT as a string.
	// this allows us to make the java compiler invoke the toString() method on the object to get the desired output.
	// in this case the desired output is a textual representation of an object.
	// By overriding it we can return values of the object so we dont need to write a ton of code.

}
