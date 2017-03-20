import java.util.LinkedList;

public class StackWrapper<DT> { 
	
	LinkedList<DT> L;
	StackWrapper() {
		L = new LinkedList();
	}
	
	public void push(DT elem) {
		L.addLast(elem);
	}
	
	public DT pop() {
		return L.removeLast();
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
