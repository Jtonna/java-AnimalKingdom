package animalkingdom;

// if you want to see whats happening here go to mammels, its the same thing

public class Fish extends AnimalActions {
	
	public Fish(String name, int year, int food) {

		this.name = name;
		this.year = year;
		this.food = food;
	}

	@Override
	public String getName(){
		return name;
	};

	@Override
	public String getMoveType(){
		return "Fins";
	};

	@Override
	public String getBreatingType(){
		return "gills";
	};

	@Override
	public String getReproductionType(){
		return "lays eggs";
	};

	@Override
	public String toString(){
		return "Fish Type: " + getName() + ". It was originally discovered in " + year + ". It moves with its " + getMoveType() + " and breaths with its" + getBreathingType() + "." + "\n" ;		
	}
}
