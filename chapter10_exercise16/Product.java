package try3.hello.src.chapter10_exercise16_copy;

import java.io.Serializable;

public class Product implements Serializable {


    private String name;
    private int stock;
    private int quantity;


    public Product(String name, int stock, int quantity){
        this.name=name;
        this.stock=stock;
        this.quantity=quantity;

    }

    public int getquantity(){
        return quantity;
    }

    public void setquantity(int quantity){
        this.quantity=quantity;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setdiscontinuing(){
        this.name="discontinuing";
        this.quantity=0;
        System.out.println("Done!!!!!");
    }

}
