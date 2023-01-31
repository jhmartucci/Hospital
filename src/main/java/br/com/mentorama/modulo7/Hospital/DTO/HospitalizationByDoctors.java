package br.com.mentorama.modulo7.Hospital.DTO;

import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;

import java.util.List;

public class HospitalizationByDoctors {
    private Doctor doctor;
    private List<HospitalizationHistory> hospitalizationHistories;

    public HospitalizationByDoctors() {
    }

    public HospitalizationByDoctors(Doctor doctor, List<HospitalizationHistory> hospitalizationHistories) {
        this.doctor = doctor;
        this.hospitalizationHistories = hospitalizationHistories;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<HospitalizationHistory> getHospitalizationHistories() {
        return hospitalizationHistories;
    }

    public void setHospitalizationHistories(List<HospitalizationHistory> hospitalizationHistories) {
        this.hospitalizationHistories = hospitalizationHistories;
    }
}
