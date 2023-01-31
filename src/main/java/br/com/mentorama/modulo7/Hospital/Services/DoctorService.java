package br.com.mentorama.modulo7.Hospital.Services;

import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import br.com.mentorama.modulo7.Hospital.Repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctor> findAll(){
        return doctorRepository.findAll();
    }
    public Doctor findById(Long id){
        return doctorRepository.findById(id).orElse(null);
    }
    public Doctor createNew(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public Doctor update(Doctor doctor){
        return doctorRepository.save(doctor);
    }
    public void delete(Long id){
        doctorRepository.deleteById(id);
    }
}
