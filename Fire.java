import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    public Fire(int angle)
    {
        setRotation(angle);
    }
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        World world;
        world = getWorld();
        move(12);
        
        Actor Gnorc;
        Gnorc = getOneObjectAtOffset(0, 0, Gnorc.class);
        if (Gnorc != null && Greenfoot.getRandomNumber(100) > 25)
        {
            world.removeObject(Gnorc);
            Spyro.noFire = true;
            world.removeObject(this);
        }
        else
        {if ((getX() <= 5 || getX() >= world.getWidth()-5 ) ||
            (getY() <= 5 || getY() >= world.getHeight()-5))
            {
                Spyro.noFire = true;
                world.removeObject(this);
            }
        }
    }
}


