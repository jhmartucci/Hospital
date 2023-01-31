package br.com.mentorama.modulo7.Hospital.DTO;

import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;
import br.com.mentorama.modulo7.Hospital.Entities.Patient;

import java.util.List;

public class HospitalizationByPatients {
    private Patient patient;
    private List<HospitalizationHistory> hospitalizationHistories;

    public HospitalizationByPatients() {
    }

    public HospitalizationByPatients(Patient patient, List<HospitalizationHistory> hospitalizationHistories) {
        this.patient = patient;
        this.hospitalizationHistories = hospitalizationHistories;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<HospitalizationHistory> getHospitalizationHistories() {
        return hospitalizationHistories;
    }

    public void setHospitalizationHistories(List<HospitalizationHistory> hospitalizationHistories) {
        this.hospitalizationHistories = hospitalizationHistories;
    }
}
