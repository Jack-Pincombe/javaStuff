/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnet;

import socialnet.profile.*;
/**
 *
 * @author jackpincombe
 */
public class SocialNet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        profileCoord profiles = new profileCoord();
        profiles.createUser("Jack","Pincombe",22,"Lisbellaw");
        System.out.println(profiles);
    }
    
}
