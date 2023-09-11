import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Member extends Person {
    // Data fields
    private String memberType;
    private int points;
    private Date regDate;
    private static int totalMember = 0;

    // No-argument constructor
    public Member() {
        totalMember++;
    }

    // Constructor with corrected parameter types
    public Member(String ID, Name name, char gender, String phone, Address[] address, String memberType, int points, Date regDate, int totalMember) {
        super(ID, name, gender, phone, address);
        this.memberType = memberType;
        this.points = points;
        this.regDate = regDate;
        Member.totalMember++;
    }

    // Setter methods (setTotalMember corrected)
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public static void setTotalMember(int totalMember) {
        Member.totalMember = totalMember;
    }

    // Getter methods

    public String getMemberType() {
        return memberType;
    }

    public int getPoints() {
        return points;
    }

    public Date getRegDate() {
        return regDate;
    }

    public static int getTotalMember() {
        return totalMember;
    }
	
	//validation
	//membertype
	
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the date format as needed

        return String.format("%-30s %-15s %-15s %-10s %-10s",
                memberType, points, dateFormat.format(regDate), totalMember);
    }

    public static String getHeaderRow() {
        return String.format("%-30s %-15s %-15s %-10s %-10s",
                "Member Type", "Points", "Registration Date", "Total Members");
    }
}
