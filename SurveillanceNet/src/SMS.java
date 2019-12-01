
public class SMS extends Communication {
	
	//SMS's fields
	private String content; //SMS's content text

	//SMS's constructor, with fields
	public SMS(String phoneNumber1, String phoneNumber2, int day, int month, int year, String content) {
		super(phoneNumber1, phoneNumber2, day, month, year); //Initialize communication's fields
		this.content = content; //Initialize SMS's content text
	}

	//Print SMS information
	public void printInfo() {
		System.out.println("This SMS has the following info \n" + 
				"Between " + phoneNumber1 + " --- " + phoneNumber2 + "\n" + 
				"on " + year + "/" + month + "/" + day + "\n" + 
				"Text: " + content + "\n");	
	}

	//I should delete it
	@Override
	public int getPhoneCallDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
