
public class SMS extends Communication {
	
	//SMS's fields
	private String contentText; //SMS's content text

	//SMS's constructor, with arguments
	public SMS(String phoneNumber1, String phoneNumber2, int day, int month, int year, String contentText) {
		super(phoneNumber1, phoneNumber2, day, month, year); //Initialize communication's arguments
		this.contentText = contentText; //Initialize SMS's content text
	}

	//Print SMS information
	public void printInfo() {
		System.out.println("This SMS has the following info \n" + 
				"Between " + phoneNumber1 + " --- " + phoneNumber2 + "\n" + 
				"on " + year + "/" + month + "/" + day + "\n" + 
				"Text: " + contentText + "\n");	
	}
	
	//Return SMS's content Text
	public String getContentText() {
		return contentText;
	}

	
}
