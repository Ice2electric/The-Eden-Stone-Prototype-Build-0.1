import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ghast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ghast extends Actor
{
    /**
     * Act - do whatever the Ghast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if ( isAtEdge() ) 
        {
            turn(17);
        }

        if ( Greenfoot.getRandomNumber(100) < 10 ) 
        {
            turn( Greenfoot.getRandomNumber(90)-45 );
        }

        move(5);
        lookForWorm();
    }
    public void lookForWorm()
    {
        if ( isTouching(Hero.class) ) 
        {
            removeTouching(Hero.class);
            
        }
    }
}    

