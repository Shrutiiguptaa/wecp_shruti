package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.dao.PatientDAO;
import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.service.PatientService;

public class PatientServiceImplJdbc implements PatientService  {

    private PatientDAO patientDAO;

    public PatientServiceImplJdbc(PatientDAO patientDAO){
        this.patientDAO = patientDAO;
    }

    @Override
    public Integer addPatient(Patient patient) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deletePatient(int patientId) {
        // TODO Auto-generated method stub
        // PatientService.super.deletePatient(patientId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // PatientService.super.emptyArrayList();
    }

    @Override
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
    
}