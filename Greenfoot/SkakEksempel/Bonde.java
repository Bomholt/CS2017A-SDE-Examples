import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bonde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bonde extends Brik
{
    public Bonde(String farven)
    {
        super.farve=farven;
        if(super.farve=="HVID")
        {
            this.setImage("baby1.png");
        }
        else
        {
            this.setImage("baby2.png");
        }
    }
    
    /**
     * Act - do whatever the Bonde wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
