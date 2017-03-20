import java.util.LinkedList;

public class QueueWrapper <DT>{
LinkedList<DT> L = new LinkedList();
	QueueWrapper()
	 {
	 	
	 }

	void insert(DT elem)
	{
		//try{
		L.addFirst(elem);
		//}
		//throw(No)
	}
	DT remove()
	{
		return L.getFirst();
	}
	DT peek()
	{
		return L.peekFirst();
	}
	boolean isEmpty()
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
		String aString = "";
		for(i=0;i<L.size();i++)
		{
			aString +=L.get(i);
		}
		return aString;
	}
}
