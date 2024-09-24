public class BuddyInfo {

    private String name;
    private String address;
    private int phoneNumber;


    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        BuddyInfo buddyInfo = new BuddyInfo("Bob","123 Parkway",613919124);
        System.out.println("Hello " + buddyInfo.getName() + " Address:" + buddyInfo.getAddress() +" Number:"+ buddyInfo.getPhoneNumber());
    }
}
