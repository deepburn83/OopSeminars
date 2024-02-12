package seminar.main.clinic.core;

import seminar.main.Goable;
import seminar.main.clients.Animal;
import seminar.main.clinic.core.personal.Personal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Personal> personal;
    private List<Animal> patients;

    public VeterinaryClinic() {
        this.personal = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public List<Animal> getPatients() {
        return patients;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void addEmployee(Personal employee) {
        personal.add(employee);
    }

    public void addPatient(Animal patient) {
        patients.add(patient);
    }

    public List<Animal> getGoables() {
        List<Animal> result = new ArrayList<>();
        for (Animal a : patients) {
            if (a instanceof Goable) result.add(a);
        }
        return result;
    }
}
