import java.util.Vector;

class BostonConcreteSoupFactory extends AbstractSoupFactory {
    
	public BostonConcreteSoupFactory() {
        factoryLocation = "Boston";
    }

	public ChickenSoup makeChickenSoup() {
		return new ChickenSoup();
	}
	public BostonTofuSoup makeTofuSoup() {
		return new BostonTofuSoup();
	}
	public BostonVegetableSoup makeVegetableSoup() {
		return new BostonVegetableSoup();
	}
    public ClamChowder makeClamChowder() {
        return new BostonClamChowder();
    }
    public FishChowder makeFishChowder() {
        return new BostonFishChowder();
    }
}