package animalkingdom;

// if you want to see whats happening here go to mammels, its the same thing

public class Birds extends AnimalActions {
	
	public Birds(String name, int year, int food) {

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
		return "feet and wings";
	};

	@Override
	public String getBreatingType(){
		return "lungs, airsack and larx";
	};

	@Override
	public String getReproductionType(){
		return "lays large eggs";
	};

	@Override
	public String toString(){
		return "Birds Type: " + getName() + ". It was originally discovered in " + year + ". It moves with its " + getMoveType() + " and breaths with its" + getBreathingType() + "." + "\n" ;		
	}
}
