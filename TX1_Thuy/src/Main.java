
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of patients: ");
        int n = scan.nextInt();
        Patient[] patients = new Patient[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Patient # " + (i + 1) + ": ");
            patients[i] = new Patient();
            patients[i].inputData();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------");
            System.out.println("Patient # " + (i + 1) + ": ");
            System.out.println(patients[i].toString());
        }
        System.out.println("Chọn: " +
                "\n1. Kiem tra benh nhan" +
                "\n2. Them 1 benh nhan vao danh sach" +
                "\n3. Xoa 1 benh nhan khoi danh sach" +
                "\n4: Sửa bệnh nhân");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                //kiem tra ma benh nhan
                String x = "Ha Nam";
                boolean t = false;
                for (int i = 0; i < n; i++) {
                    if (patients[i].getPatient_code().equals(x)) {
                        System.out.println(patients[i].toString());
                        t = true;
                        break;
                    }
                    if (!t)
                        System.out.println("Khong o Ha Nam ");
                    break;
                }
                break;
            case 2:
                //them 1 benh nhan
                Patient patient = new Patient();
                System.out.println("Nhap thong tin benh nhan mơi de them: ");
                patient.inputData();
                System.out.println("danh sach benh nhan sau khi them la: ");
                for (int i = 0; i < n; i++) {
                    System.out.println(patients[i].toString());
                }
                System.out.println(patient.toString());
                break;
            //xoa 1 benh nhan
            case 3:
                Patient patientMin= patients[0];
                for(int i = 0; i < n; i++){
                    if(patients[i].getPatient_history()<patients[0].getPatient_history()){
                        patientMin = patients[i];
                    }
                }
                boolean check = false;
                int c = 0;
                for (int i = 0; i < n; i++) {
                    if (patients[i]==patientMin) {
                        c = i;
                        check = true;
                        break;
                    }
                }
                if (check) {
                    Patient[] newPatients = new Patient[n - 1];
                    for (int i = 0; i < n; i++)
                        for (int j = 0; j < n; j++) {
                                newPatients[j++] = patients[i];
                        }
                    patients = newPatients;
                    n--;
                    System.out.println("Danh sach sau xoa la: ");
                    for (int i = 0; i < n; i++) {
                        System.out.println(patients[i].toString());
                    }
                }
                break;
            case 4:
                //sửa bệnh nhân
                System.out.println("Nhap ma benh nhan can sua: ");
                String z = scan.next();
                String v, m, k, l;
                boolean test = false;
                for (int i = 0; i < n; i++) {
                    if (patients[i].getPatient_code().equals(z)) {
                        test = true;
                        break;
                    }
                }
                if (test) {
                    for (int i = 0; i < n; i++) {
                        if (patients[i].getPatient_code().equals(z)) {
                            System.out.println("Sua patient_code: ");

                            System.out.println("Sua full name:");
                            patients[i].setPatient_fullname(m = scan.next());
                            System.out.println("Sua age:");
                            patients[i].setPatient_age(k = scan.next());
                            System.out.println("Sua diagnosis:");
                            patients[i].setPatient_diagnosis(l = scan.next());
                        }
                    }
                    for (int j = 0; j < n; j++) {
                        System.out.println(patients[j].toString());
                    }
                } else System.out.println("Benh nhan khong ton tai!");
                break;

        }
        }




    }