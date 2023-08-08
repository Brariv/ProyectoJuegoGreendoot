import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigo extends Actor
{
    
    
    
    /**
     * Act - do whatever the Enemigo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void rotation()
    {
        setRotation(90);
    }
    public void act()
    {
        // Add your action code here.
        //Player();
        
        
        if (getY() <= 115){  
            setRotation(90);
        }
        else if (getY() >= 500){
            setRotation(270);     
        }
        
        
        move(5);
        
        
    }
    public Enemigo()
    {
        GreenfootImage naranja = getImage();
        int myNewHeight = (int)naranja.getHeight () /3;
        int myNewWidth = (int)naranja.getWidth () /3;
        naranja.scale (myNewWidth,myNewHeight);
        rotation();
    }
    
}
