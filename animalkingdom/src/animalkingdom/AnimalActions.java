package animalkingdom;

public abstract class AnimalActions {
	// this creates a class AnimalActions on the 'public scope'.
	// 'abstract' class's can define a constructor, have a 'state' associated with them.
	// Conceptually abstract classes are good for a partial implementation of an interface.
	// an abstract class should NOT exist without a matching 'interface'

	public abstract String getName();
	public abstract String breath();
	public abstract String walk();
	public abstract int getYearDiscovered();

	// line 9 - 12 are all 'constructors', this is an example of constructor overloading
	// constructor overloading is the concept of having multiple constructors with diffrent parameters
	// each 'constructor' preforms a diffrent task.
	// note: every class has a constructor in it reglardless of it being normal or abstract.
	// warning: constructors are NOT methods and dont have a 'return' type.

}
