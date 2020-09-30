package Zoo.Animals;
import Zoo.Animal;


public class Pachyderm extends Animal
{
    public Pachyderm(String name) 
    { 
        super(name);
    } 
    public void roam()
    {
        System.out.println(this.name+" is roaming");
    }
}
