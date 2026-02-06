import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Gnorc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gnorc extends Actor
{
    private int speed;
    /**
     * Act - do whatever the Gnorc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      moveAndTurn();
      collect();
    }   
    
    public void moveAndTurn()
    {
      move(speed);
      if (Greenfoot.getRandomNumber(100) < 10)
      {
          turn(Greenfoot.getRandomNumber(90)-45);
      }
      if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
      {
          turn(180);
      }
      if (getY() <= 5 || getY() >= getWorld().getHeight() - 5)
      {
          turn(180);
      }
    }
    
    public void collect()
    {
        Actor Gem;
        Gem = getOneObjectAtOffset(0, 0, Gem.class);
        if (Gem != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Gem);
            Greenfoot.stop();           
        }
    }
}   
