import java.util.ArrayList;
import java.util.ListIterator;


public class GingerDecorator implements ChaiDecorator{
	
	private Tea teaToMakeChai;
	private ArrayList chaiIngredients = new ArrayList();
	
	
	public GingerDecorator(Tea teaToMakeChai) {
		this.addTea(teaToMakeChai);
		chaiIngredients.add("ginger");
	}
	
	@Override
	public void addTea(Tea teaToMakeChaiIn) {
		this.teaToMakeChai = teaToMakeChaiIn;
	}

	@Override
	public void steepChai() {
		teaToMakeChai.steepTea();
        this.steepChaiIngredients();
        System.out.println("tea is steeping with chai");
	}

	@Override
	public void steepChaiIngredients() {
        ListIterator listIterator = chaiIngredients.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(((String)(listIterator.next())) + 
                                         " is steeping");
        }
        System.out.println("chai ingredients are steeping");
    } 

	@Override
	public void steepTea() {
		 this.steepChai();
	}

}
