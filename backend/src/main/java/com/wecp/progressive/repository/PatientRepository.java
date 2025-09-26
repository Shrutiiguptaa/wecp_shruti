package com.wecp.progressive.repository;

<<<<<<< HEAD
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Patient;
import java.util.List;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    // @Query("SELECT p FROM Patient p WHERE p.patientId = :patientId")
    Patient findByPatientId(Integer patientId);

    @Query("SELECT p FROM Patient p ORDER BY p.fullName ASC")
    List<Patient> getAllPatientSortedByName();
}
=======

public interface PatientRepository {
}
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
