package Zoo;
import java.util.ArrayList;
import java.util.List;
import Zoo.Animal;



public class ZooEmployee
{
	protected String name;
	public List<Animal> Animal_list = new ArrayList<Animal>();
	public ZooEmployee(String myName, List<Animal> mylist)
	{
		this.name = myName;
		this.Animal_list = mylist;
	}
	public String get_name()
	{
		return this.name;
	}
}