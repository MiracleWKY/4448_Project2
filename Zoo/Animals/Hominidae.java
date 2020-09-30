package Zoo.Animals;
import Zoo.Animal;


public class Hominidae extends Animal
{
    public Hominidae(String name) 
    { 
        super(name);
    }
    public void roam()
    {
        System.out.println(this.name+" is roaming, Awwwwwww!");
    }
}