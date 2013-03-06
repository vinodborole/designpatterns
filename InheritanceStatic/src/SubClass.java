
public class SubClass extends SuperClass {
	
	public String getColor() {
		return color;
	}

	@Override
	public void setColor(String colorin) {
		super.setColor(colorin);
	}
	
	public SubClass() {
		super.setColor("blue");
		setColor("grey");
		System.out.println("Color " + getColor());
		System.out.println("Color " + super.getColor());
	}
	
	public static void main(String[] arg){
		SubClass subObj = new SubClass();
	}

}
