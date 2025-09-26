package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
=======
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
import java.util.List;

import com.wecp.progressive.dao.PatientDAO;
import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.service.PatientService;

<<<<<<< HEAD
public class PatientServiceImplJdbc implements PatientService {

    private PatientDAO patientDAO;

    public PatientServiceImplJdbc(PatientDAO patientDAO) {
=======
public class PatientServiceImplJdbc implements PatientService  {

    private PatientDAO patientDAO;

    public PatientServiceImplJdbc(PatientDAO patientDAO){
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        this.patientDAO = patientDAO;
    }

    @Override
<<<<<<< HEAD
    public Integer addPatient(Patient patient) throws SQLException {
        Integer id = patientDAO.addPatient(patient);
        return id;
        // try {
        // Integer id = patientDAO.addPatient(patient);
        // return id;
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // return 0;
    }

    @Override
    public void deletePatient(int patientId) throws SQLException {
        // TODO Auto-generated method stub
        // PatientService.super.deletePatient(patientId);
        // patientDAO.deletePatient(patientId);
        try {
            patientDAO.deletePatient(patientId);
        } catch (Exception e) {
            e.printStackTrace();
        }

=======
    public Integer addPatient(Patient patient) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deletePatient(int patientId) {
        // TODO Auto-generated method stub
        // PatientService.super.deletePatient(patientId);
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // PatientService.super.emptyArrayList();
    }

    @Override
<<<<<<< HEAD
    public List<Patient> getAllPatientSortedByName() throws SQLException {
        return patientDAO.getAllPatientsSortedByName();
    }

    @Override
    public List<Patient> getAllPatients() throws SQLException {
        // TODO Auto-generated method stub
        List<Patient> list = patientDAO.getAllPatients();
        return list;

        // try {
        // List<Patient> list = patientDAO.getAllPatients();
        // return list;
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // return List.of();
    }

    @Override
    public Patient getPatientById(int patientId) throws SQLException {
        // TODO Auto-generated method stub
        // return PatientService.super.getPatientById(patientId);
        Patient p = patientDAO.getPatientById(patientId);
        return p;
        // try {
        // Patient p = patientDAO.getPatientById(patientId);
        // return p;
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
        // return null;
    }

    @Override
    public void updatePatient(Patient patient) throws SQLException {
        // TODO Auto-generated method stub
        // PatientService.super.updatePatient(patient);
        patientDAO.updatePatient(patient);

        // try {
        // patientDAO.updatePatient(patient);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }
    }

=======
    public List<Patient> getAllPatientSortedByName() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public List<Patient> getAllPatients() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Patient getPatientById(int patientId) {
        // TODO Auto-generated method stub
        // return PatientService.super.getPatientById(patientId);
        return null;
    }

    @Override
    public void updatePatient(Patient patient) {
        // TODO Auto-generated method stub
        // PatientService.super.updatePatient(patient);
    }
    
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
}