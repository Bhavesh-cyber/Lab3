import java.util.ArrayList;

public class AddressBook {
    /**
     * Attribute creating empty array list
     */
    private ArrayList<BuddyInfo> book;

    //testing file with text
    public AddressBook(){
        book = new ArrayList<BuddyInfo>();
    }
    /**
     * adds to the array list
     *
     * @param name is the object to add
     */
    public void addBuddy(BuddyInfo name) {
        book.add(name);
    }

    /**
     * removes Object from array list
     *
     * @param name is the object to remove
     */
    public void removeBuddy(BuddyInfo name) {
        book.remove(name);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        System.out.println(buddy.getName() + " " + buddy.getAddress() + " " + buddy.getPhoneNumber());
        addressBook.removeBuddy(buddy);
    }
}
