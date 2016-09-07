package filterPattern;

/**
 * This class created on 2016/7/27.
 *
 * @author Osborn
 * @since Advanced FineBI Analysis 1.0
 */
public class Person {
    private String name;
    private String gender;
    private boolean maritalStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Person(String name, String gender, boolean maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus =  maritalStatus;
    }

    public String toString() {
        return "Person : [ Name : " + this.getName()
                +", Gender : " + this.getGender()
                +", Marital Status : " + this.isMaritalStatus()
                +" ]";
    }
    public void print() {
        System.out.println(this.toString());
    }
}
