package Zoo.Animals.Pachyderms;
import Zoo.Animals.Pachyderm;

public class Elephant extends Pachyderm
{
    public Elephant(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}
