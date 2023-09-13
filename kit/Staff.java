import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff extends Person{
    //data field
    private String position;
    private String password;
    private double salary;
    private static int totalStaff = 0;

    //No constructor arguement
    public Staff(){
        totalStaff++;
    }

    //Constructor 
    public Staff(String name, char gender, String phone, Address address, String position, String password, double salary){
        SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
        String orderID = String.format("%sStf%s", dateFormat.format(date),timeFormat.format(date));
        super(ID, name, gender, phone, address);
        this.position = position;
        this.salary = salary;
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

    public void setEnterDate(String enterDate){
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

    public String setEnterDate(){
        return enterDate;
    }

    public static int setTotalStaff(){
        return totalStaff;
    }
    

    public String toString() {
        return String.format("%s\t\t\nPosition :%s\t\t\nSalary: %s",
                super.toString(),points,position);
    }

    @Override
    public String getRow() {
        return String.format("\t\t%-10s %-20s %-15s %-10lf %-15s",super.ID, super.name, position, salary, regDate);
    }

}
