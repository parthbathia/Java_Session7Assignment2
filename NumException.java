
public class NumException {

	public static void main(String[] args) {
		
		int a;
		String name = "Parth";
		try{
			
			a = Integer.parseInt(name);
			
		}
		catch(Exception e){
			
			System.out.println(e);
			
		}
		
	}
	
}
