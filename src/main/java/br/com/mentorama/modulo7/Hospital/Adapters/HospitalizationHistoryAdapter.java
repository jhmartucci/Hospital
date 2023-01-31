package br.com.mentorama.modulo7.Hospital.Adapters;

import br.com.mentorama.modulo7.Hospital.DTO.HospitalizationByDoctors;
import br.com.mentorama.modulo7.Hospital.DTO.HospitalizationByPatients;
import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;
import br.com.mentorama.modulo7.Hospital.Entities.Patient;

import java.util.List;
import java.util.stream.Collectors;

public class HospitalizationHistoryAdapter {
    public List<HospitalizationByPatients> adapterHospitalizationByPatient(List<Patient> patients,
                                           List<HospitalizationHistory> hospitalizationHistories){
        List<HospitalizationByPatients> hospitalizationyByPatients = patients.stream()
                .map(patient -> {
                    List<HospitalizationHistory> histories = hospitalizationHistories.stream()
                            .filter(h-> h.getPatient().getId().equals(patient.getId())).collect(Collectors.toList());
                    return new HospitalizationByPatients(patient, histories);
                }).collect(Collectors.toList());
        return hospitalizationyByPatients;
    }

    public List<HospitalizationByDoctors> adapterHopitalizationByDoctor(List<Doctor> doctors,
                                     List<HospitalizationHistory> hospitalizationHistories){
        List<HospitalizationByDoctors> hospitalizationByDoctors = doctors.stream()
                .map(doctor -> {
                    List<HospitalizationHistory> histories = hospitalizationHistories.stream()
                            .filter(h -> h.getPatient().getId().equals(doctor.getDoctorId()))
                            .collect(Collectors.toList());
                    return new HospitalizationByDoctors(doctor, histories);
                }).collect(Collectors.toList());
        return hospitalizationByDoctors;
    }
}
