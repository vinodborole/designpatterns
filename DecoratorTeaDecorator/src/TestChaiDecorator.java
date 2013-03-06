
public class TestChaiDecorator {
	public static void main(String[] args) {
       Tea teaLeaves = new TeaLeaves();
       Tea chaiDecorator = new GingerDecorator(teaLeaves);
       chaiDecorator.steepTea();
	}	
}
