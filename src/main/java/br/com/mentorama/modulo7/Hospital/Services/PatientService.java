package br.com.mentorama.modulo7.Hospital.Services;

import br.com.mentorama.modulo7.Hospital.Entities.Patient;
import br.com.mentorama.modulo7.Hospital.Repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> findAll(){
        return patientRepository.findAll();
    }
    public Patient findById(Long id){
        return patientRepository.findById(id).orElse(null);
    }
    public Patient createNew(Patient patient){
        return patientRepository.save(patient);
    }
    public Patient update(Patient patient){
        return patientRepository.save(patient);
    }
    public void delete(Long id){
        patientRepository.deleteById(id);
    }
}
