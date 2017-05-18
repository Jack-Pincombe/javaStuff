/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnet.profile;




/**
 *
 * @author jackpincombe
 * 
 * Class to create a new members profile to the network
 */
public class Profile {
    
    private String firstName;
    private String lastName;
    private int age;
    private String location;
           
    //constructor
    Profile (String firstName,String lastName, int age, String location)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }
    
    public String getName()
    {
        return this.firstName + " " + this.lastName;
    }
    
    public void setName(String name)
    {
        
    }
    
    public void setAge(int age)
    {
        
    }
        
        
    public void setLocation(String location)
    {
        
    }
}
