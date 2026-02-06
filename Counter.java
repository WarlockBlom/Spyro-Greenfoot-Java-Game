import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Graphics;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
  private static final Color textColor = new Color(250, 120, 250);
    private static final Font stringFont = new Font( "SansSerif", 20 );
    private int value = 0;
    public int target = 0;
    private String text;
    private int stringLength;

    public Counter()
    {
        text = "Gem Collected: ";
        stringLength = (text.length() + 2) * 12;
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        image.setColor(textColor);
        image.setFont(stringFont);
        updateImage();
    }
    
    public void act() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
        
    }

    public void add(int score)
    {
        target += score;
    }

    public void subtract(int score)
    {
        target -= score;
    }

    public int getValue()
    {
        return value;
    } 

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 20);
    }
}
