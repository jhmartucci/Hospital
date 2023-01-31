package br.com.mentorama.modulo7.Hospital.Services;

import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;
import br.com.mentorama.modulo7.Hospital.Repositories.HospitalizationHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalizationHistoryService {
    @Autowired
    private HospitalizationHistoryRepository hospitalizationHistoryRepository;

    public List<HospitalizationHistory> findAll(){
        return hospitalizationHistoryRepository.findAll();
    }
    public HospitalizationHistory findById(Long id){
        return hospitalizationHistoryRepository.findById(id).orElse(null);
    }
    public HospitalizationHistory createNew(HospitalizationHistory history){
        return hospitalizationHistoryRepository.save(history);
    }
    public HospitalizationHistory uptade(HospitalizationHistory history){
        return hospitalizationHistoryRepository.save(history);
    }
    public void delelte(Long id){
        hospitalizationHistoryRepository.deleteById(id);
    }
}
