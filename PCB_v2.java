public class PCB_v2
{
	private int parent;
	private int first_child;
	private int younger_sibling;
	private int older_sibling;
	
	public PCB_v2(int parent, int first_child, int younger_sibling, int older_sibling)
	{
		this.parent = parent;
		this.first_child = first_child;
		this.younger_sibling = younger_sibling;
		this.older_sibling = older_sibling;
	}

	public int getParent() 
	{
		return parent;
	}

	public int getFirst_child()
	{
		return first_child;
	}

	public int getYounger_sibling()
	{
		return younger_sibling;
	}

	public int getOlder_sibling()
	{
		return older_sibling;
	}
	
	public void display()
	{
		System.out.println("Parent: " + this.parent + " First Child: " + this.first_child + " Younger Sibling: " + this.younger_sibling + " Older Sibling: " + this.older_sibling);
	}
	
	public void destroy()
	{
		this.parent = -1; 
		this.first_child = -1;
		this.younger_sibling = -1;
		this.older_sibling = -1;
	}
	
}
