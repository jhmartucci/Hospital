package br.com.mentorama.modulo7.Hospital.Controllers;

import br.com.mentorama.modulo7.Hospital.Entities.Doctor;
import br.com.mentorama.modulo7.Hospital.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> findAll(){
        return new ResponseEntity<>(doctorService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Doctor> findById(@PathVariable("id") Long id){
        return new ResponseEntity<>(doctorService.findById(id), HttpStatus.OK );
    }
    @PostMapping
    public ResponseEntity<Doctor> createNew(@RequestBody Doctor doctor){
        doctorService.createNew(doctor);
        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
        return new ResponseEntity<>(doctorService.update(doctor), HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id){
        doctorService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
