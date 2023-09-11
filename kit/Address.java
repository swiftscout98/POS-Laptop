import java.util.regex.*; //Regular expression

public class Address{
	//Data field
	private String homeAddress;
	private String zipCode;
	private String city;
	private String state;
	
	//no-arg constructor
	public Address(){ 
		homeAddress = "";
		zipCode = "";
		city = "";
		state = "";
	}
	
	//Construtor
	public Address(String homeAddress, String zipCode, String city, String state){
		this.homeAddress = homeAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}
	
	//set
	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	//get
	public String getHomeAddress(){
		return homeAddress;
	}
	
	public String getZipCode(){
		return zipCode;
	}
	
	public String getCity(){
		return city;
	}
	
	public String getState(){
		return state;
	}
	
	//validation
	//Homeaddress
	public static boolean isValidHomeAddress(String homeAddress) {
	    // Regular expression pattern to validate the address
	    String addressPattern = "^[A-Za-z0-9\\s,\\.\\/]+$";
	
	    // Check if the address length is between 10 and 50 characters
	    if (homeAddress.length() >= 10 && homeAddress.length() <= 50) {
	        // Check if the address matches the pattern
	        if (homeAddress.matches(addressPattern)) {
	            return true;
	        } else {
	            System.out.println("The address contains invalid characters.");
	        }
	    } else {
	        System.out.println("The address length is invalid.");
	    }
	    return false;
	}

	//ZipCode
	public static boolean isValidZipCode(String zipCode) {
	    // Regular expression pattern to validate the zip code (exactly 5 digits)
	    String zipPattern = "^[0-9]{5}$";
	
	    // Check if the zip code length is 5 and if it matches the pattern
	    if (zipCode.length() == 5 && zipCode.matches(zipPattern)) {
	        return true;
	    } else {
	        System.out.println("The zip code length or pattern is invalid.");
	    }
	    
	    return false;
	}
	
	//city
	public static boolean isValidCity(String city) {
		// Regular expression pattern to validate the city name(letters and space);
		String cityPattern = "^[A-Za-z\\s]+$";
		
		if(city.length() > 5 && city.length() < 35 && city.matches(cityPattern)){
			return true;
		}else{
			//method 1: System.out.println("The city length or pattern is invalid.");
			//method 2:
			// Throw an IllegalArgumentException with a descriptive message
			throw new IllegalArgumentException("Invalid city name: " + city);
		}
		
	}
	
	//state
	public static boolean isValidState(String state){
		//Regular expression pattern to valate the state name (letters and space);
		String statePattern = "^[A-Za-z\\s]+$";
		
		if(state.length() >= 5 && state.length() <= 30 && state.matches(statePattern)){
			return true;
		}else{
			System.out.println("The state code length or pattern is invalid.");
		}
		return false;
	}
	
	//To String Method
	@Override
	public String toString() {
	    return "Home Address: " + homeAddress + "\n" +
	           "Zip Code: " + zipCode + "\n" +
	           "City: " + city + "\n" +
	           "State: " + state + "\n";
	}
	
}