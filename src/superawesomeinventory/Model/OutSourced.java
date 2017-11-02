package superawesomeinventory.Model;

public class OutSourced extends Part{
    //add another instance field, unique to this class for companyName
    //private so only accessible through getters and setters
    private String companyName;

    //getter and setter for the added companyName
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }  
}
