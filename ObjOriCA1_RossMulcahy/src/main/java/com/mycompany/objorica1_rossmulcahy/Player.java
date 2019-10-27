package com.mycompany.objorica1_rossmulcahy;

/**
 *
 * @author Rossm
 */
public class Player 
{
//VARIABLES
    private int health;
    private String name;
//CONSTRUCTOR
    public Player(String name) 
    {
        this.health = 100;
        this.name = name;
    }
//GETTERS
    public int getHealth() 
    {
        return health;
    }

    public String getName() 
    {
        return name;
    }
//METHODS
    public void updateHealth(int change, boolean damaged)
    {
        if(damaged == true)
        {
            this.health -= change;
            if(this.health <= 0)
            {
                System.out.println("Player " + this.name + " Died.");
            }
        }
        else
        {
            this.health += change;
            if(this.health > 100)
            {
                this.health = 100;
            }
        }
    }
}
