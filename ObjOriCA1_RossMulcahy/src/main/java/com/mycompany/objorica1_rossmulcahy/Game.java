package com.mycompany.objorica1_rossmulcahy;
import java.util.ArrayList;
/**
 *
 * @author Rossm
 */
public class Game 
{
//VARIABLES
    private ArrayList<Levels> roster = new ArrayList<Levels>();
    private int numberOfLLevels;
    private String title;
    private String platform;
    private boolean multiplayer;
    
//CONSTRUCTOR
    public Game(int numberOfLLevels, String title, String platform, boolean multiplayer) 
    {
        this.numberOfLLevels = numberOfLLevels;
        this.title = title;
        this.platform = platform;
        this.multiplayer = multiplayer;
    }
//GETTERS
    public int getNumberOfLLevels() 
    {
        return numberOfLLevels;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getPlatform() 
    {
        return platform;
    }

    public boolean isMultiplayer() 
    {
        return multiplayer;
    }
    
//METHODS
    public void addLevel() 
    {
        Levels level = new Levels("Armory", "Heavily guarded military base", 8);
        roster.add(level);
    }
    
}
