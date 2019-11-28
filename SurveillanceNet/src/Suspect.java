import java.util.ArrayList;

public class Suspect {
	
	//Suspect's fields
	private String name; //Suspect's name
	private String codeName; //Suspect's code name
	private String originCountry; //Suspect's country of origin
	private String actionCity; //Suspect's city of action
	
	//Create an ArrayList object, that will contains phone numbers used by suspect
	private ArrayList<String> telNumbers = new ArrayList<String>();

	//Suspect's constructor, with arguments
	public Suspect(String name, String codeName, String originCountry, String actionCity) {
		
		this.name = name; //Initialize suspect's name
		this.codeName = codeName; //Initialize suspect's code name
		this.originCountry = originCountry; //Initialize suspect's country of origin
		this.actionCity = actionCity; //Initialize suspect's city of action
	}
	
	

}
