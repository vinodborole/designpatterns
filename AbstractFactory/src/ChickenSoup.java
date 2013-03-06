import java.util.ListIterator;

public class ChickenSoup extends Soup {

	public ChickenSoup() 
    {
        soupName = "ChickenSoup";
        soupIngredients.add("1 Pound diced chicken");
        soupIngredients.add("1/2 cup rice");    
        soupIngredients.add("1 cup bullion");      
        soupIngredients.add("1/16 cup butter");    
        soupIngredients.add("1/4 cup diced carrots");          
    }
	
	public String toString()
	   {
	        StringBuffer stringOfIngredients = new StringBuffer(soupName);
	        stringOfIngredients.append(" Ingredients: ");
	        ListIterator soupIterator = soupIngredients.listIterator();
	        while (soupIterator.hasNext())
	        {
	            stringOfIngredients.append((String)soupIterator.next()).append("\n");
	        }
	        return stringOfIngredients.toString();
	   }

}
