package com.ola.registration.model.dao;

import com.ola.registration.model.entity.Student;

import java.sql.SQLException;

public interface StudentDAO {

    void findById(String ID) throws SQLException;
    void findByEmail();

    void save(Student s);

    void update(Student r);

}
