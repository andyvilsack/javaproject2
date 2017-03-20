import java.util.LinkedList;
import java.util.*;

public class QueueWrapper<DT>{

	LinkedList<DT> L;
	QueueWrapper()
	 {
	 	L = new LinkedList();
	 }

	public void insert(DT elem)
	{
		try
		{
		L.addLast(elem);
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Error: Cannot add null to Queue");
		}
	}
	public DT remove()
	{
		try
		{
		return L.removeFirst();
		}
		catch(NoSuchElementException e)
		{
			System.err.println("Error: Cannot remove null from Queue");
			return null;
		}
	}
	public DT peek()
	{
		return L.peekFirst();
	}
	public boolean isEmpty()
	{
		if(L.peekFirst() == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		int i=0;
		String aString = "[";
		for(i=0;i<L.size();i++)
		{
			aString +=L.get(i);
		}
		aString += " ]";
		return aString;
	}
}
