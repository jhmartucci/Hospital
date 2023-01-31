package br.com.mentorama.modulo7.Hospital.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @JoinColumn(name = "responseDoctor")
    private Long id;
    private String medicName;
    private Integer departament;
    private String cargo;
    private String phone;

    public Doctor() {
    }

    public Doctor(Long doctorId, String medicName, Integer departament, String cargo, String phone) {
        this.id = doctorId;
        this.medicName = medicName;
        this.departament = departament;
        this.cargo = cargo;
        this.phone = phone;
    }

    public Long getDoctorId() {
        return id;
    }

    public void setDoctorId(Long doctorId) {
        this.id = doctorId;
    }

    public String getMedicName() {
        return medicName;
    }

    public void setMedicName(String medicName) {
        this.medicName = medicName;
    }

    public Integer getDepartament() {
        return departament;
    }

    public void setDepartament(Integer departament) {
        this.departament = departament;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
