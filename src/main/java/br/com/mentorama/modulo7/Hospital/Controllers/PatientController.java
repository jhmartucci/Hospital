package br.com.mentorama.modulo7.Hospital.Controllers;

import br.com.mentorama.modulo7.Hospital.Entities.Patient;
import br.com.mentorama.modulo7.Hospital.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public ResponseEntity<List<Patient>> findAll(){
        return new ResponseEntity<>(patientService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Patient> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(patientService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Patient> createNew(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.createNew(patient), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Patient> update(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.update(patient), HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        patientService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
