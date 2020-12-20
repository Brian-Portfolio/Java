package eg1;

public class Validation {
	
	public boolean isvalidDL (String DriverLicense) throws DLException {
		
		if (!DriverLicense.matches("[A-Z]{1}-[0-9]{3}-[0-9]{3}-[0-9]{3}-[0-9]{3}")) {
			throw new DLException("Entered DL "+ DriverLicense +" is Invalid");
		}
		return true;
		
	}
	
	
	public boolean isvalidPassPort(String PassPortNumber) {
		if (!PassPortNumber.matches("[0-9]{10}")) {
			throw new BusinessException("Entered PassPort Number "+ PassPortNumber + " is Invalid");
		}
		return true;
	}
	
}
