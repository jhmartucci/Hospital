package br.com.mentorama.modulo7.Hospital.Controllers;

import br.com.mentorama.modulo7.Hospital.Adapters.HospitalizationHistoryAdapter;
import br.com.mentorama.modulo7.Hospital.DTO.HospitalizationByDoctors;
import br.com.mentorama.modulo7.Hospital.DTO.HospitalizationByPatients;
import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import br.com.mentorama.modulo7.Hospital.Entities.HospitalizationHistory;
import br.com.mentorama.modulo7.Hospital.Entities.Patient;
import br.com.mentorama.modulo7.Hospital.Services.DoctorService;
import br.com.mentorama.modulo7.Hospital.Services.HospitalizationHistoryService;
import br.com.mentorama.modulo7.Hospital.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospitalization")
public class HospitalizationHistoryController {
    @Autowired
    private HospitalizationHistoryService hospitalizationHistoryService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private HospitalizationHistoryAdapter hospitalizationHistoryAdapter;

    @GetMapping("/by-patients")
    public ResponseEntity<List<HospitalizationByPatients>> hospitalizationByPatients(){
        List<Patient> patients = patientService.findAll();
        List<HospitalizationHistory> hospitalizationHistories = hospitalizationHistoryService.findAll();
        List<HospitalizationByPatients> hospitalizationByPatients =
                hospitalizationHistoryAdapter.adapterHospitalizationByPatient(patients, hospitalizationHistories);
        return new ResponseEntity<>(hospitalizationByPatients, HttpStatus.OK);
    }
    @GetMapping("/by-doctor")
    public ResponseEntity<List<HospitalizationByDoctors>> hospitalizationByDoctor(){
        List<Doctor> doctors = doctorService.findAll();
        List<HospitalizationHistory> hospitalizationHistories = hospitalizationHistoryService.findAll();
        List<HospitalizationByDoctors> hospitalizationByDoctors =
                hospitalizationHistoryAdapter.adapterHopitalizationByDoctor(doctors, hospitalizationHistories);
        return new ResponseEntity<>(hospitalizationByDoctors, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<HospitalizationHistory>> findAll(){
        return new ResponseEntity<>(hospitalizationHistoryService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<HospitalizationHistory> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(hospitalizationHistoryService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<HospitalizationHistory> createNew(@RequestBody HospitalizationHistory history){
        return new ResponseEntity<>(hospitalizationHistoryService.createNew(history), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<HospitalizationHistory> update(@RequestBody HospitalizationHistory history){
        return new ResponseEntity<>(hospitalizationHistoryService.uptade(history), HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        hospitalizationHistoryService.delelte(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
