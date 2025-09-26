package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.util.List;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.repository.ClinicRepository;
import com.wecp.progressive.service.ClinicService;

@Service
public class ClinicServiceImplJpa implements ClinicService {
    // @Autowired
    private ClinicRepository clinicRepository;
    public ClinicServiceImplJpa(ClinicRepository clinicRepository){
        this.clinicRepository = clinicRepository;
    }

    @Override
    public Integer addClinic(Clinic clinic) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteClinic(int clinicId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Clinic> getAllClinicByDoctorId(int doctorId) throws SQLException {
        // TODO Auto-generated method stub
        return ClinicService.super.getAllClinicByDoctorId(doctorId);
    }

    @Override
    public List<Clinic> getAllClinicByLocation(String location) throws SQLException {
        // TODO Auto-generated method stub
        return ClinicService.super.getAllClinicByLocation(location);
    }

    @Override
    public List<Clinic> getAllClinics() throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Clinic getClinicById(int clinicId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    
=======
public class ClinicServiceImplJpa  {

>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
}