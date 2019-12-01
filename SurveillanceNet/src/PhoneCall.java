
public class PhoneCall extends Communication {
	
	//Phone call's fields
	private int callDuration; //Phone call's duration

	//Phone call's constructor, with fields
	public PhoneCall(String phoneNumber1, String phoneNumber2, int day, int month, int year, int callDuration) {
		super(phoneNumber1, phoneNumber2, day, month, year); //Initialize communication's fields
		this.callDuration = callDuration; //Initialize phone call's duration
	}

	//Print phone call information
	public void printInfo() {
		System.out.println("This phone call has the following info \n" + 
				"Between " + phoneNumber1 + " --- "  + phoneNumber2 + "\n" + 
				"on " + year + "/" + month + "/" + day + "\n" +
				"Duration: " + callDuration);
	}
	
	//Return phone call duration
	public int getPhoneCallDuration() {
		return callDuration;
	}

}
