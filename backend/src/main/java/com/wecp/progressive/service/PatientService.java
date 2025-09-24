package com.wecp.progressive.service;

import com.wecp.progressive.dto.PatientDTO;
import com.wecp.progressive.entity.Patient;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
import java.util.List;

public interface PatientService {

<<<<<<< HEAD
    List<Patient> getAllPatients();

    Integer addPatient(Patient patient);

    List<Patient> getAllPatientSortedByName();

    default void emptyArrayList() {
    }

    //Do not implement these methods in PatientServiceImplArraylist.java class
    default void updatePatient(Patient patient) {}

    default void deletePatient(int patientId) {}

    default Patient getPatientById(int patientId) {
=======
    List<Patient> getAllPatients() throws SQLException;

    Integer addPatient(Patient patient) throws SQLException;

    List<Patient> getAllPatientSortedByName() throws SQLException;

    default void emptyArrayList() throws SQLException{
    }

    //Do not implement these methods in PatientServiceImplArraylist.java class
    default void updatePatient(Patient patient) throws SQLException{}

    default void deletePatient(int patientId) throws SQLException{}

    default Patient getPatientById(int patientId) throws SQLException {
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
        return null;
    }

    //Do not implement these methods in PatientServiceImplArraylist.java and PatientServiceImplJdbc.java class
    //Do not implement this method until day-13
    default public void modifyPatientDetails(PatientDTO patientDTO) { }
}
