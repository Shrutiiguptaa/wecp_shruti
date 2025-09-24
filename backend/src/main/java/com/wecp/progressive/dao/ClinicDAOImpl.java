package com.wecp.progressive.dao;

<<<<<<< HEAD
public class ClinicDAOImpl {

}
=======
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Clinic;

public class ClinicDAOImpl implements ClinicDAO {

    @Override
    public int addClinic(Clinic clinic) throws SQLException {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteClinic(int clinicId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Clinic> getAllClinics() throws SQLException {
        // TODO Auto-generated method stub
        return List.of();
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

}
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
