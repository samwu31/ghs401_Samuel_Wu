public class Dog{
    private String name;
    private String breed;
    private int weight;
    
    public Dog(){
        name = null;
        breed = null;
        weight = 0;
    }
    
    public Dog(String name, String breed, int weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    
    public int getFat(){
        return this.weight;
    }
    public String toString(){
        return "This dog's name is " + this.name + ", a " + this.breed + " and it weighs " + this.weight + " pounds.";
    }
}