package com.mycompany.objorica1_rossmulcahy;

/**
 *
 * @author Rossm
 */
public class Levels
{
//VARIABLES
    private String name;
    private String description;
    private int size;
    
//CONSTRUCTOR
    public Levels(String name, String description, int size) 
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
    public void addPlayer() 
    {
        
    }    
}
