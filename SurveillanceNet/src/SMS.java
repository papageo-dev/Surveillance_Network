
public class SMS extends Communication {
	
	//SMS's fields
	private String content; //SMS's content text

	//SMS's constructor, with fields
	public SMS(String phoneNumber1, String phoneNumber2, int day, int month, int year, String content) {
		super(phoneNumber1, phoneNumber2, day, month, year); //Initialize communication's fields
		this.content = content; //Initialize SMS's content text
	}

	public void printInfo() {
		System.out.println("This SMS has the following info\r\n" + 
				"Between 00478484777777 --- 00446999888888\r\n" + 
				"on 2017/10/14\r\n" + 
				"Text: Gun Received from Rusty Knife\r\n" + 
				"This SMS has the following info\r\n" + 
				"Between 00478484777777 --- 00446999888888\r\n" + 
				"on 2017/10/15\r\n" + 
				"Text: Metro Attack ready");
		
	}

}
