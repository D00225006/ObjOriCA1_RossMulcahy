package com.mycompany.objorica1_rossmulcahy;

import java.util.ArrayList;

/**
 *
 * @author Rossm
 */
public class Game 
{
    private ArrayList<Levels> level = new ArrayList<Levels>();
    
    public static void main(String[] args) 
    {
        
    }
    
    public void addLevel()
    {
        level.add(new Levels("The Armory"));
    }
    
    public void addPlayerToLevel()
    {
        Levels.addPlayer();
    }
}
