package seminar.main.clinic;

import seminar.main.clinic.core.VeterinaryClinic;
import seminar.main.clinic.core.patients.impl.Dog;
import seminar.main.clinic.core.personal.impl.Doctor;

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
