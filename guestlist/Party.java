package course2module3.src.guestlist;

public class Party {

    //instance variable
    private final int maxGuest;
    private int numberGuest;
    private String[] name;
    private String hostName;

    public Party(int maxGuest, String hostName)//constructor method that set the value of the variables
    {
        this.maxGuest=maxGuest;
        this.hostName=hostName;
        this.name= new String[this.maxGuest];        
    }

    public void addGuest(String name){//method that  add guest else the guest is max of the name to be add is already in the array
        
        if(numberGuest<maxGuest)//checking if the number of guest is full
        {
           {
                if(isOnList(name))//checking if the name is already in the array
                {
                    System.out.println(name+" is already on the guest list");
                }

                else 
                {
                    this.name[numberGuest]=name;//adding the name into the array
                    numberGuest++;//increment if the name is added to the array
                }
            }
        }
        else
        {
            System.out.println(name+" cannot come to the party. The guest list is full.");
        }      
    }

    public boolean isOnList(String guest)//method by checking is the name is already in the list
    {
        boolean hold=false;
        for(int x=0; x<this.name.length; x++){
            if(guest.equalsIgnoreCase(this.name[x]))//checking if the name is in the array
            {
                hold= true;
                break;
            }
        }
    return hold;//return a value that will be use in other method and condition 
    }

    public void printParty() //method that print the guest list and party host
    {
        System.out.println("Guest list for "+ hostName +" party:");
        for(int x=0; x<this.name.length; x++){
            System.out.format("%10s %s %s","", this.name[x],"\n");
        }
    }
    
}
