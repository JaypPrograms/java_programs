package course2module3.src.guestlist;

public class PartyDriver {
   public static void main(String[] args)

    {
    
      Party party = new Party(3, "David Beckham");//creating an object with parameter
    
      party.addGuest("Roberto Baggio");
    
      party.addGuest("Zinedine Zidane");
    
      party.addGuest("Roberto Baggio");
    
      party.addGuest("Johan Cruyff");
    
      party.addGuest("Diego Maradona");
    
      party.printParty();
    
    } // end main 


}
