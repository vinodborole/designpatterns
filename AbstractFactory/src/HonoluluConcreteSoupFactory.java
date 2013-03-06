import java.util.Vector;

class HonoluluConcreteSoupFactory extends AbstractSoupFactory {
    public HonoluluConcreteSoupFactory() {
        factoryLocation = "Honolulu";
    }
    public ClamChowder makeClamChowder() {
       return new HonoluluClamChowder();
    }
    public FishChowder makeFishChowder() {
       return new HonoluluFishChowder();
    }
    public ChickenSoup makeChickenSoup(){
    	return new ChickenSoup();
    }
}

class HonoluluClamChowder extends ClamChowder {
	private Vector soupIngredients = new Vector();
	
	public Vector getSoupIngredients() {
		return soupIngredients;
	}

	public void setSoupIngredients(Vector soupIngredients) {
		this.soupIngredients = soupIngredients;
	}
	
    public HonoluluClamChowder() {
        String soupName = "PacificClamChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Pacific Clams");
        soupIngredients.add("1 cup pineapple chunks");
        soupIngredients.add("1/2 cup coconut milk");
        soupIngredients.add("1/4 cup SPAM");
        soupIngredients.add("1/4 cup taro chips");
    }
}

class HonoluluFishChowder extends FishChowder {
	private Vector soupIngredients = new Vector();
	
	public Vector getSoupIngredients() {
		return soupIngredients;
	}

	public void setSoupIngredients(Vector soupIngredients) {
		this.soupIngredients = soupIngredients;
	}
	
    public HonoluluFishChowder() {
        String soupName = "OpakapakaFishChowder";
        soupIngredients.clear();
        soupIngredients.add("1 Pound Fresh Opakapaka Fish");
        soupIngredients.add("1 cup pineapple chunks");
        soupIngredients.add("1/2 cup coconut milk");
        soupIngredients.add("1/4 cup SPAM");
        soupIngredients.add("1/4 cup taro chips");
    }
}