package zad3;

import java.time.LocalDate;
import java.util.ArrayList;

class PatientCard {
    public ArrayList<String> medicalHistory;
    public ArrayList<String> allergies;
    public ArrayList<String> medications;

    public PatientCard() {
        medicalHistory = new ArrayList<>();
        allergies = new ArrayList<>();
        medications = new ArrayList<>();
    }
}

class Patient {
    public String firstName;
    public String lastName;
    public LocalDate birthDate;
    public PatientCard patientCard;   // kompozycja – karta należy do pacjenta

    public Patient(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.patientCard = new PatientCard();   // tworzymy kartę razem z pacjentem
    }
}

class Doctor {
    public String firstName;
    public String lastName;
    public String specialization;
    public ArrayList<Patient> patients;    // agregacja – lista pacjentów

    public Doctor(String firstName, String lastName, String specialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showPatients() {
        System.out.println("Pacjenci lekarza " + firstName + " " + lastName + " (" + specialization + "):");
        for (Patient p : patients) {
            System.out.println("- " + p.firstName + " " + p.lastName + " (" + p.birthDate + ")");
        }
    }
}


public class HospitalTest {
    public static void main(String[] args) {
        Patient p1 = new Patient("Jan", "Kowalski", LocalDate.of(1990, 5, 10));
        Patient p2 = new Patient("Anna", "Nowak", LocalDate.of(1985, 3, 22));

        p1.patientCard.medicalHistory.add("Nadciśnienie");
        p1.patientCard.medications.add("Lek A");

        p2.patientCard.allergies.add("Penicylina");
        p2.patientCard.medications.add("Lek B");

        Doctor d1 = new Doctor("Piotr", "Zielinski", "Kardiolog");
        d1.addPatient(p1);
        d1.addPatient(p2);

        d1.showPatients();
    }
}
