public class Branch {

    private int id;
    private String name;
    private String address;
    private String managerId;
    private String phone;

    public Branch(int Id, String Name, String Address, String managerId){
        this.id = Id;
        this.name = Name;
        this.address = Address;
        this.managerId = managerId;
    }

    public int getID() {
        return id; }

    public String getName() {
        return name; }

    public String getAddress() {
        return address; }

    public String getManagerId() {
        return managerId; }
}
