
import java.util.Arrays;

public class Member extends Person{
    //data field
    private String memberType;
    private int points;
    private Date regDate;
    private static int totalMember = 0;

    //No constructor arguement
    public Staff(){
        totalMember++;
    }

    //Constructor 
    public Staff(String ID, Name name, char gender, String phone, Address[] address, String memberType, int points, Date regDate, int totalMember){
        super(ID, name, gender, phone, address);
        this.memberType = memberType;
        this.points = points;
        this.regDate = regDate;
        totalMember ++;
    }
    
    //set
    public void setMemberType(String memberType){
        this.memberType = memberType;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public void setRegDate(Date regDate){
        this.regDate = regDate;
    }

    public static void setTotalMember(int totalMember){
        this.totalMember = totalMember;
    }

    //get
    public String getMemberType(){
        return memberType;
    }

    public int getPoints(){
        return points;
    }

    public Date getRegDate(){
        return salary;
    }

    public static int setTotalMember(){
        return totalMember;
    }

    @Override
    public String toString() {
        return String.format("%-30s %-15s %-10s %-15s %-10s",
            memberType,points,regDate,totalMember);
    }

    public static String getHeaderRow() {
        return String.format("%-30s %-15s %-10s %-15s %-10s",
            "Member Type","Points","Registration Date","Total Members");
    }
}
