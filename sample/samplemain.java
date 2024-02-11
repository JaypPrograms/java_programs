package sample;

import java.util.Scanner;

public class samplemain {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=0, total=0;
    
    System.out.print("enter number:");
    num=scan.nextInt();
    int [] numbers= new int[num];

    for(int index=0; index<num; index++){
        System.out.print("enter number:");
        numbers[index]=scan.nextInt();
    }

    if(numbers[0]<numbers[1]){
        for(int index=1; index<num; index++){

            if(numbers[index]-numbers[index-1]<1  || numbers[index]-numbers[index-1]>1){
                total++;
                
            }
        }}

    else{
    for(int index=1; index<num; index++){
        if(numbers.length<=index){
        if(numbers[index-1]-numbers[index]>1 || numbers.length<=index){
            total++;
        }}
    }}

    System.out.println(total);
    scan.close();



    }
    
}

