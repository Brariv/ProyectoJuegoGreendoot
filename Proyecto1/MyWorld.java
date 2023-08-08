import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Points myPoints = new Points();
    public Hearts hearts = new Hearts();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(992, 621, 1); 
        addObject(new Player(),825,325);
        addObject(new Hearts(), 825, 50);
        addObject(myPoints, 175, 50);
        Greenfoot.playSound("fam.mp3");
        for (int i = 0; i < 3; i++){
            addObject(new Star(), getRandomNumber(110,750), getRandomNumber(110,495));
        }

        for (int i = 0; i < 6; i++){
            addObject(new Enemigo(), getRandomNumber(110,750), getRandomNumber(110,495));
        }

        prepare();
    }

    public int getRandomNumber(int start,int end){
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

    public void win()
    {
        if (Player.vScore == 3)
        {
            addObject(new Win(Player.sScore), 450, 450);
            Player.vScore = 0;
            Player.sScore = 0;
            Greenfoot.stop();
        }
    }

    public void loose()
    {
        addObject(new Loose(), 450, 675);
        Player.vScore = 0;
        Player.sScore = 0;
        Greenfoot.stop();
    }

    public void act()
    {
        win();
        myPoints.update(Player.sScore);
        if(Player.vScore == 1)
        {
            Greenfoot.setWorld(new Kick());
            Player.vScore = 0;
            Player.sScore = 0;
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}

