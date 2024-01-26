import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 

 */
public class Bg extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(85)<1){
            addObject(new Wortel(),Greenfoot.getRandomNumber(800)+0,300);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Kelinci kelinci = new Kelinci();
        addObject(kelinci,90,319);
        Kelinci2 kelinci2 = new Kelinci2();
        addObject(kelinci2,90,419);
        Wortel wortel = new Wortel();
        addObject(wortel,123,120);
        Wortel wortel2 = new Wortel();
        addObject(wortel2,235,242);
        Wortel wortel3 = new Wortel();
        addObject(wortel3,334,325);
        Wortel wortel4 = new Wortel();
        addObject(wortel4,178,422);
        Wortel wortel5 = new Wortel();
        addObject(wortel5,252,531);
        Wortel wortel6 = new Wortel();
        addObject(wortel6,428,418);
        Wortel wortel7 = new Wortel();
        addObject(wortel7,491,538);
        wortel7.setLocation(494,521);
        Wortel wortel8 = new Wortel();
        addObject(wortel8,416,122);
        Wortel wortel9 = new Wortel();
        addObject(wortel9,658,123);
        Wortel wortel10 = new Wortel();
        addObject(wortel10,549,242);
        Wortel wortel11 = new Wortel();
        addObject(wortel11,672,412);
        Wortel wortel12 = new Wortel();
        addObject(wortel12,722,238);
    }
}
