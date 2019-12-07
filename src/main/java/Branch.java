public class Branch {

    private int Id;
    private String Name;
    private String Address;
    private String Owner;
    private Exam[] Exams;

    public Branch(int Id, String Name, String Address, String Owner){
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
        this.Owner = Owner;
    }

    public int getID() {
        return Id;
    }

    public void setID(int ID) {
        this.Id = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

}
