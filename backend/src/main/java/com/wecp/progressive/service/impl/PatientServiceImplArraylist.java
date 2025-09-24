package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.service.PatientService;

public class PatientServiceImplArraylist implements PatientService {

    private static List<Patient> patientList = new ArrayList<>();

    @Override
    public void emptyArrayList(){
        patientList = new ArrayList<>();
    }

    @Override
    public Integer addPatient(Patient patient) {
        patientList.add(patient);
        return patientList.size();
    }

    @Override
    public List<Patient> getAllPatientSortedByName() {
        // Collections.sort(patientList);
        // return patientList;
        List<Patient> sortedLst = patientList;
        // Comparator<Patient> comp = new Comparator<Patient>() {
        //     @Override
        //     public int compare(Patient p1, Patient p2) {
        //         return p1.getFullName().compareTo(p2.getFullName());
        //     }
        // };
        sortedLst.sort(Comparator.comparing(Patient::getFullName));
        // sortedLst.sort(comp);
        return sortedLst;
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientList;
    }

 

}