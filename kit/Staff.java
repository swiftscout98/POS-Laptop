import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff extends Person{
    //data field
    private String position;
    private String salesPassword;
    private double salary;
    private Date enterDate;
    private static int totalStaff = 0;

    //No constructor arguement
    public Staff(){
        totalStaff++;
    }

    //Constructor 
    public Staff(String ID, String name, char gender, String phone, Address[] address, String position, String salesPassword, double salary, Date enterDate){
        super(ID, name, gender, phone, address);
        this.position = position;
        this.salary = salary;
        this.enterDate = enterDate;
        totalStaff ++;
    }
    
    //set
    public void setPosition(String position){
        this.position = position;
    }

    public void setSalesPassword(String salesPassword){
        this.salesPassword = salesPassword;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setEnterDate(Date enterDate){
        this.enterDate = enterDate;
    }

    public static void setTotalStaff(int totalStaff) {
	    Staff.totalStaff = totalStaff;
	}

    //get
    public String getPosition(){
        return position;
    }

    public String getSalesPassword(){
        return salesPassword;
    }

    public double getSalary(){
        return salary;
    }

    public Date setEnterDate(){
        return enterDate;
    }

    public static int setTotalStaff(){
        return totalStaff;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the date format as needed

        return String.format("%-30s %-15s %-15s %-10s %-10s",
                position, salesPassword, salary, dateFormat.format(enterDate), totalStaff);
    }

    public static String getHeaderRow() {
        return String.format("%-30s %-15s %-15s %-10s %-10s",
                "Position", "Sales Password", "Salary", "Enter Date", "Total Staff");
    }
}
