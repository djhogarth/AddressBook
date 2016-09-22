import java.util.ArrayList;
import java.util.List;
public class AddressBook 
{

	private ArrayList <BuddyInfo> BuddyList;
	
	public AddressBook()
	{
		BuddyList = new ArrayList <BuddyInfo>();
		
	}
	
	private void addBuddy(BuddyInfo b)
	{
		BuddyList.add(b);
		
	}
	
	private void removeBuddy(BuddyInfo b)
	{
		BuddyList.remove(b);
		
	}
	
	public static void main(String [] args)
	{
		System.out.println("Address Book");
		BuddyInfo test = new BuddyInfo();
		AddressBook record = new AddressBook();
		record.addBuddy(test);
		record.removeBuddy(test);
	
	}
	}
	



