package Zoo.Observer;
import Zoo.Observer.Observer;
import Zoo.ZooEmployee;
import Zoo.ZooEmployees.Zookeeper;

public class Observer_Zoo implements Observer
{
	public ZooEmployee ze;
	public Observer_Zoo(ZooEmployee ze)
	{
		this.ze = ze;
	}
	public void announce(String name, String s)
	{
		System.out.printf("Hi, this is the Zoo Announcer. %s is about to %s the animals!\n", name, s);
	}
}