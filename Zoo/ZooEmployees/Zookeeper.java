package Zoo.ZooEmployees;
import java.util.ArrayList;
import java.util.List;
import Zoo.ZooEmployee;

import Zoo.Animal;
import Zoo.Observer.Observer;
import Zoo.Observer.Observer_Zoo;




public class Zookeeper extends ZooEmployee
{
	private List<Observer> observers = new ArrayList<Observer>();

	public Zookeeper(String myName, List<Animal> mylist)
	{
		super(myName, mylist);
	}
	public void wake()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "wake");
		}
		
		for(int i = 0; i < this.Animal_list.size(); i++)
		{
			Animal j = this.Animal_list.get(i);
			System.out.println("---------------------------------------");
			System.out.println(this.name + " is waking " + j.get_name());
			j.wake();
		}
	}
	public void rollcall()
	{

		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "rollcall");
		}
		for(int i = 0; i < this.Animal_list.size(); i++)
		{
			Animal j = this.Animal_list.get(i);
			System.out.println("---------------------------------------");
			System.out.println(this.name + " is calling " + j.get_name());
			j.makeNoise();
		}
	}
	public void feed()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "feed");
		}
		for(int i = 0; i < this.Animal_list.size(); i++)
		{
			Animal j = this.Animal_list.get(i);
			System.out.println("---------------------------------------");
			System.out.println(this.name + " is feeding " + j.get_name());
			j.eat();
		}
	}
	public void exercise()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "exercise");
		}
		for(int i = 0; i < this.Animal_list.size(); i++)
		{
			Animal j = this.Animal_list.get(i);
			System.out.println("---------------------------------------");
			System.out.println(this.name + " is forcing " + j.get_name() + " to exercise");
			j.exercise();
		}
	}
	public void sleep()
	{
		for(int i = 0; i < this.observers.size(); i++)
		{
			observers.get(i).announce(this.name, "sleep");
		}
		for(int i = 0; i < this.Animal_list.size(); i++)
		{
			Animal j = this.Animal_list.get(i);
			System.out.println("---------------------------------------");
			System.out.println(this.name + " is injecting opium to " + j.get_name());
			j.sleep();
		}
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