package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Patient;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient) throws SQLException;
    Patient getPatientById(int patientId)throws SQLException;
    void updatePatient (Patient patient)throws SQLException;
    void deletePatient (int patientId)throws SQLException;
    List<Patient> getAllPatients()throws SQLException;
<<<<<<< HEAD
    public List<Patient> getAllPatientsSortedByName() throws SQLException;
=======
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
}