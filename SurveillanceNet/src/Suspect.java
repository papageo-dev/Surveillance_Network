import java.util.ArrayList;

public class Suspect {
	
	//Suspect's fields
	private String name; //Suspect's name
	private String codeName; //Suspect's code name
	private String originCountry; //Suspect's country of origin
	private String actionCity; //Suspect's city of action
	
	//Create an ArrayList object, that contains phone numbers used by suspect
	private ArrayList<String> phoneNumbers;
	
	//Create an ArrayList object, that contains suspect's potential partners
	private ArrayList<Suspect> potentialPartners;

	//Suspect's constructor, with arguments
	public Suspect(String name, String codeName, String originCountry, String actionCity) {
		this.name = name; //Initialize suspect's name
		this.codeName = codeName; //Initialize suspect's code name
		this.originCountry = originCountry; //Initialize suspect's country of origin
		this.actionCity = actionCity; //Initialize suspect's city of action
		phoneNumbers = new ArrayList<String>(); //Initialize a list of phone numbers used by suspect
		potentialPartners = new ArrayList<Suspect>(); //Initialize a list of suspect's potential partners
	}
	
	//Add a phone number used by suspect to the ArrayList: "phoneNumbers"
	public void addNumber(String number) {
		phoneNumbers.add(number);
	}
	
	//Add a suspect's potential partner to the ArrayList: "potentialPartners"
	public void addPotentialPartners(Suspect aSuspect) {
		for (int i=0; i<potentialPartners.size(); i++) { //Check if ArrayList contains the current potential partner
			if (potentialPartners.get(i).equals(aSuspect)) { //If contains, print message and break
				System.out.println("This suspect: " + aSuspect.name + " (" + aSuspect.codeName + ") "
			                       + "is already a partner of suspect: " + potentialPartners.get(i).name
			                       +  " (" + potentialPartners.get(i).codeName + ") ");
				break;
			}
			else { //If not contains, add to ArrayList: "potentialPartners"
				potentialPartners.add(aSuspect);
			}
		}
	}
	
	//Returns true if current suspect and aSuspect are connected, else returns false
	public boolean isConnectedTo(Suspect aSuspect) {
		
		boolean connected=false;
	
		return connected;
	}
	
	//Returns a list that contains suspect's common potential partners
	public ArrayList<Suspect> getCommonPartners(Suspect aSuspect){
		
		//Create an ArrayList, that will contains all common partners, between aSuspect and current suspect
		ArrayList<Suspect> commonPartners = new ArrayList<Suspect>();
		
		
		//Return list of common partners
		return commonPartners; 
	}
	
	//Print suspect's potential partners info
	public void printPotentialPartners() {
		for (int i=0; i<potentialPartners.size(); i++) {
			System.out.println(potentialPartners.get(i).name + potentialPartners.get(i).codeName);
		}
	}

	//Returns current suspect's name
	public String getName() {
		return name;
	}

	//Returns current suspect's code name
	public String getCodeName() {
		return codeName;
	}
	
	//Returns number of suspect's potential partners
	public int getPotentialPartnersSize(){
		return potentialPartners.size();
	}
	
	//Returns suspect's origin Country
	public String getOriginCountry() {
		return originCountry;
	}
	
	//Return a list with supsect's phone numbers
	public ArrayList<String> getPhoneNumbers(){
		return phoneNumbers;
	}
	
	@Override
	public boolean equals(Object o) {
		Suspect s = (Suspect)o;
		return (s.name==name);
	}
	

}
