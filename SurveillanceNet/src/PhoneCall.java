
public class PhoneCall extends Communication {
	
	//Phone call's fields
	private int callDuration; //Phone call's duration

	//Phone call's constructor, with fields
	public PhoneCall(String phoneNumber1, String phoneNumber2, int day, int month, int year, int callDuration) {
		super(phoneNumber1, phoneNumber2, day, month, year); //Initialize communication's fields
		this.callDuration = callDuration; //Initialize phone call's duration
	}

}
