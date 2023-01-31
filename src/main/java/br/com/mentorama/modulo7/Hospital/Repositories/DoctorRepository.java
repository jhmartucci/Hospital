package br.com.mentorama.modulo7.Hospital.Repositories;

import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
