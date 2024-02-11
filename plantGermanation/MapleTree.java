package try3.plantGermanation;

/**
* Java Course 2 Module 1
*
* @author Jayperson Babaran
* @Description: A class of the program that out print the plant date, germinate date and intial height.
* Created Date: 5/17/2022
* Modified Date: 5/17/2022
* @Modified By: Jayperson Babaran
*
*/

public class MapleTree {
    public static void main( String [] args)
    {
        MapleTreeDriver objplant= new MapleTreeDriver();// creating and object of MapleTreeDriver

        objplant.plant(); //calling the method plant in object objplant
        objplant.germinate(); //calling the method plant in object germinate
        objplant.dumpData(); //calling the method plant in object dumpData
    }
    
}
