package com.wecp.progressive.service;

import com.wecp.progressive.entity.Clinic;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
import java.util.List;

public interface ClinicService {

<<<<<<< HEAD
    public List<Clinic> getAllClinics();

    public Clinic getClinicById(int clinicId);

    public Integer addClinic(Clinic clinic);

    public void updateClinic(Clinic clinic);

    public void deleteClinic(int clinicId);

    //Do not implement these methods in ClinicServiceImplJdbc.java class
    default public List<Clinic> getAllClinicByLocation(String location) { return null; }

    default public List<Clinic> getAllClinicByDoctorId(int doctorId) { return null; }
=======
    public List<Clinic> getAllClinics() throws SQLException;

    public Clinic getClinicById(int clinicId) throws SQLException;

    public Integer addClinic(Clinic clinic) throws SQLException;

    public void updateClinic(Clinic clinic) throws SQLException;

    public void deleteClinic(int clinicId) throws SQLException;

    //Do not implement these methods in ClinicServiceImplJdbc.java class
    default public List<Clinic> getAllClinicByLocation(String location) throws SQLException { return null; }

    default public List<Clinic> getAllClinicByDoctorId(int doctorId) throws SQLException { return null; }
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
}
