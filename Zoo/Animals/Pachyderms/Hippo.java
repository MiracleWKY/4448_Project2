package Zoo.Animals.Pachyderms;
import Zoo.Animals.Pachyderm;

public class Hippo extends Pachyderm
{
    public Hippo(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
}
