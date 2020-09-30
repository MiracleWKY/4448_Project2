package Zoo.Animals.Pachyderms;
import Zoo.Animals.Pachyderm;

public class Rhino extends Pachyderm
{
    public Rhino(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}