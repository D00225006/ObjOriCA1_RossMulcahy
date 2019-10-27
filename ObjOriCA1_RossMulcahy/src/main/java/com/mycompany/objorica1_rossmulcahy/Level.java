package com.mycompany.objorica1_rossmulcahy;
import java.util.ArrayList;
/**
 *
 * @author Rossm
 */
public class Level
{
//VARIABLES
    private ArrayList<Player> currentPlayers = new ArrayList<Player>();
    private String name;
    private String description;
    private int size;
    
//CONSTRUCTOR
    public Level(String name, String description, int size) 
    {
        this.name = name;
        this.description = description;
        this.size = size;
    }
    
//GETTERS
    public String getName() 
    {
        return name;
    }
    public String getDescription() 
    {
        return description;
    }
    public int getSize() 
    {
        return size;
    }

//METHODS
    public void addPlayer(Player player) 
    {
        currentPlayers.add(player);
    }
    public void getPlayer(int number)
    {
        currentPlayers.get(number);
    }
}
