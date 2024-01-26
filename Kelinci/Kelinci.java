import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kelinci here.
 * 

 */

 
public class Kelinci extends Actor
{
    /**
     * Act - do whatever the Kelinci wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int JumlahWortelDimakan = 0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("w")){
            setImage("kelinci-up.png");
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("s")){
            setImage("kelinci-down.png");
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("a")){
            setImage("kelinci-left.png");
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setImage("Kelinci.png");
            setLocation(getX()+2,getY());
        }
        MakanWortel();
        cekScore();
        getWorld().showText("Score: "+JumlahWortelDimakan,100,50);
    }    
    public void MakanWortel(){
        Actor getWortel =getOneIntersectingObject(Wortel.class);
        if(getWortel != null){
            getWorld().removeObject(getWortel);
            Greenfoot.playSound("Slurp1.wav");
            JumlahWortelDimakan++;
        }
       }
       
    public void cekScore(){
        if(JumlahWortelDimakan >19){
            Finish alret_finish = new Finish();
            Greenfoot.playSound("Victory_Fanfare.mp3");
            getWorld().addObject(alret_finish,400,300);
    }
    }
 }