import java.util.LinkedList;

public class QueueWrapper <DT>{
LinkedList<DT> L = new LinkedList();
	QueueWrapper()
	 {
	 	
	 }

	public void insert(DT elem)
	{
		//try{
		L.addLast(elem);
		//}
		//throw(No)
	}
	public DT remove()
	{
		return L.removeFirst();
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
