package rui.tools.hr;
import java.sql.Date;

/**
 * record of an education experience
 * 
 * @author ColinMac
 * 
 */
public class Education {

	public static final String PRIMARYSCHOOL = "PrimarySchool";
	public static final String MIDDLESCHOOL = "MiddleSchool";
	public static final String HIGHSCHOOL = "HighSchool";
	public static final String BACHELOR = "Bachelor";
	public static final String MASTER = "Master";
	public static final String DOCTOR = "Doctor";
	public static final String POSTDOCTOR = "PostDoctor";

	String school;
	Date entryDate;
	Date graduateDate;
	boolean quit = false;
	String level;

	public Education(String school, Date entryDate, Date graduateDate,
			String level) {
		// TODO Auto-generated constructor stub
		this.school = school;
		this.entryDate = entryDate;
		this.graduateDate = graduateDate;
		this.level = level;
	}

	/**
	 * set quick school true
	 */
	public void setQuitTrue() {
		quit = true;
	}
}
