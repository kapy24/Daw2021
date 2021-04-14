package Animal;

public class cocodrilo implements Animal{

	private int position = 0;
	private String name;
	private int count = 1;
	
	
	public cocodrilo(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void advance()
	{
		if (count < 3)
		{
			position += 3;
		}
		else
		{
			position -= 3;
			count = 0;
		}
		count++;
	}
	
	public int getPosition()
	{
		return position;
	}
	
}
