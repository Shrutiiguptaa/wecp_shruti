package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.dao.ClinicDAO;
import com.wecp.progressive.entity.Clinic;
import com.wecp.progressive.service.ClinicService;

<<<<<<< HEAD
public class ClinicServiceImplJdbc implements ClinicService {
=======
public class ClinicServiceImplJdbc implements ClinicService  {
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2

    private ClinicDAO clinicDAO;

    public ClinicServiceImplJdbc(ClinicDAO clinicDAO) {
        this.clinicDAO = clinicDAO;
    }

    @Override
<<<<<<< HEAD
    public Integer addClinic(Clinic clinic) {
        try {
            Integer id = clinicDAO.addClinic(clinic);
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void deleteClinic(int clinicId) {
        try {
            clinicDAO.deleteClinic(clinicId);
        } catch (Exception e) {
            e.printStackTrace();
        }

=======
    public Integer addClinic(Clinic clinic) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteClinic(int clinicId) throws SQLException {
        // TODO Auto-generated method stub
        
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    @Override
    public List<Clinic> getAllClinics() {
<<<<<<< HEAD
        try {
            List<Clinic> list = clinicDAO.getAllClinics();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
=======
        // TODO Auto-generated method stub
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        return List.of();
    }

    @Override
    public Clinic getClinicById(int clinicId) {
<<<<<<< HEAD
        try {
            Clinic clinic = clinicDAO.getClinicById(clinicId);
            return clinic;
        } catch (Exception e) {
            e.printStackTrace();
        }
=======
        // TODO Auto-generated method stub
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        return null;
    }

    @Override
<<<<<<< HEAD
    public void updateClinic(Clinic clinic) throws SQLException {
        try {
            clinicDAO.updateClinic(clinic);
        } catch (Exception e) {
            e.printStackTrace();
        }

=======
    public void updateClinic(Clinic clinic) {
        // TODO Auto-generated method stub
        
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

}