package Zoo.Animals.Canines;
import Zoo.Animals.Canine;
import java.util.Random; 

public class Dog extends Canine
{
    public Dog(String name) 
    { 
        super(name);
    } 
    public void makeNoise()
    {
        System.out.println(this.name+" is making noise");
    }
    public void exercise()
    {
    	Random rand = new Random(); 
    	double rand_num = rand.nextDouble();
    	if(rand_num < 0.25)
    		System.out.println(this.name+" the dog is digging");
    	else
    		System.out.println(this.name+" the dog is lifting weight");
    }
}
