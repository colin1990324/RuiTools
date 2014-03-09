package rui.tools.hr;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Class Person store personal information of a certain person
 * 
 * @author ColinMac
 * 
 */
public class Person {

	String firstName;
	String lastName;
	String gender;
	String nickName;
	Date birthDate;
	String personID;
	ArrayList<Education> educations = new ArrayList<Education>();
	ArrayList<Career> careers = new ArrayList<Career>();
	ArrayList<Contact> contacts = new ArrayList<Contact>();
	Time createDate;
	Time lastModifyDate;

	public Person(String firstName, String lastName, String personID,
			String gender) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.personID = personID;
		this.gender = gender;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void addEducation(Education education) {
		this.educations.add(education);
	}

	public void addCareer(Career career) {
		this.careers.add(career);
	}

	public void addContact(Contact contact) {
		this.contacts.add(contact);
	}
}
