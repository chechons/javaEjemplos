
public class Main {

	public static void main(String[] args) {
		
		try {
			System.out.println("Provocamos error");
			throw new MiExcepcion();
		} catch (MiExcepcion e) {
			System.out.println(e.exceptionError());
		}
		
		
	}
	
	
}
