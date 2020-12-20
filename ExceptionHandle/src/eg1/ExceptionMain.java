package eg1;

public class ExceptionMain {
	
	
	public static void main(String[] args) {
		
		Validation v1 = new Validation();
		
		//Checked Exception
		try {
			if(v1.isvalidDL("A-345-546-567-287")) {
				System.out.println("DL Validated");
			}
		}catch(DLException e) {
				System.out.println(e.getMessage());
			}
		
		
		//Unchecked Exception
		if (v1.isvalidPassPort("1234567890")) {
			System.out.println("Passport Number Validated");
		}	
	}
}
