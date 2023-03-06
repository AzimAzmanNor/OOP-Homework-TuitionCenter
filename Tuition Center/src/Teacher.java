import java.util.Date;

public class Teacher {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int experience;
    private Date startDate;

    //constructor
    public Teacher(String name, String IC, String address, String qualification, int experience, Date startDate) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.experience = experience;
        this.startDate = startDate;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIC() {
        return IC;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
