import java.util.LinkedList;
import java.util.*;

public class StackWrapper<DT> { 
	
	LinkedList<DT> L;
	StackWrapper() {
		L = new LinkedList();
	}
	
	public void push(DT elem) {
		try {
			L.addLast(elem);
		}
		catch(NoSuchElementException e) {
			System.err.println("Error: Cannot add null to Stack");
		}
	}
	
	public DT pop() {
		try{ 
			return L.removeLast();
		}
		catch(NoSuchElementException e) {
			System.err.println("Error: Cannot remove null from Stack");
			return null;
		}
	}
	
	public DT peek() {
		return L.peekLast();
	}
	
	public boolean isEmpty() {
		if(L.peekFirst() == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String bString = "[";
		for(int i = 0; i < L.size(); i++) {
			bString += L.get(i);
		}
		bString += " ]";
		return bString;
	}
  
}
