import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddy) {
        if(buddy != null) {
            buddies.add(buddy);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if(index >= 0 && index < buddies.size()) {
            buddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        AddressBook addressBook = new AddressBook();
        BuddyInfo buddyInfo = new BuddyInfo("Tom",  "Carleton", "613");
        addressBook.addBuddy(buddyInfo);
        addressBook.removeBuddy(0);
        System.out.println("Buddy Info");
        System.out.println("hi");
        System.out.println("hello");
    }
}
