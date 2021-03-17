
public class DirectoryEntry extends KWArrayList{

	private String name = null;
	private String pNum = null;
	
	public DirectoryEntry() {
		name = "";
		pNum = "";		
	}
		
	public DirectoryEntry(String name, String pNum) {
		this.name = name;
		this.pNum = pNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String getName() {
		return name;
	}

	public void setNumber(String pNum) {
		this.pNum = pNum;
	}
	
	public String getNumber() {
		return pNum;
	}
}
