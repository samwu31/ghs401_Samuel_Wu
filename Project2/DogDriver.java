
public class DogDriver
{
    public static void main(){
        Dog d1 = new Dog();
        Dog d2 = new Dog("Wesley", "Chiba", 440);        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d2.getFat());
    }
}
