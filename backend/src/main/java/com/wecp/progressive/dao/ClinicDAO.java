package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Clinic;

<<<<<<< HEAD
import java.util.List;

public interface ClinicDAO {
    int addClinic(Clinic clinic);
    Clinic getClinicById(int clinicId);
    void updateClinic(Clinic clinic);
    void deleteClinic(int clinicId);
    List<Clinic> getAllClinics();
=======
import java.sql.SQLException;
import java.util.List;

public interface ClinicDAO {
    int addClinic(Clinic clinic) throws SQLException;
    Clinic getClinicById(int clinicId) throws SQLException;
    void updateClinic(Clinic clinic) throws SQLException;
    void deleteClinic(int clinicId) throws SQLException;
    List<Clinic> getAllClinics() throws SQLException;
>>>>>>> cedb17acc917b7b4add85082e1d1308d51284ab6
}