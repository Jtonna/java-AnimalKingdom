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
	public abstract String getBreathingType();
	public abstract String getMoveType();
	public abstract int wasDiscoveredIn();

	// the lines above are all 'constructors', this is an example of constructor overloading
	// constructor overloading is the concept of having multiple constructors with diffrent parameters
	// each 'constructor' preforms a diffrent task.
	// note: every class has a constructor in it reglardless of it being normal or abstract.
	// warning: constructors are NOT methods and dont have a 'return' type.

	public AnimalActions(String name, int year, int food)
	// if you want to know what this is see Mammals.java line 9 - 12
	{
		this.id = maxId;
		maxId++;
		// this is calling 'this.id' and setting it to maxId. Max id's value is currently 0 (see line 10)
		// maxId++ is an incremental operator, this basically adds 1 > https://www.dummies.com/programming/java/increment-and-decrement-operators-in-java/
		// what were going to do with it is

		this.name = name;
		this.year = year;
		this.food = food;
	};

	public AnimalActions()
	{
		food = 1;
		// this sets food's value to 1
	}

	public void consumeFood(){
		food--;
		// food -- is a decrement operator. its the opposite of line 40
	}

	public int yearFound(){
		return year;
	}
}
