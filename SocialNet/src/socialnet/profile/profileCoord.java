/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnet.profile;

/**
 *
 * @author jackpincombe
 */
public class profileCoord {
    private members members;
    
    public profileCoord()
    {
        
    }
    
    public void createUser(String firstName,String lastName, int age, String location)
    {
        if (firstName == null || lastName == null || age == 0 || location == null) 
        {
             System.out.println("Please ensure that all of the fields have been entered");
        }
        else if (age <= 18) {
            System.out.println("You must be over the age of 12 to become a member");
        }
        else{
            Profile member = new Profile(firstName, lastName, age, location);
            members = new members(member);
            
        }
    }
    
}
