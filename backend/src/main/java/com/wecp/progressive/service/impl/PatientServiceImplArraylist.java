package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.entity.Patient;
import com.wecp.progressive.service.PatientService;

@Service
public class PatientServiceImplArraylist implements PatientService {

    private static List<Patient> patientList = new ArrayList<>();

    @Override
<<<<<<< HEAD
    public void emptyArrayList() {
=======
    public void emptyArrayList(){
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        patientList = new ArrayList<>();
    }

    @Override
    public Integer addPatient(Patient patient) {
<<<<<<< HEAD

        // patientList.add(patient);
        // return patientList.size();
        try{
            patientList.add(patient);
            return patientList.size();
        }catch(NullPointerException e)
        {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Patient> getAllPatientSortedByName()  {
        // Collections.sort(patientList);
        // return patientList;
        List<Patient> sortedLst = new ArrayList<>(patientList);
        sortedLst.sort(Comparator.comparing(Patient::getFullName));
        return sortedLst;
        // Comparator<Patient> comp = new Comparator<Patient>() {
        // @Override
        // public int compare(Patient p1, Patient p2) {
        // return p1.getFullName().compareTo(p2.getFullName());
        // }
        // };
        
        // sortedLst.sort(comp);
        
    }

    @Override
    public List<Patient> getAllPatients()  {
        // return patientList;
        return new ArrayList<>(patientList);
=======
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
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @Override
    public Patient getPatientById(int patientId){
<<<<<<< HEAD
        return patientList.stream().filter(p-> p.getPatientId() == patientId).findFirst().orElse(null);
=======
        Iterator<Patient> it = patientList.iterator();
        while(it.hasNext()){
            Patient p = it.next();
            if(p.getPatientId() == patientId){
                return p;
            }
        }
        return null;
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

}