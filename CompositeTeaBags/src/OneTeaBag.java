import java.util.ListIterator;


public class OneTeaBag extends TeaBags {
	
	public OneTeaBag(String nameIn) {
        this.setName(nameIn);
    }
	
	@Override
	public boolean add(TeaBags teaBagsToAdd) {
		return false;
	}

	@Override
	public int countTeaBags() {
		return 1;
	}

	@Override
	public ListIterator createListIterator() {
		return null;
	}

	@Override
	public boolean remove(TeaBags teaBagsToRemove) {
		return false;
	}

}
