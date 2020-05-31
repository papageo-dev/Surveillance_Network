# Surveillance_Network
 
  A system for monitoring the activity of a network of suspected criminals and the relationships that exist between them, in Java.

# General Description

Every Suspect on the SurveillanceNet network is characterized by his/her name, his/her code name, the country of origin,      
the city in which he/she operates and a list of telephone numbers that he/she uses.                                  
Each suspect is associated with one or more than the rest of the network's suspects(potential partners).                    
Ther is a connection between two suspects, if they have contacted by phone at least once.

The system also maintains a central Registry of all Communications, which can be either PhoneCall or SMS.                     
Registry also maintains a list of all suspects.                                                                              

# System Features

1. Communications                                                                                                            
 - Each communication is characterized by two telephone numbers involved and the date(yyyy/mm/dd) that it took place.                                       
   A phone call is further characterized by its duration(in seconds) and an SMS by the content of the message.                 
 - All telephone communications(Phone call/SMS) have a printInfo() method of printing all their properties.                                   
 
2. Suspects                                                                                                                  
 - Add a phone number to the suspect's phone list.                                                                          
 - Add a suspect to another suspect's potential partners list. This happens if suspect isn't already in the list of suspect's        
   potential partners.                                                                                                     
 - Check if two suspects are partners or not.                                                                                                                                                         
 - Return a list, that contains suspect's potential partners.                                                                                                                             
 - Prints suspect's potential partners(names and code names), using an asterisk(*) after the code name, if they come from        the same Country.                                                                                                                                                                                                  
 
3. Registry                                                                                                                 
 - Add a new suspect.                                                                                                         
 - Add a new communication. If the communication concerns Number1 and Number2 telephone numbers, then update suspects'          partner lists.                              
 - Return suspect who has the most partners.                                                                                                                                                                                                                                       
 - Return the longer(duration) phone call, between two phone numbers.                                                                                                                   
 - Return suspicious messages, between two phone numbers.                                                                                                                                   
 - Print all suspects coming from a specific Country.                                                                        
                                                                       
                                         
 

                                                                       

 
