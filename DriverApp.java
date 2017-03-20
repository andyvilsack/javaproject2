class DriverApp {
	public static void main(String[] args) {
		
		StackWrapper<DT> sList = new StackWrapper<DT>();
		QueueWrapper<DT> qList = new QueueWrapper<DT>();
		
		String fileName = "data.txt";
		DataReader obj = new DataReader(fileName, sList, qList);
		
		System.out.println("THE STACK DATA STUCT:");
		System.out.println(sList);
	}
}