package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.service.impl.PatientServiceImplArraylist;
<<<<<<< HEAD
import com.wecp.progressive.service.impl.PatientServiceImplJpa;
=======

>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
<<<<<<< HEAD
    private PatientServiceImplArraylist patientServiceImplArraylist;

    private final PatientServiceImplJpa patientServiceImplJpa;
    PatientController(PatientServiceImplJpa patientServiceImplJpa) {
        this.patientServiceImplJpa = patientServiceImplJpa;
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        try {
            List<Patient> patientList = patientServiceImplJpa.getAllPatients();
            return new ResponseEntity<>(patientList, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

=======
    @Qualifier("patientServiceImplArraylist")
    private PatientServiceImplArraylist patientServiceImplArraylist;

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patientList = patientServiceImplArraylist.getAllPatients();
        return new ResponseEntity<>(patientList, HttpStatus.OK);
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @GetMapping("/{patientId}")
    public ResponseEntity<Patient> getPatientById(@PathVariable int patientId) {
<<<<<<< HEAD
        try {
            Patient patient = patientServiceImplJpa.getPatientById(patientId);
            return new ResponseEntity<>(patient, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping
    public ResponseEntity<Integer> addPatient(@RequestBody Patient patient) {
        try {
            int p = patientServiceImplJpa.addPatient(patient);
            return new ResponseEntity<>(p, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{patientId}")
    public ResponseEntity<?> updatePatient(@PathVariable int patientId, @RequestBody Patient patient) {
        try {
            // Patient p = patientServiceImplJpa.getPatientById(patientId);
            // if (p == null) {
            // throw new Exception("Patient not found");
            // }
            // patientServiceImplJpa.updatePatient(patient);
            patient.setPatientId(patientId);
            patientServiceImplJpa.updatePatient(patient);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @DeleteMapping("/{patientId}")
    public ResponseEntity<Void> deletePatient(@PathVariable int patientId) {
        try {
            patientServiceImplJpa.deletePatient(patientId);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

=======
        Patient patient = patientServiceImplArraylist.getPatientById(patientId);
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addPatient(@RequestBody Patient patient) {
        int p = patientServiceImplArraylist.addPatient(patient);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    public ResponseEntity<Void> updatePatient(int patientId, Patient patient) {
        return null;
    }

    public ResponseEntity<Void> deletePatient(int patientId) {
        return null;
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Patient>> getAllPatientFromArrayList() {
<<<<<<< HEAD
        // try {
        //     List<Patient> patientList = patientServiceImplArraylist.getAllPatients();
        //     return new ResponseEntity<>(patientList, HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        List<Patient> patientList = patientServiceImplArraylist.getAllPatients();
        return new ResponseEntity<>(patientList, HttpStatus.OK);

=======
        List<Patient> patientList = patientServiceImplArraylist.getAllPatients();
        return new ResponseEntity<>(patientList, HttpStatus.OK);
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Void> addPatientToArrayList(@RequestBody Patient patient) {
<<<<<<< HEAD
        // try {
        //     int p = patientServiceImplArraylist.addPatient(patient);
        //     return new ResponseEntity<>(p, HttpStatus.CREATED);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        int p = patientServiceImplArraylist.addPatient(patient);
            return new ResponseEntity<>(HttpStatus.CREATED);

=======
        int p = patientServiceImplArraylist.addPatient(patient);
        return new ResponseEntity<>(HttpStatus.CREATED);
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Patient>> getAllPatientSortedByNameFromArrayList() {
<<<<<<< HEAD
        // try {
        //     List<Patient> tmp = patientServiceImplArraylist.getAllPatientSortedByName();
        //     return new ResponseEntity<>(tmp, HttpStatus.OK);
        // } catch (Exception e) {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        List<Patient> tmp = patientServiceImplArraylist.getAllPatientSortedByName();
            return new ResponseEntity<>(tmp, HttpStatus.OK);
=======
        List<Patient> tmp = patientServiceImplArraylist.getAllPatientSortedByName();
        return new ResponseEntity<>(tmp, HttpStatus.OK);
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }
}