package course3module1.src.ArrayList;

import java.util.*;

public class ArrayListSample{
    
    public static void main(String []args){

        ArrayList<String> addressList = new ArrayList<String>();//creating arraylist 
        //adding value to array
        addressList.add("1600 Pennsylvania Avenue"); 
        addressList.add("221B Baker Street");
        addressList.add("8700 N.W. River Park Drive");

        for (String i: addressList) {//for each loop to outprint the value of arraylist
            System.out.println(i);
          }
    }
}
