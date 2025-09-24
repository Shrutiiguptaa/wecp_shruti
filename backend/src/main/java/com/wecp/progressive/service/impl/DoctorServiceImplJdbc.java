package com.wecp.progressive.service.impl;

<<<<<<< HEAD
public class DoctorServiceImplJdbc  {
=======
import java.util.List;

import com.wecp.progressive.dao.DoctorDAO;
import com.wecp.progressive.entity.Doctor;
import com.wecp.progressive.service.DoctorService;

public class DoctorServiceImplJdbc implements DoctorService  {

    private DoctorDAO doctorDAO;

    public DoctorServiceImplJdbc(DoctorDAO doctorDAO){
        this.doctorDAO = doctorDAO;
    }

    @Override
    public Integer addDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteDoctor(int doctorId) {
        // TODO Auto-generated method stub
        // DoctorService.super.deleteDoctor(doctorId);
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        // DoctorService.super.emptyArrayList();
    }

    @Override
    public List<Doctor> getAllDoctors() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Doctor getDoctorById(int doctorId) {
        // TODO Auto-generated method stub
        // return DoctorService.super.getDoctorById(doctorId);
        return null;
    }

    @Override
    public List<Doctor> getDoctorSortedByExperience() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        // TODO Auto-generated method stub
        // DoctorService.super.updateDoctor(doctor);
    }
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6

}