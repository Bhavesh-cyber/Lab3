import java.util.ArrayList;

public class AddressBook {
    /**
     * Attribute creating empty array list
     */
    private ArrayList<BuddyInfo> book = new ArrayList<BuddyInfo>();

    /**
     * adds to the array list
     * @param name is the object to add
     */
    public void addBuddy(BuddyInfo name){
        book.add(name);
    }

    /**
     * removes Object from array list
     * @param name is the object to remove
     */
    public void removeBuddy(BuddyInfo name){
        book.remove(name);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
