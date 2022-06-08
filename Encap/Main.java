package Encap;

import java.util.Scanner;

public class Main {    
    
    public static void main (String[] args){            
        Scanner scan = new Scanner(System.in);        
        Person person = new Person();    
        
        System.out.println("\nUse underscore(_) for space"); 
        System.out.println("Name: ");        
        person.setName(scan.next());                
        
        System.out.println("Age: ");        
        person.setAge(scan.nextInt()); 
        
        System.out.println("Contact: ");        
        person.setContact(scan.nextLong());
        
        System.out.println("Gender: ");        
        person.setGender(scan.next());                
        
        System.out.println("Address: ");        
        person.setAddress(scan.next());                
                        
        
        System.out.println("\nPress 1 to get Name");        
        System.out.println("Press 2 to get Age");        
        System.out.println("Press 3 to get Gender");        
        System.out.println("Press 4 to get Address");        
        System.out.println("Press 5 to get Contact");        
        System.out.println("Press 6 to get All Info\n");                
        
        Scanner info = new Scanner(System.in);        
        int infonum = info.nextInt();      

        switch(infonum){            
            case 1:                
                System.out.println("Name: " + person.getName());                
                break;            
            case 2:                
                System.out.println("Age: " + person.getAge());                
                break;            
            case 3:                
                System.out.println("Gender: " + person.getGender());                
                break;            
            case 4:                
                System.out.println("Address: " + person.getAddress());                
                break;              
            case 5:                
                System.out.println("Contact: " + person.getContact());                
                break;            
            case 6:                
                System.out.println("Name: " + person.getName());                
                System.out.println("Age: " + person.getAge());                
                System.out.println("Gender: " + person.getGender());                
                System.out.println("Address: " + person.getAddress());                
                System.out.println("Contact: " + person.getContact());                
                break;            
            default:                
                System.out.println("You pressed a wrong number.");                
                break;        
            }
    }
}