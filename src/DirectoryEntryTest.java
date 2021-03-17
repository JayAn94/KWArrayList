
public class DirectoryEntryTest {
	
	public static <E> void main(String Args[]) {
	

		DirectoryEntry de = new DirectoryEntry();
		
		de.add("John Smith", "555-549-1234");
		de.add("Mary Jane", "111-123-4567");
		de.add("Adam Smith", "222-123-4567");
		de.add("Betty James", "333-345-4567");
		de.add("Cathy Williams", "567-234-1201");
		de.add("Peter Robinson", "444-678-1234");	
		
		System.out.println(de.get(0));
		System.out.println(de.indexOf("John Smith"));
		System.out.println(de.indexOf("Adam Smith"));
		
	}
}