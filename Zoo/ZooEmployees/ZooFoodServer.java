package Zoo.ZooEmployees;
import java.util.ArrayList;
import java.util.List;
import Zoo.ZooEmployee;

import Zoo.Animal;
import Zoo.Observer.Observer;
import Zoo.Observer.Observer_Zoo;




public class ZooFoodServer extends ZooEmployee
{
	private List<Observer> observers = new ArrayList<Observer>();

	public ZooFoodServer(String myName, List<Animal> mylist)
	{
		super(myName, mylist);
	}
	
	public void make_food()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "making food for");
		}
		System.out.println("ZooFoodServer is making food.");
	}
	public void serve_food()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "serving food to");
		}
		System.out.println("ZooFoodServer is serving food.");
	}
	public void clean()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			//observers.get(i).announce(this.name, "cleaning the zoo for");
		}
		System.out.println("ZooFoodServer is cleaning.");
	}
	public void add_observer(Observer observer)
    {
        observers.add(observer);
    }

    public void del_observer(Observer observer)
    {
        observers.remove(observer);
    }
}