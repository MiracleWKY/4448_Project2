package Zoo.Animals.Felines;
import Zoo.Animals.Feline;
import java.util.Random;
import Zoo.Strategy;
import Zoo.Dance;
public class Cat extends Feline
{
	public Strategy act;
    public Cat(String name) 
    { 
        super(name);
    } 
    public Cat(String name, Strategy ob) 
    { 
        super(name); 
        this.act = ob;
    }
    public void sleep()
    {
    	Random rand = new Random(); 
    	double rand_num = rand.nextDouble();
    	if(rand_num < 0.3)
    		this.roam();
    	else if(rand_num < 0.6)
    		this.makeNoise();
    	else
    		System.out.println(this.name+" the cat is asleep ZZZ");
    }
}
