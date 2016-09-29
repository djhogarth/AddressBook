
public class BuddyInfo {
	
	 	private String Name ;
		private int number ;
		private String address ;
		
		public BuddyInfo(){
			Name = "James";
			
		}
		
		
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo();
		System.out.println("Hello " + buddy.getName());
		
		
		}
	public void setName(String name) {
		this.Name = "James";
	}
	public String getName() {
		return Name;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
