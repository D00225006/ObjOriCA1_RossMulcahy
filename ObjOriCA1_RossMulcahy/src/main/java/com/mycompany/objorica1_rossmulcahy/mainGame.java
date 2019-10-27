
package com.mycompany.objorica1_rossmulcahy;

import java.util.ArrayList;

/**
 *
 * @author Rossm
 */
public class mainGame 
{
    public static void main(String[] args) 
    {
        Game shooter = new Game(5, "Shooter!", "All", true);
        
        Level level1 = new Level("Armory", "Heavily guarded military base", 7);
        Level level2 = new Level("Forest", "Lots of trees", 5);
        Level level3 = new Level("Caves", "Damp, dark tunnels", 3);
        Level level4 = new Level("Spaceship", "An alien spaceship from space", 10);
        Level level5 = new Level("Home", "A generic house", 1);
        
        shooter.addLevel(level1);
        shooter.addLevel(level5);
        shooter.addLevel(level3);
        
        Player player1 = new Player("Darrell");
        Player player2 = new Player("Mississipi");
        Player player3 = new Player("Skltonne");
        Player player4 = new Player("Cork");
        Player player5 = new Player("Sam");
        
        level3.addPlayer(player1);
        level3.addPlayer(player2);
        level5.addPlayer(player5);
        level4.addPlayer(player3);
        level4.addPlayer(player3);
        level1.addPlayer(player4);
        level3.addPlayer(player5);
    }
}
