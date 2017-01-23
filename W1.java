import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class W1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class W1 extends World
{
    Hero player;
    Ghast em1;
    Chest chest;
    public boolean W1RM2 = false;
    /**
     * Constructor for objects of class W1.
     * 
     */
    public W1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 387, 1); 
       player = new Hero();
       chest = new Chest();
       em1 = new Ghast();
       addObject(player, getWidth()/2, getHeight()/2);
       addObject(chest, getWidth()/2+45, getHeight()/2+15);
       //changeBackground();
       
    }
    public void changeBackground()
    {
        boolean changeRoom2 = player.checkChangeWorld();
        if (changeRoom2 = true){
            addObject(em1, 30, 30);
            setBackground("W1-RM2.png"); //set image as bad plane 1
            
        }
      
    }
}
