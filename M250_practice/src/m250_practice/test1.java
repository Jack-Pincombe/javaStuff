/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m250_practice;

/**
 *
 * @author jackpincombe
 */
 class test1 {
    
    int x;
    int y;
    String name;
    
    test1(int x, int y, String name)
    {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    
    public String wName()
    {
        return this.name;
    }
    
    /**
     * simply adding the two vars x and y together
     * @return x + y
     */
    public int add()
    {
        return x + y;
    }
    
    public static String charlieIsADick()
    {
        String name = "Charlie is a Dick";
        return name;
    }
}
