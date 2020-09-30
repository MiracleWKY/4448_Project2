package Zoo.Animals;
import Zoo.Animal;


public class Canine extends Animal
{
    public Canine(String name) 
    { 
        super(name);
    }
    public void roam()
    {
        System.out.println(this.name+" is roaming, woooooooooof!");
    }
}