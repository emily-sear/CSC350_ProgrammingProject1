public class PCB_v1 
{
	int parent;
	int indexOfSelf;
	int size = 0;
	PCB_v1[] children;
	
	public PCB_v1(int parent, int indexOfSelf)
	{
		this.parent = parent;
		this.indexOfSelf = indexOfSelf;
		this.children = new PCB_v1[size];
	}
	
	public int getParent()
	{
		return this.parent;
	}
	
	public PCB_v1[] getChildren()
	{
		return this.children;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public int indexOfSelf()
	{
		return this.indexOfSelf;
	}
	
	public void setChildren(PCB_v1[] newArray)
	{
		this.children = newArray;
	}
	
	public void setSize(int newSize)
	{
		this.size = newSize;
	}
	
	public void create()
	{
		this.size++;
		PCB_v1[] newChildren = new PCB_v1[this.size];
		for(int i = 0; i < this.children.length; i++)
		{
			newChildren[i] = this.children[i];
		}
		this.children = newChildren;
		PCB_v1 childToAdd = new PCB_v1(this.indexOfSelf, this.size);
		this.children[this.size - 1] = childToAdd;
		
	}
	
	public void destroy()
	{
		for(int i = 0; i < this.size; i++)
		{
			if(this.children[i].getSize() != 0)
			{
				this.children[i].setChildren(new PCB_v1[0]);
				this.children[i].setSize(0);
			}
		}
		this.children = new PCB_v1[0];
		this.size = 0;
		this.parent = 0;
		this.indexOfSelf = 0;
	}
	
	
}
