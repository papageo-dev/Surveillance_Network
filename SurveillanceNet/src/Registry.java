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
		
		allComm.add(aCommunication); //Add a new communication
		
		//Check if communication is being between number1 and number2
		for (Suspect s1 : allSuspects) {
			for (Suspect s2 : allSuspects) {
				if (s1.getPhoneNumbers().contains(aCommunication.phoneNumber1) || s2.getPhoneNumbers().contains(aCommunication.phoneNumber2)) {
					s1.addPotentialPartners(s2);
					s2.addPotentialPartners(s1);
					break;
				}
			}
		}
	}

	//Return suspect with the most potential partners
	public Suspect getSuspectWithMostPartners() {
		
		Suspect mostPartnersSuspect = getAllSuspects().get(0); //Initialize the first suspect of the list, as this with the most partners
		
		//Search ArrayList with all suspects
		for (int i=0; i<getAllSuspects().size(); i++) {
			//If find a suspect with more than mostPartnersSuspect's partners...
			if (getAllSuspects().get(i).getPotentialPartnersSize()>mostPartnersSuspect.getPotentialPartnersSize()) {
				mostPartnersSuspect=getAllSuspects().get(i); //Make this suspect, the suspect with the most partners
			}
		}
		return mostPartnersSuspect; //Return the suspect with the most partners
	}
	
	//Return the longest phone call between number1 and number2
	public PhoneCall getLongestPhoneCallBetween(String number1, String number2) {
		
		Communication longestPhoneCall = allComm.get(0); //Initialize the first communication of the list, as the longest
		
		//Search ArrayList with all communications
		for (int i=0; i<allComm.size(); i++) {
			//Check if current communication is an instance of PhoneCall
			if (allComm.get(i) instanceof PhoneCall) {
				//Check if there are phone calls between number1 and number2...
				if (allComm.get(i).phoneNumber1==number1 && allComm.get(i).phoneNumber2==number2) {
					//Search for their longest phone call
					if (((PhoneCall) allComm.get(i)).getPhoneCallDuration()>((PhoneCall) longestPhoneCall).getPhoneCallDuration()) {
						longestPhoneCall=allComm.get(i); //Make this phone call, the longest phone call between these numbers
					}
				}
			}	
		}
		return (PhoneCall) longestPhoneCall; //Cast Communication "longestPhoneCall" to PhoneCall and return it
	}
	
	//Return an ArrayList with all messages that contains suspicious words, between number1 and number2
	public ArrayList<SMS> getMessagesBetween(String number1, String number2) {
		
		//Create an Array, that will contains all suspicious words
		String suspiciousWords[] = {"Bomb", "Attack", "Explosives", "Gun"};
		
		//Create an ArrayList, that will contains all suspicious messages, between number1 and number2
		ArrayList<SMS> suspiciousMessages = new ArrayList<SMS>();
				
		//Search ArrayList with all communications
		for (int i=0; i<allComm.size(); i++) {
			//Check if current communication is an instance of SMS
			if (allComm.get(i) instanceof SMS) {
				//Check if there is any SMS between number1 and number2...
				if (allComm.get(i).phoneNumber1==number1 && allComm.get(i).phoneNumber2==number2) {
					//Search for suspicious messages, between them
					for (int j=0; j<suspiciousWords.length; j++) {
						if (((SMS) allComm.get(i)).getContentText().contains(suspiciousWords[j])) {
								    //Add the message message to local ArrayList: suspiciousMessages
								    suspiciousMessages.add((SMS)allComm.get(i));  
						}
					}
				}
			}
		}
		return suspiciousMessages; //Return the ArrayList with all suspicious messages
	}
	
	//Return an ArrayList with all suspects
	public ArrayList<Suspect> getAllSuspects() {
		return allSuspects;
	}
	
	//Return all suspects that they came from specific Country
	public void printSuspectsFromCountry(String country) {
		
		for (int i=0; i<getAllSuspects().size(); i++) {
			if (getAllSuspects().get(i).getOriginCountry().equals(country)) {
				System.out.println(getAllSuspects().get(i).getName() + " (" + getAllSuspects().get(i).getCodeName() + ") ");
			}
		}	
	}
	
	
}
