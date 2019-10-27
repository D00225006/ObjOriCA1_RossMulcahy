package com.mycompany.objorica1_rossmulcahy;

import java.util.ArrayList;

/**
 *
 * @author Rossm
 */
public class Levels 
{
//VARIABLES
    private ArrayList<Player> players = new ArrayList<Player>();
    private String Name; 
//CONSTRUCTOR
    public Levels(String Name)
    {
        this.Name = Name;
    }
//GETTERS
    public String getName() 
    {
        return Name;
    }
    
//SETTERS
    public void setName(String Name)
    {
        this.Name = Name;
    }

//METHODS
    public void addPlayer() {
        players.add(new Player(100, "Darrell"));
    }
    public void changeHealth()
    {
        if(Player.getHealth() <= 0)
        {
            players.remove(this.players);
        }
    }
}
