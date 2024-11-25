import java.util.Scanner;

public class Patient {
    protected String patient_code;
    protected String patient_fullname;
    protected String patient_age;
    protected double patient_history;
    protected String patient_diagnosis;

    public Patient(){}

    public Patient(String patient_code, String patient_fullname, String patient_age, double patient_history, String patient_diagnosis) {
        this.patient_code = patient_code;
        this.patient_fullname = patient_fullname;
        this.patient_age = patient_age;
        this.patient_history = patient_history;
        this.patient_diagnosis = patient_diagnosis;
    }

    public String getPatient_code() {
        return patient_code;
    }

    public void setPatient_code(String patient_code) {
        this.patient_code = patient_code;
    }

    public String getPatient_fullname() {
        return patient_fullname;
    }

    public void setPatient_fullname(String patient_fullname) {
        this.patient_fullname = patient_fullname;
    }

    public String getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(String patient_age) {
        this.patient_age = patient_age;
    }

    public double getPatient_history() {
        return patient_history;
    }

    public void setPatient_history(double patient_history) {
        this.patient_history = patient_history;
    }

    public String getPatient_diagnosis() {
        return patient_diagnosis;
    }

    public void setPatient_diagnosis(String patient_diagnosis) {
        this.patient_diagnosis = patient_diagnosis;
    }

    public void inputData(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the patient's code: ");
        patient_code=sc.nextLine();
        System.out.println("Enter the patient's fullname: ");
        patient_fullname=sc.nextLine();
        System.out.println("Enter the patient's age: ");
        patient_age=sc.nextLine();
        System.out.println("Enter the patient's diagnosis: ");
        patient_diagnosis=sc.nextLine();

    }

    @Override
    public String toString() {
        return "Patient{" +
                "patient_code='" + patient_code + '\'' +
                ", patient_fullname='" + patient_fullname + '\'' +
                ", patient_age='" + patient_age + '\'' +
                ", patient_history='" + patient_history + '\'' +
                ", patient_diagnosis='" + patient_diagnosis + '\'' +
                '}';
    }
}
