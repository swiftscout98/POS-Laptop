import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Person {
    // Data fields
    protected String ID;
    protected String name;
    protected char gender;
    protected String phone;
    protected Address address;

	private Date date = new Date();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    protected String regDate = dateFormat.format(date);

    //no-argument 
    public Person() {
        name = ""; 
        gender = ' ';
        phone = "";
        address = new Address(); 
    }

    //Constructor
    public Person(String name, char gender, String phone, Address address) {
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }
    
	//set
	public void setName(String name){
		this.name = name;
	}
	
	public void setGender(char gender){
		this.gender = gender;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public void setAddress(Address address){
		this.address = address;
	}
	
	//get
	public String getID(){
    	return ID;
    }
    
	public String getName(){
		return name;
	}
	
	public char gender(){
		return gender;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public Address getAddress(){
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
		String namePattern = "^[a-zA-Z\\s]{3,50}$";
		if(name.matches(namePattern)){
			return true;
		}else{
			System.out.println("The name format should be enter more than 3 and less than 50 of the characters");
		}
		return false;
	}

	//gender
	public static boolean isValidGender(char gender){
		gender = Character.toUpperCase(gender);
		if(gender == 'M' || gender == 'F'){
			return true;
		}else {
			System.out.println("The gender you input is wrong");
		}
		return false;
	}
	
	//phone
	public static boolean isValidPhone(String phone){
		String patternPhone = "^[0-9]{10}$";
		if(phone.length() == 10 && phone.matches(patternPhone)){
			return true;
		}else {
			System.out.println("The phone pattern is wrong and length should be only 10 characters");
		}
		return false;
	}

	//ToStringMethod
	public String toString(){
		String genderWords = "";
		if(gender == 'M'){
			genderWords = "Male";
		}else{
			genderWords = "Female";
		}
		return String.format("\t\t%s\n\t\t%s\n\t\t%s\n\t\t%s",
				ID , name, genderWords, phone, address.toString());
	}

	public abstract String getRow();

	
	Create Edit Delete function?
}
