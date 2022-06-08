package Encap;
import java.util.Scanner;

class Person{    
    private int age; 
    private long contact;    
    private String name, gender, address;        
    
    public void setName(String newname){        
        name = newname;    
    }        
    
    public void setAge(int newage){        
        age = newage;    
    }        
    
    public void setGender(String newgender){        
        gender = newgender;    
    }        
    
    public void setAddress(String newadd){        
        address = newadd;    
    }        
    
    public void setContact(long newcon){        
        contact = newcon;    
    }        
    
    public String getName(){        
        return name;    
    }        
    
    public int getAge(){        
        return age;    
    }        
    
    public String getGender(){        
        return gender;    
    }        
    
    public String getAddress(){        
        return address;    
    }        
    
    public long getContact(){        
        return contact;    
    }
}