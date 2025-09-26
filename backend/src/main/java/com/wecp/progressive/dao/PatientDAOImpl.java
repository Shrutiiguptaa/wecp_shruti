package com.wecp.progressive.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
<<<<<<< HEAD
=======
import java.sql.Connection;
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Patient;

public class PatientDAOImpl implements PatientDAO {
<<<<<<< HEAD
    // private Connection connection;

    // public PatientDAOImpl(Connection connection){
    //     try {
    //         connection = DatabaseConnectionManager.getConnection();
    //     } catch (SQLException e) {
    //         e.printStackTrace();
    //     }
        
    // }

    @Override
    public int addPatient(Patient patient) throws SQLException {
        
        String query = "insert into patient(full_name, date_of_birth, contact_number, email, address) values(?, ?, ?, ?, ?)";

        try{
            PreparedStatement ps = DatabaseConnectionManager.getConnection().prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, patient.getFullName());
            ps.setDate(2, new java.sql.Date(patient.getDateOfBirth().getTime()));
=======

    private Connection connection;
    
    public PatientDAOImpl() {
    }

    public PatientDAOImpl(Connection connection){
        //this.connection = connection;
        try {
            connection = DatabaseConnectionManager.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public int addPatient(Patient patient) throws SQLException {
     
        
        String query = "insert into patient(full_name, date_of_birth, contact_number, email, address) values(?, ?, ?, ?, ?)";

        try(PreparedStatement ps = connection.prepareStatement(query, java.sql.Statement.RETURN_GENERATED_KEYS)){
            ps.setString(1, patient.getFullName());
            ps.setDate(2, (Date) patient.getDateOfBirth());
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
            ps.setString(3, patient.getContactNumber());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());

            int count = ps.executeUpdate();
            if(count > 0){
                ResultSet rs = ps.getGeneratedKeys();
                if(rs.next()){
                    int id = rs.getInt(1);
                    patient.setPatientId(id);
                    return id;
                }
            }
        }
<<<<<<< HEAD
        catch(SQLException e){
            e.printStackTrace();
        }
=======
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
        return -1;
    }

    @Override
    public void deletePatient(int patientId) throws SQLException {
<<<<<<< HEAD
        String query = "delete from patient where patient_id = ?";

        try(PreparedStatement ps = DatabaseConnectionManager.getConnection().prepareStatement(query)){
=======
        // TODO Auto-generated method stub
        
        String query = "delete from patient where patient_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(query)){
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
            ps.setInt(1, patientId);
            ps.executeUpdate();
        }
    }

    @Override
    public List<Patient> getAllPatients() throws SQLException {
<<<<<<< HEAD
        String query = "select * from patient";
        List<Patient> li = new ArrayList<>();
        try(Statement s = DatabaseConnectionManager.getConnection().createStatement()){
=======
    
        String query = "select * from patient";
        List<Patient> li = new ArrayList<>();
        try(Statement s = connection.createStatement()){
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
            ResultSet rs = s.executeQuery(query);
            
            while(rs.next()){
                li.add(mapper(rs));
            }
        }
        return li;
    }

    @Override
    public Patient getPatientById(int patientId) throws SQLException {
<<<<<<< HEAD
        String query = "select * from patient where patient_id = ?";

        try(PreparedStatement ps = DatabaseConnectionManager.getConnection()
        .prepareStatement(query)){
=======
        // TODO Auto-generated method stub
        String query = "select * from patient where patient_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(query)){
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
            ps.setInt(1, patientId);

            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return mapper(rs);
            }
        }
        return null;
    }

    @Override
    public void updatePatient(Patient patient) throws SQLException {
<<<<<<< HEAD
        String query = "update patient set full_name = ?, date_of_birth = ?, contact_number = ?, email = ?, address = ? where patient_id = ?";

        try{
            PreparedStatement ps = DatabaseConnectionManager.getConnection().prepareStatement(query);
            ps.setString(1, patient.getFullName());
            ps.setDate(2, new java.sql.Date(patient.getDateOfBirth().getTime()));   //new java.sql.Date(utilDate.getTime())
=======
        // TODO Auto-generated method stub
        String query = "update patient set full_name = ?, date_of_birth = ?, contact_number = ?, email = ?, address = ? where patient_id = ?";

        try(PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1, patient.getFullName());
            ps.setDate(2, (Date) patient.getDateOfBirth());
>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
            ps.setString(3, patient.getContactNumber());
            ps.setString(4, patient.getEmail());
            ps.setString(5, patient.getAddress());
            ps.setInt(6, patient.getPatientId());

            ps.executeUpdate();
        }
<<<<<<< HEAD
        catch(SQLException e){
            e.printStackTrace();
        }
    }

    public List<Patient> getAllPatientsSortedByName() throws SQLException {
        String query = "select * from patient order by full_name";
        List<Patient> li = new ArrayList<>();
        try(Statement s = DatabaseConnectionManager.getConnection().createStatement()){
            ResultSet rs = s.executeQuery(query);
            
            while(rs.next()){
                li.add(mapper(rs));
            }
        }
        return li;
=======

>>>>>>> bfc45e61ecaa78265aee29eb79e3d689dda129d2
    }

    public Patient mapper(ResultSet rs) throws SQLException{
        Patient p = new Patient();
        p.setPatientId(rs.getInt("patient_id"));
        p.setFullName(rs.getString("full_name"));
        p.setEmail(rs.getString("email"));
        p.setDateOfBirth(rs.getDate("date_of_birth"));
        p.setContactNumber(rs.getString("contact_number"));
        p.setAddress(rs.getString("address"));

        return p;
    }

}