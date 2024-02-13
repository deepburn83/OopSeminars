package seminar.clinic.core.personal.impl;

import seminar.example001.clients.Animal;
import seminar.clinic.core.personal.Personal;

import java.util.Map;

public class Doctor extends Personal {
    private final Map<Integer, String> diagnoses = Map.of
            (0, "чума плотоядных",
             1, "панлейкопения",
             2, "ринотрахеит",
             3, "пироплазмоз ");

    // создадим несколько методов (диагноз, операция, назначить лекарства)
    private Nurse nurse;

    public Doctor(){
    }

    public Doctor(Nurse nurse) {
        this.nurse = nurse;
    }

    public void fireNurse() {
        this.nurse = null;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String doDiagnose(Animal patient) {
        int key = (int) (Math.random() * 3);
        return patient.getPatientName() + " подхватил болезнь: " + diagnoses.get(key);
    }
}
