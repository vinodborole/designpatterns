import java.util.Vector;


public class BostonFishChowder extends FishChowder {
private Vector soupIngredients = new Vector();
	
	public Vector getSoupIngredients() {
		return soupIngredients;
	}

	public void setSoupIngredients(Vector soupIngredients) {
		this.soupIngredients = soupIngredients;
	}
	
    public BostonFishChowder() {
        String soupName = "ScrodFishChowder";
        soupIngredients.clear();        
        soupIngredients.add("1 Pound Fresh Scrod");
        soupIngredients.add("1 cup corn");    
        soupIngredients.add("1/2 cup heavy cream");
        soupIngredients.add("1/4 cup butter");    
        soupIngredients.add("1/4 cup potato chips");
    }
}
