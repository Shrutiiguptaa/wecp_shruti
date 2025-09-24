package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Doctor;

<<<<<<< HEAD
import java.util.List;

public interface DoctorDAO {
    int addDoctor(Doctor doctor);
    Doctor getDoctorById(int doctorId);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int doctorId) ;
    List<Doctor> getAllDoctors();
=======
import java.sql.SQLException;
import java.util.List;

public interface DoctorDAO {
    int addDoctor(Doctor doctor) throws SQLException;
    Doctor getDoctorById(int doctorId) throws SQLException;
    void updateDoctor(Doctor doctor) throws SQLException;
    void deleteDoctor(int doctorId) throws SQLException;
    List<Doctor> getAllDoctors() throws SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
}
