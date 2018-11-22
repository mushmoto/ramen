import greenfoot.*;

/**
 * Write a description of class Masatoshi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Masatoshi extends Actor
{
    /**
     * Act - do whatever the Masatoshi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
<<<<<<< HEAD
        if(Greenfoot.isKeyDown("right")){
            setRotation(0);
=======
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
>>>>>>> 0eb883a229b3c4e6423ba3881c7ffc4ef6a94f61
            move(2);
        }
    }    
}
