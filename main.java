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
import Zoo.ZooClock;
import Zoo.ZooEmployees.ZooFoodServer;



public class main
{
    public static void main(String[] args)
    {
    	List<Animal> Animal_list = new ArrayList<Animal>();

    	Elephant a1 = new Elephant("Elle");
    	Animal_list.add(a1);

    	Elephant a2 = new Elephant("Elliot");
    	Animal_list.add(a2);

    	Hippo a3 = new Hippo("Halcyon");
    	Animal_list.add(a3);

    	Hippo a4 = new Hippo("Happy");
    	Animal_list.add(a4);

    	Rhino a5 = new Rhino("Ron");
    	Animal_list.add(a5);

    	Rhino a6 = new Rhino("Rachel");
    	Animal_list.add(a6);

    	Cat a7 = new Cat("Celab");
    	Animal_list.add(a7);

    	Cat a8 = new Cat("Chris");
    	Animal_list.add(a8);

    	Lion a9 = new Lion("Luna");
    	Animal_list.add(a9);

    	Lion a10 = new Lion("Leslie");
    	Animal_list.add(a10);

    	Tiger a11 = new Tiger("Tom");
    	Animal_list.add(a11);

    	Tiger a12 = new Tiger("Tilt");
    	Animal_list.add(a12);

    	Wolf a13 = new Wolf("Walter");
    	Animal_list.add(a13);

    	Wolf a14 = new Wolf("William");
    	Animal_list.add(a14);

    	Dog a15 = new Dog("Duang");
    	Animal_list.add(a15);

    	Dog a16 = new Dog("Don");
    	Animal_list.add(a16);

    	Gorilla a17 = new Gorilla("Gavin");
    	Animal_list.add(a17);

    	Gorilla a18 = new Gorilla("Gabriel");
    	Animal_list.add(a18);

    	Chimpanzee a19 = new Chimpanzee("Champ");
    	Animal_list.add(a19);

    	Chimpanzee a20 = new Chimpanzee("Cocacola");
    	Animal_list.add(a20);

    	int num = 0;

    	while(true)
    	{
    		Scanner myObj = new Scanner(System.in);
	    	System.out.println("Enter integer # of days: (follow by enter when done)");
	    	String num_s = myObj.nextLine();
	    	try
	    	{
	    		num = Integer.parseInt(num_s);
	    		break;
	    	}
	    	catch(Exception e)
	   		{
	   			System.out.println("Invalid input;");
	   		}
    	}
    	

    	
    	//System.out.println(Animal_list);
    	Zookeeper z = new Zookeeper("Tom", Animal_list);
        Observer_Zoo oz = new Observer_Zoo(z);
        z.add_observer(oz);
        ZooFoodServer zf = new ZooFoodServer("Jerry", Animal_list);
        zf.add_observer(oz);
        ZooClock zc = new ZooClock(z, zf);
    	for(int i = 0; i < num; i++)
    	{
    		System.out.printf("\nDay %d\n", i+1);
    		zc.Proceed_Day();
    	}

        Cat aa = new Cat("aa", new Dance());
        aa.act.action();
        //Observer_Zoo oz = new Observer_Zoo(z);
        //z.add_observer(oz);

    }
}