abstract class AbstractSoupFactory {
    String factoryLocation;
    public String getFactoryLocation() {
        return factoryLocation;
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
        return new ClamChowder();
    }
    
    public FishChowder makeFishChowder() {
        return new FishChowder();
    }     
//    public Minnestrone makeMinnestrone() {
//        return new Minnestrone();
//    }
//    public PastaFazul makePastaFazul() {
//        return new PastaFazul();
//    }
//    public TofuSoup makeTofuSoup() {
//        return new TofuSoup();
//    }
//    public VegetableSoup makeVegetableSoup() {
//        return new VegetableSoup();
//    }
}