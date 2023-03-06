public class Student{
    private String name;
    private String address;
    private String schoolName;
    private String IC;
    private int year;

    public Student(String name, String address, String schoolName, String IC, int year){
        this.name = name;
        this.address = address;
        this.schoolName = schoolName;
        this.IC = IC;
    }

    // Setters and Getters

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

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

}