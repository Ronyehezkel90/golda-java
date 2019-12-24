import com.google.gson.annotations.SerializedName;

public class Branch {

    @SerializedName("ID")
    private int id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Address")
    private String address;
    @SerializedName("Owner")
    private String managerName;

     Branch(int Id, String Name, String Address, String managerName){
        this.id = Id;
        this.name = Name;
        this.address = Address;
        this.managerName = managerName;
    }

    String getName() {
        return name; }

}
