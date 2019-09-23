public class GhostDriver{
    
    public static void main(){
        
        Ghost g1 = new Ghost();
        Ghost g2 = new Ghost();
        Ghost g3 = new Ghost();
        Ghost g4 = new Ghost("Blue", 55, 132);
        System.out.println(g4.toString());
        g4.bumpSpeed(8);    //increase speed by the value of parameter (speed)
        System.out.println(g4.toString());
        g4.bumpSpeed();     //increase speed by 1
        System.out.println(g4.toString());
        g4.levelUp();
        System.out.println(g4.toString());
        g4.doubleColor();
        g4.doubleColor();
        g4.doubleColor();
        g4.doubleColor();
        System.out.println(g4.toString());
    }
}