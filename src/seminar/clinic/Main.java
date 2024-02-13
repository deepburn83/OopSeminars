package seminar.clinic;

import seminar.clinic.core.VeterinaryClinic;
import seminar.clinic.core.patients.impl.Dog;
import seminar.clinic.core.personal.impl.Doctor;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        Dog d1 = new Dog("Рекс");
        clinic.addPatient(d1);
        Doctor doctor = new Doctor();
        clinic.addEmployee(doctor);
        System.out.println(doctor.doDiagnose(d1));
    }
}
