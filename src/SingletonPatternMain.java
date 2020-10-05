
public class SingletonPatternMain {

	public static void main(String[] args) {
		Singleton object = Singleton.getInstance();
		object.showMessage();		
		Singleton object2 = Singleton.getInstance();
		object2.showMessage();
	}

}
