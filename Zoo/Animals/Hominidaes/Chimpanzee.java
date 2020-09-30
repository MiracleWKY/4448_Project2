package Zoo.Animals.Hominidaes;
import Zoo.Animals.Hominidae;

public class Chimpanzee extends Hominidae
{
    public Chimpanzee(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise, bobobobobo!");
    }
}
