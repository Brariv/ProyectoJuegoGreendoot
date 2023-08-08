import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Star()
    {
        GreenfootImage Estrella = getImage();
        int myNewHeight = (int)Estrella.getHeight () /6;
        int myNewWidth = (int)Estrella.getWidth () /6;
        Estrella.scale (myNewWidth,myNewHeight);
    }
}
