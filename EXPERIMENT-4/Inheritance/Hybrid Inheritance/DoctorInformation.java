class Person {
    String name;
    int age;

    void setDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
interface Specialization {
    void setSpecialization(String spec);
    void showSpecialization();
}
class Doctor extends Person implements Specialization {
    String specialization;

    public void setSpecialization(String spec) {
        this.specialization = spec;
    }

    public void showSpecialization() {
        System.out.println("Specialization: " + specialization);
    }

    void showDoctorInfo() {
        showDetails();
        showSpecialization();
    }
}
public class DoctorInformation {
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.setDetails("Dr. Neha", 38);
        doc.setSpecialization("Dermatologist");

        System.out.println("=== Doctor Information ===");
        doc.showDoctorInfo();
    }
}
