package Zoo.Animals.Felines;
import Zoo.Animals.Feline;

public class Tiger extends Feline
{
    public Tiger(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}
