package com.mycompany.objorica1_rossmulcahy;

/**
 *
 * @author Rossm
 */
public class Player 
{
//VARIABLES
    private int Health;
    private String Name;
//CONSTRUCTOR
    public Player(String Name) 
    {
        this.Health = 100;
        this.Name = Name;
    }
//GETTERS
    public int getHealth() 
    {
        return Health;
    }

    public String getName() 
    {
        return Name;
    }
//METHODS
    
}
