/**
 * @author crkimberley on 27/10/2016.
 */
public class PatientScript {
    public static void main(String[] args) {
        new PatientScript().launch();
    }

    private void launch() {
        Patient hospital = new Patient();
        hospital.add("Bert", 1921);
        hospital.add("Cynthia", 1937);
        hospital.printList();
        hospital.add("Albert", 1851);
    }
}
