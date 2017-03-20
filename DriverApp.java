/*
John-George Sample
Andrew Vilsack
CPSC 374
Project 2
*/

class DriverApp {
	public static void main(String[] args) {
		
		StackWrapper sList = new StackWrapper();
		QueueWrapper qList = new QueueWrapper();
		
		String fileName = "data.txt";
		DataReader obj = new DataReader(fileName, sList, qList);
		
		System.out.println("THE STACK DATA STUCT:");
		System.out.println(sList);
		
		System.out.println("THE QUEUE DATA STUCT:");
		System.out.println(qList);
		
		System.out.print("TOP IS:");
		System.out.println(sList.peek());
		
		System.out.print("FIRST IS:");
		System.out.println(qList.peek());
		
		while(sList.isEmpty() != true) {
			System.out.print("ST: ");
			System.out.println(sList.pop());
		}
		
		while(qList.isEmpty() != true) {
			System.out.print("Q: ");
			System.out.println(qList.remove());
		}
	}
}