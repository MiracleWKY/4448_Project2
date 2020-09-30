package Zoo.Animals.Felines;
import Zoo.Animals.Feline;

public class Lion extends Feline
{
    public Lion(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}
