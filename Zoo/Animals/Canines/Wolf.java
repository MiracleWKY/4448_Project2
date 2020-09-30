package Zoo.Animals.Canines;
import Zoo.Animals.Canine;

public class Wolf extends Canine
{
    public Wolf(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}
