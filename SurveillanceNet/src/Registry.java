import java.util.ArrayList;

public class Registry {
	
	//Create an ArrayList with all suspects
	private ArrayList<Suspect> allSuspects = new ArrayList<Suspect>();
	//Create an ArrayList with all communications
	private ArrayList<Communication> allComm = new ArrayList<Communication>();
	
	//Add a suspect to the ArrayList: "allSuspects"
	public void addSuspect(Suspect aSuspect) {
		allSuspects.add(aSuspect);
	}
	
	//Add a communication to the ArrayList: allComm and...
	public void addCommunication(Communication aCommunication) {
		allComm.add(aCommunication);
		//I should write... if comm is between num1, num2, update list with common partners
	}
	
	//Returns suspect with the most potential partners
	public Suspect getSuspectWithMostPartners() {
		
	}
	
	//Returns the longest phone call between number1 and number2
	public PhoneCall getLongestPhoneCallBetween(String number1, String number2) {
		
	}
	
	//Returns all messages that contains “Bomb”, “Attack”, “Explosives”, “Gun”, between number1 and number2
	public ArrayList<SMS> getMessagesBetween(String number1, String number2) {
		
	}
	
	//Returns all suspects that they came from specific Country
	public Suspect printSuspectsFromCountry(String country) {
		
	}

}
