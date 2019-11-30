import java.util.ArrayList;

public class Suspect {
	
	//Suspect's fields
	private String name; //Suspect's name
	private String codeName; //Suspect's code name
	private String originCountry; //Suspect's country of origin
	private String actionCity; //Suspect's city of action
	
	//Create an ArrayList object, that contains phone numbers used by suspect
	private ArrayList<String> phoneNumbers = new ArrayList<String>();
	
	//Create an ArrayList object, that contains suspect's potential partners
	private ArrayList<String> potentialPartners = new ArrayList<String>();

	//Suspect's constructor, with arguments
	public Suspect(String name, String codeName, String originCountry, String actionCity) {
		this.name = name; //Initialize suspect's name
		this.codeName = codeName; //Initialize suspect's code name
		this.originCountry = originCountry; //Initialize suspect's country of origin
		this.actionCity = actionCity; //Initialize suspect's city of action
	}
	
	//Add a phone number used by suspect to the ArrayList: "phoneNumbers"
	public void addNumber(String number) {
		phoneNumbers.add(number);
	}
	
	//Add a suspect's potential partner to the ArrayList: "potentialPartners"
	public void addPotentialPartners(String partner) {
		for (int i=0; i<potentialPartners.size(); i++) { //Check if ArrayList contains the current potential partner
			if (potentialPartners.get(i).equalsIgnoreCase(partner)) { //If contains, break
				break;
			}
			else { //If not contains, add to ArrayList: "potentialPartners"
				potentialPartners.add(partner);
			}
		}
	}
	
	//Returns true if current suspect and aSuspect are connected, else returns false
	public boolean isConnectedTo(Suspect aSuspect) {
		
	}
	
	//Returns a list that contains suspect's common potential partners
	public ArrayList<String> getCommonPartners(Suspect aSuspect){
		
	}
	

}
