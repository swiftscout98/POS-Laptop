import java.text.SimpleDateFormat;
import java.util.Date;

public class Member extends Person {
    // Data fields
    private int points;
    private static int totalMember = 0;
    
    // No-argument constructor
    public Member() {
        totalMember++;
    }
    
    // Constructor with corrected parameter types
    public Member(String name, char gender, String phone, Address address, int points, int totalMember) {
        //auto generated date
	    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HHmm");
        String orderID = String.format("%sMem%s", dateFormat.format(date),timeFormat.format(date));
        super(name, gender, phone, address);
        this.points = points;
        Member.totalMember++;
    }
    
    // Setter methods (setTotalMember corrected)
    public void setPoints(int points) {
        this.points = points;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public static void setTotalMember(int totalMember) {
        Member.totalMember = totalMember;
    }

    // Getter methods

    public int getPoints() {
        return points;
    }

    public String getRegDate() {
        return regDate;
    }

    public static int getTotalMember() {
        return totalMember;
    }
	

    public void addPoint(double totalPrice){
        points += (int)totalPrice; 
    }

    public void minusPoint(int minus){
        points -= minus;
    }

    //toString
    public String toString() {
        return String.format("%s\t\t\nPoints :%s\t\t\nRegister Date: %s",
                super.toString(),points, regDate);
    }

    @Override
    public String getRow() {
        return String.format("\t\t%-10s %-20s %-15d %-15s",super.ID, super.name, points, regDate);
    }
}
