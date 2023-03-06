import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Arieq", "030815-03-1234", "123 Jalan Jalan", "Bachelor of Computer Engineering", 5, new Date());
        Teacher teacher2 = new Teacher("Jane Doe", "123456-01-3456", "456 Oak St", "Master of Science", 10, new Date());

        Student student1 = new Student("Azim", "456 Taman Taman", "Sekolah Tuanku Abdul Rahman", "030114-08-0801", 17 );
        Student student2 = new Student("Ksyah", "69 Jalan Taman", "Sekolah Tuanku Abdul Rahman", "031102-02-0108", 17 );

        TuitionCenter center1 = new TuitionCenter("420 Sri Iskandar", "Mr. Iskandar");
        center1.addTeacher(teacher1);

        // Tuition center
        System.out.println("Tuition Center Headmaster : " + center1.getHeadmaster());
        System.out.println("Tuition Center Address : " + center1.getAddress() + "\n");

        // Teacher's profile
        System.out.println("Teacher's Name : " + teacher1.getName());
        System.out.println("IC No. : " + teacher1.getIC());
        System.out.println("Address : " + teacher1.getAddress());
        System.out.println("Qualifications : " + teacher1.getQualification());
        System.out.println("Years of Experience : " + teacher1.getExperience());
        System.out.println("Start Date : " + teacher1.getStartDate());

        // Student's profile
        System.out.println("\nStudent's Name : " + student1.getName());
        System.out.println("IC No. : " + student1.getIC());
        System.out.println("Address : " + student1.getAddress());
        System.out.println("School Name : " + student1.getSchoolName());
        System.out.println("Year : " + student1.getYear());
    }
}