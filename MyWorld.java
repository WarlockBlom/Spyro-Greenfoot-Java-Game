import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
   GreenfootSound myMusic = new GreenfootSound("Spyro Custom Theme.mp3"); 

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
     public MyWorld()
    {    
        // Create a new world with 800x500 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        
    }

    public void act()
    {
       myMusic.play();
       
   }
}