
/**
 * Write a description of class Panda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Panda
{
    // instance variables - replace the example below with your own
    private String country;
    private double weight;

    
    public Panda()
    {
        this.country = null;
        this.weight = 0;
    }
    public Panda(String joe, double darn){
        this.country = joe;
        this.weight = darn;
    }
    public void changeFat(double weight){
        this.weight = weight;        
    }
    public void migration(String stringy){
        this.country = stringy;
    }
    public String getCountry(){return this.country;}
    public double getWeight(){return this.weight;}
    public String toString(){
        return "This panda is from " + this.country + " and it weighs " +  this.weight + " pounds.";
    }
}
