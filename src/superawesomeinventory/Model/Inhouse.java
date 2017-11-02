package superawesomeinventory.Model;

public class Inhouse extends Part{
    //add another instance field, unique to this class, for machineID
    //private so only accessible through getters and setters
    private int machineID;

    //getter and setter for the added machineID
    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
}
