package Zoo.Animals;
import Zoo.Animal;


public class Feline extends Animal
{
    public Feline(String name) 
    { 
        super(name);
    } 
    public void roam()
    {
        System.out.println(this.name+" is roaming, meoooooooooow!");
    }
}