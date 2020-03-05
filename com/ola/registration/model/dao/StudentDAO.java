package com.ola.registration.model.dao;

import com.ola.registration.model.entity.Student;

import java.sql.SQLException;

public interface StudentDAO {

    void findById(String ID) throws SQLException;
    void findByEmail(String email) throws SQLException;
    void save(Student student);
    void update(Student student) throws SQLException;
    void DeleteById(String ID);

}
