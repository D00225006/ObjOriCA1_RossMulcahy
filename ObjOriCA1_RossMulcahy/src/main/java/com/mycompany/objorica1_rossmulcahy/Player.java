package com.mycompany.objorica1_rossmulcahy;

import java.util.ArrayList;

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
    public Player(int Health, String Name) 
    {
        this.Health = Health;
        this.Name = Name;
    }
//GETTERS
    private int getHealth() 
    {
        return Health;
    }

    private String getName() 
    {
        return Name;
    }
//SETTERS
    private void setHealth() 
    {
        this.Health = 100;
    }

    private void setName(String Name) 
    {
        this.Name = Name;
    }
}
