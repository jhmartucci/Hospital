package br.com.mentorama.modulo7.Hospital.Repositories;

import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalizationHistoryRepository extends JpaRepository<HospitalizationHistory, Long> {
}
