import java.util.Calendar;

/**
 * @author crkimberley on 27/10/2016.
 */
public class Patient {
    private String name;
    private int yearOfBirth;
    private Patient nextPatient;
    private Patient head;

    public Patient(String name, int yearOfBirth) {
        this.name = name;
        this.nextPatient = null;
        int age = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth;
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("Patient age should be between 0 & 130");
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public Patient() {
        this.head = this;
        nextPatient = null;
    }

    public void add(String name, int yearOfBirth) {
        Patient temp = head;
        while (temp.nextPatient != null) {
            temp = temp.nextPatient;
        }
        temp.nextPatient = new Patient(name, yearOfBirth);
    }

    public void printList() {
        Patient temp = this.nextPatient;
        while (temp != null) {
            System.out.println(temp.name + " • " + temp.yearOfBirth);
            temp = temp.nextPatient;
        }
    }
}
