package Zoo;
import Zoo.Animal;
import Zoo.Animals.Pachyderm;
import Zoo.Animals.Pachyderms.Elephant;
import Zoo.Animals.Pachyderms.Hippo;
import Zoo.Animals.Pachyderms.Rhino;

import Zoo.Animals.Feline;
import Zoo.Animals.Felines.Cat;
import Zoo.Animals.Felines.Tiger;
import Zoo.Animals.Felines.Lion;

import Zoo.Animals.Canine;
import Zoo.Animals.Canines.Dog;
import Zoo.Animals.Canines.Wolf;

import Zoo.Animals.Hominidae;
import Zoo.Animals.Hominidaes.Chimpanzee;
import Zoo.Animals.Hominidaes.Gorilla;

import Zoo.ZooEmployee;
import Zoo.ZooEmployees.Zookeeper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random; 
//-----------
import Zoo.Strategy;
import Zoo.Dance;
import Zoo.Observer.Observer;
import Zoo.Observer.Observer_Zoo;
import Zoo.ZooEmployees.ZooFoodServer;

public class ZooClock
{
	public Zookeeper zk;
	public ZooFoodServer zf;
	public int time = 0;
	public ZooClock(Zookeeper zk, ZooFoodServer zf)
	{
		this.zk = zk;
		this.zf = zf;
	}
	public int update_time()
	{
		time = time+1;
		System.out.printf("Clock: Current time: %d\n", time);
		if(time == 8)
		{
			System.out.printf("Clock: it is 8am, the Zoo is open\n");
			System.out.printf("Zookeeper %s is arriving at zoo\n", zk.get_name());
			zf.clean();
		}
		else if(time == 9)
		{
			zk.wake();
		}
		else if(time == 10)
		{
			zk.rollcall();
		}
		else if(time == 12)
		{
			zf.make_food();
			zf.serve_food();
			zk.feed();
		}
		else if(time == 16)
		{
			zk.exercise();
		}
		else if(time == 17)
		{
			zf.clean();
			zf.make_food();
			zf.serve_food();
		}
		else if(time == 20)
		{
			zk.sleep();
			System.out.printf("Clock: it is 8pm, the Zoo is closing\n");
			zf.clean();
		}
		time = time%24;
		return time;
	}
	public void Proceed_Day()
	{
		for(int i = 0; i < 24; i++)
		{
			this.update_time();
		}
	}
}