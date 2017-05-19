/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialnet.profile;

import java.util.*;

/**
 *
 * @author jackpincombe
 */
public class members {
    
    public static final int MINIUM_AGE = 13;
    
    private final List<Profile> profiles;
    
    members(Profile profile)
    {
        profiles = new ArrayList<Profile>();
        profiles.add(profile);
        
    }
    
    void addMember(Profile profile)
    {
        profiles.add(profile);
    }
}
