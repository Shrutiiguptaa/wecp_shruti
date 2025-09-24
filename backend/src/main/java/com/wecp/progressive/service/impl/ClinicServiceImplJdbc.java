package com.wecp.progressive.service.impl;

<<<<<<< HEAD
public class ClinicServiceImplJdbc  {
=======
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.dao.ClinicDAO;
import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.service.ClinicService;

public class ClinicServiceImplJdbc implements ClinicService  {

    private ClinicDAO clinicDAO;

    public ClinicServiceImplJdbc(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
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
    public List<Clinic> getAllClinics() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Clinic getClinicById(int clinicId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateClinic(Clinic clinic) {
        // TODO Auto-generated method stub
        
    }
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6

}