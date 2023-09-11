abstract public class Person {
    // Data fields
    private String ID;
    private String name;
    private char gender;
    private String phone;
    private Address[] address;

    //no-argument 
    public Person() {
        // Initialize the data fields with default values or leave them empty
        ID = "";
        name = ""; // Assuming Name has a no-argument constructor
        gender = ' ';
        phone = "";
        address = new Address[0]; // An empty array of Address objects
    }

    // Constructor
    public Person(String ID, Name name, char gender, String phone, Address[] address) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    
	//set
    public void setID(String ID){
    	this.ID = ID;
    }
    
	public void setName(Name name){
		this.name = name;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setAddress(Address[] address){
		this.address = address;
	}
	
	//get
	public String getID(){
    	return ID;
    }
    
	public Name getName(){
		return name;
	}
	
	public char gender(){
		return gender;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public Address[] getAddress(){
		return address;
	}
	
	//validation
	//ID
	public static boolean isValidID(String ID) {
	    String IDPattern = "^[a-zA-Z\\s]+$$";
	
	    // Check if the address length is between 10 and 50 characters
	    if (ID.length() == 12) {
	        // Check if the address matches the pattern
	        if (ID.matches(IDPattern)) {
	            return true;
	        } else {
	            System.out.println("The ID format is wrong");
	        }
	    } else {
	        System.out.println("The id should be 12 characters .");
	    }
	    return false;
	}
	
	//name
	public static boolean isValidName(String name){
		String namePattern = "^[a-zA-Z\\s]+$";
		if(name.length() >= 3 && name.lenth()<= 50){
			return true;
		}else if(name.matches(namePattern)){
			return true;
		}else{
			System.out.println("The name format should be enter more than 3 and less than 50 of the characters!")
		}
		return false;
	}

	//gender
	public static boolean isValidGender(String gender){
		char g1 == Character.toupperCase(gender);
		if(gender == M || gender == F){
			return true;
		}else {
			System.out.println("The gender you input is wrong");
		}
		return false;
	}
	
	//phone
	public static boolean isValidPhone(String phone){
		String patternPhone = "^[0-9]{10}$"
		if(phone.length == 10 && phone.matches(patternPhone)){
			return true;
		}else {
			System.out.println("The phone pattern is wrong and length should be only 10 characters");
		}
		return false;
	}

	//ToStringMethod
	public String toString(){
		if(gender == 'M'){
			genderWords = "Male";
		}else{
			genderWords = "Female";
		}

		return "\tID\t\tName\t\tGender\t\tPhone\t\tAddress" +
				ID , name, genderWords, phone, address.toString();
	}
}
