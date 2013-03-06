import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * This class will show you how to access private variables and methods from a class
 * @author manish
 *
 */
public class PrivateMemberAccessTest {
	public static void main(String[] args) throws Exception {

	    /**
	     * Used to test if we can get instance of this constructor using Reflection 
	    Class c = Class.forName("SimpleKeyPair");
	    Constructor[] constructors = c.getConstructors();
		System.out.println("constructors: " + constructors.length);
	    SimpleKeyPair keyPair = (SimpleKeyPair) constructors[0].newInstance(null);
	    System.out.println("cloned: " + keyPair);

	     */
		
	    SimpleKeyPair keyPair = new SimpleKeyPair();
	    Class c = keyPair.getClass();
        // get the reflected object 
        Field field = c.getDeclaredField("privateKey");
        // set accessible true 
        field.setAccessible(true);
        System.out.println("Value of privateKey: " + field.get(keyPair)); // prints "Tokyo"
        // modify the member variable
        field.set(keyPair, "Berlin");
        System.out.println("Value of privateKey: " + field.get(keyPair)); // prints "Berlin"

        Method[] methods = c.getDeclaredMethods();
        
        if(methods.length > 0){
        	Method localobj = (Method)methods[0];
        	localobj.setAccessible(true);
        	localobj.invoke(keyPair, "Manish");
        	System.out.println("Value of privateKey: " + field.get(keyPair)); // prints "Berlin"
        }
    }
}
