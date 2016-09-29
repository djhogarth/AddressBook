import java.util.ArrayList;
import java.util.List;
public class AddressBook 
{

	private ArrayList <BuddyInfo> BuddyList;
	
	public AddressBook()
	{
		this.BuddyList = new ArrayList <BuddyInfo>();
		
	}
	
	private void addBuddy(BuddyInfo buddy)
	{
		if(b != null)
		{
			this.BuddyList.add(buddy);
		}
		
		
	}
	
	private BuddyInfo removeBuddy(int x)
	{
		if (x >= 0 && x < this.BuddyList.size())
		{
		return this.BuddyList.remove(x);
		}
		
		return null;
	}
	
	public static void main(String [] args)
	{
		System.out.println("Address Book");
		BuddyInfo test = new BuddyInfo();
		AddressBook record = new AddressBook();
		record.addBuddy(test);
		record.removeBuddy(0);
	
	}
	}
	



