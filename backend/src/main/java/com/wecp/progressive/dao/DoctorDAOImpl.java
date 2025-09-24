package com.wecp.progressive.dao;

<<<<<<< HEAD

public class DoctorDAOImpl {
=======
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.entity.Doctor;

public class DoctorDAOImpl implements DoctorDAO {

    @Override
    public int addDoctor(Doctor doctor) throws SQLException {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void deleteDoctor(int doctorId) throws SQLException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Doctor> getAllDoctors() throws SQLException {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Doctor getDoctorById(int doctorId) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateDoctor(Doctor doctor) throws SQLException {
        // TODO Auto-generated method stub
        
    }
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6



}
