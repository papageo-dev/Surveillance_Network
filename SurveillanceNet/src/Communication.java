
public class Communication {
	
	//Communication's fields
	protected String phoneNumber1; //Suspect's 1 phone number
	protected String phoneNumber2; //Suspect's 2 phone number
	protected int day; //Communication's day
	protected int month; //Communication's month
	protected int year; //Communication's year
	
	//Communication's constructor, with arguments
	public Communication(String phoneNumber1, String phoneNumber2, int day, int month, int year) {
		this.phoneNumber1 = phoneNumber1; //Initialize suspect's 1 phone number
		this.phoneNumber2 = phoneNumber2; //Initialize suspect's 2 phone number
		this.day = day; //Initialize communication's day
		this.month = month; //Initialize communication's month
		this.year = year; //Initialize communication's year
	}
	
	

}
