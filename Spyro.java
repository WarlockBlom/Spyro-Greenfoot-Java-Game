import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Spyro here.
 * 
 * @author (Courtney McGuinness) 
 * @version (a 2.0 or a 14/04/22)
 */
public class Spyro extends Actor
{
    public static boolean noFire = true;
    public static int GemCollected = 0;
    public static Counter score = new Counter();
    public Counter counter2 = new Counter();
    /**
     * Act - do whatever the Spyro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        score.target = GemCollected;
        getWorld().addObject(score,286, 36);
        moveAndTurn();
        Collect();// Add your action code here.
    }
 public void moveAndTurn()
    {
      move(4);
      if (Greenfoot.getRandomNumber(120) < 5)
      {
          addGem();
      }
      if (Greenfoot.isKeyDown("left"))
      {
          turn(-6);
      }
      if (Greenfoot.isKeyDown("right"))
      {
          turn(6);
      }
      if (Greenfoot.isKeyDown("up"))
      {
          turn(90);
      }
      if (Greenfoot.isKeyDown("space") && noFire)
      {
          int angle = getRotation();
          Fire(angle+90);
      }
    }
    
    public void addGem()
    {
        Actor Gem = new Gem();
        World world;
        world = getWorld();
        world.addObject(Gem, 
           Greenfoot.getRandomNumber(getWorld().getWidth()), 
           Greenfoot.getRandomNumber(getWorld().getHeight()));
    }
    
    public void Fire(int angle)
    {
        Actor Fire = new Fire((angle-90));
        World world;
        world = getWorld();
        world.addObject(Fire,getX(),getY());
        noFire = false;
    }
    
    public void Collect()
    {
        Actor Gem;
        Gem = getOneObjectAtOffset(0, 0, Gem.class);
        if (Gem != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Gem);
            Greenfoot.playSound("Gem sound.wav");
            GemCollected++;
            counter2.target++;
        }
    }
}
