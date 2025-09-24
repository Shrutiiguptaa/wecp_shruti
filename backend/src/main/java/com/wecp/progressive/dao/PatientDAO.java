package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Patient;

<<<<<<< HEAD
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient);
    Patient getPatientById(int patientId);
    void updatePatient (Patient patient);
    void deletePatient (int patientId);
    List<Patient> getAllPatients();
=======
import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient) throws SQLException;
    Patient getPatientById(int patientId)throws SQLException;
    void updatePatient (Patient patient)throws SQLException;
    void deletePatient (int patientId)throws SQLException;
    List<Patient> getAllPatients()throws SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
}