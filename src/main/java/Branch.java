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
        return Id; }

    public String getName() {
        return Name; }

    public String getAddress() {
        return Address; }

    public String getOwner() {
        return Owner; }
}
