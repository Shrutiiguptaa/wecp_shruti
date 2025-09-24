package com.wecp.progressive.service;

import com.wecp.progressive.dto.DoctorDTO;
import com.wecp.progressive.entity.Doctor;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
import java.util.List;

public interface DoctorService {

<<<<<<< HEAD
    public List<Doctor> getAllDoctors();

    public Integer addDoctor(Doctor doctor);

    public List<Doctor> getDoctorSortedByExperience();

    default void emptyArrayList() {
    }

    //Do not implement these methods in DoctorServiceImplArraylist.java class
    default public void updateDoctor(Doctor doctor) { }

    default public void deleteDoctor(int doctorId) { }

    default Doctor getDoctorById(int doctorId) { return null; }
=======
    public List<Doctor> getAllDoctors() throws SQLException;

    public Integer addDoctor(Doctor doctor) throws SQLException;

    public List<Doctor> getDoctorSortedByExperience() throws SQLException;

    default void emptyArrayList() throws SQLException{
    }

    //Do not implement these methods in DoctorServiceImplArraylist.java class
    default public void updateDoctor(Doctor doctor) throws SQLException { }

    default public void deleteDoctor(int doctorId) throws SQLException { }

    default Doctor getDoctorById(int doctorId) throws SQLException { return null; }
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6

    //Do not implement these methods in DoctorServiceImplArraylist.java and DoctorServiceImplJdbc.java class
    // Do not implement this method until day-13
    default public void modifyDoctorDetails(DoctorDTO doctorDTO) { }
}
