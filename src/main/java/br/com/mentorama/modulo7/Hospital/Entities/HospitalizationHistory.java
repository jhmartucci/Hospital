package br.com.mentorama.modulo7.Hospital.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hospitalization_history")
public class HospitalizationHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;
    private String dateEntry;
    private String dateExit;
    private String description;
    @ManyToMany
    @JoinColumn(name = "doctors")
    private List<Doctor> responseDoctor = new ArrayList<>();

    public HospitalizationHistory() {
    }

    public HospitalizationHistory(Long id, Patient patient, String dateEntry, String dateExit, String description,
                                  List<Doctor> responseDoctor) {
        this.id = id;
        this.patient = patient;
        this.dateEntry = dateEntry;
        this.dateExit = dateExit;
        this.description = description;
        this.responseDoctor = responseDoctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDateEntry() {
        return dateEntry;
    }

    public void setDateEntry(String dateEntry) {
        this.dateEntry = dateEntry;
    }

    public String getDateExit() {
        return dateExit;
    }

    public void setDateExit(String dateExit) {
        this.dateExit = dateExit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Doctor> getResponseDoctor() {
        return responseDoctor;
    }

    public void setResponseDoctor(List<Doctor> responseDoctor) {
        this.responseDoctor = responseDoctor;
    }
}
