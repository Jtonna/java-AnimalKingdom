package animalkingdom;

public abstract class AnimalActions {
	// this creates a class AnimalActions on the 'public scope'.
	// 'abstract' class's can define a constructor, have a 'state' associated with them.
	// Conceptually abstract classes are good for a partial implementation of an interface.
	// an abstract class should NOT exist without a matching 'interface'

	
	int MaxId = 0;
	// we set a integer (int) variable (MaxId) with the value of 0.
	// this will be used later.

	protected int id;
	protected String name;
	protected int year;
	protected int food;
	// protected is one of many reserved words which have a specific meaning.
	// protected can be given to a variable or a class and is used to only be refrenced in the class its called from.
	// essentially this is used and accessible ONLY in public abstract class AnimalActions{}
	
	public abstract String getName();
	public abstract String breath();
	public abstract String walk();
	public abstract int wasDiscoveredIn();
	public abstract int getNumber();

	// the lines above are all 'constructors', this is an example of constructor overloading
	// constructor overloading is the concept of having multiple constructors with diffrent parameters
	// each 'constructor' preforms a diffrent task.
	// note: every class has a constructor in it reglardless of it being normal or abstract.
	// warning: constructors are NOT methods and dont have a 'return' type.

	public AnimalActions(){

	};
	
}
