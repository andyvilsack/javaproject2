import java.util.LinkedList;

public class QueueWrapper <DT>{

	QueueWrapper()
	 {
	 	LinkedList<DT> L = new LinkedList();
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
		if(L.peekFirst == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	String toString()
	{
		int i=0;
		String aString = "";
		for(i=0;i<L.size();i++)
		{
			aString =+L.get(i);
		}
		return aString;
	}
}
