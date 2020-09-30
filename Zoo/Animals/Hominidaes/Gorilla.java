package Zoo.Animals.Hominidaes;
import Zoo.Animals.Hominidae;

public class Gorilla extends Hominidae
{
    public Gorilla(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise, duang duang duang!");
    }
}
