package try3.hello.src.chapter10_exercise16_copy;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class Inventory {

    
    public static void main(String args[]){

        boolean loop=false;
        Scanner scan = new Scanner(System.in);
        int num_choice, prod_item, stocknum=1000;
        Choices cho = new Choices();
        ArrayList<Product> prods =new ArrayList<Product>();

        
        while(!loop){
            cho.newline();
            cho.user_choices();     
            num_choice=cho.userinputvalidation("Enter your choice: ");
            cho.newline();
            switch(num_choice){
                case 1:

                    String prod_name=cho.inputs("Please enter the name of the product: ");
                    prod_item=cho.userinputvalidation("Please input the number of stock:");
                    if(prod_item>0) {
                        prods.add(new Product(prod_name, stocknum, prod_item)); 
                        stocknum++;
                        System.out.println("Added!!!!");
                    }else System.out.println("You enter an invalid number!!!!");
                    cho.scan();
                    break;

                case 2:
                System.out.println(" ================================= "); 
                System.out.format("%s %10s %23s","|","Name","|\n"); 
                System.out.println("|=================================|");   
                for(int x=0; x<prods.size(); x++){
                    System.out.format("%1s %s %s %s %-10s %17s","|","[",(x+1),"]",prods.get(x).getName(),"|\n");  
                }
                System.out.println(" ================================= "); 
                    prod_item=cho.userinputvalidation("Please choose the number of the product:");
                    prods.get(prod_item-1).setdiscontinuing();
                    cho.scan();
                    break;

                case 3:
                System.out.println("|===========================================================|");
                System.out.format("%s %15s %20s %20s %s","|","Name","Stock","Quantity","|\n");  
                System.out.println("|===========================================================|");
                    for(int x=0; x<prods.size(); x++){
                        System.out.format("%s %15s %20s %20s %s","|",prods.get(x).getName(),prods.get(x).getStock(),prods.get(x).getquantity(),"|\n");
                    }
                System.out.println("|===========================================================|");
                    cho.scan(); 
                    break;

                case 4:
                File textFile = new File("try.txt");

                try{
        
                    FileOutputStream out = new FileOutputStream(textFile);    
                    ObjectOutputStream writeitem = new ObjectOutputStream(out);          
                    for(int x=0; x<prods.size(); x++){
                    writeitem.writeObject(prods.get(x));
                    }
                    writeitem.close();  
                    out.close();

                    ArrayList<Product> stu1 =new ArrayList<Product>();
                    FileInputStream in = new FileInputStream(textFile);
                    ObjectInputStream readStu = new ObjectInputStream(in);
                    for(int y=0; y<prods.size(); y++){
                    Product stu2 = (Product)readStu.readObject();
                    stu1.add(stu2);
                }
                    readStu.close();
                    
                    
                    System.out.println("|===========================================================|");
                    System.out.format("%s %15s %20s %20s %s","|","Name","Stock","Quantity","|\n");  
                    System.out.println("|===========================================================|"); 
                    for(int x=0; x<prods.size(); x++){
                    System.out.format("%s %15s %20s %20s %s","|",( stu1.get(x).getName()),( stu1.get(x)).getStock(),( stu1.get(x)).getquantity(),"|\n");
                    }
                    System.out.println("|===========================================================|");

                    } catch (FileNotFoundException e) {
                    System.out.println("File could not be found.");
                    System.err.println("FileNotFoundException: " 
                    + e.getMessage());
                    } catch (IOException e) {
                    System.out.println("Problem with input/output.");
                    System.err.println("IOException: " + e.getMessage());
                    } 
                    catch (ClassNotFoundException e) {
                    System.out.println("Class could not be used to cast object.");
                    System.err.println("ClassNotFoundException: " 
                    + e.getMessage());
                    }
                    cho.scan();
                    break;
                case 5:
                    System.out.println("Thank you");
                    loop=true;

                    break;

                default:
                    System.out.println("Invalid input!!");
                    break;
            }
            
        }


        scan.close();
    }
}
