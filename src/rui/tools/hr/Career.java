package rui.tools.hr;
import java.sql.Date;

public class Career {
	String company;
	String title;
	Date entryDate;
	Date quitDate;

	public Career(String company, String title, Date entryDate) {
		this.company = company;
		this.title = title;
		this.entryDate = entryDate;
	}

	public void setQuitDate(Date quitDate) {
		this.quitDate = quitDate;
	}
}
