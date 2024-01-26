import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kelinci2 here.
 * 

 */

 
public class Kelinci2 extends Actor
{
    /**
     * Act - do whatever the Kelinci2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int JumlahWortelDimakan = 0;
    public void act() 
    {
        if(Greenfoot.isKeyDown("i")){
            setImage("kelinci-up2.png");
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("k")){
            setImage("kelinci-down2.png");
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("j")){
            setImage("kelinci-left2.png");
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("l")){
            setImage("Kelinci2.png");
            setLocation(getX()+2,getY());
        }
        MakanWortel();
        cekScore();
        getWorld().showText("Score: "+JumlahWortelDimakan,50,100);
    }    
    public void MakanWortel(){
        Actor getWortel =getOneIntersectingObject(Wortel.class);
        if(getWortel != null){
            getWorld().removeObject(getWortel);
            Greenfoot.playSound("Slurp.wav");
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
