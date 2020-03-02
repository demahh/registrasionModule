package com.ola.registration.model.dao.daoimpl;

import com.ola.registration.model.dao.StudentDAO;
import com.ola.registration.model.dao.utils.DatabaseConnection;
import com.ola.registration.model.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOImpl implements StudentDAO  {

    DatabaseConnection databaseConnection;

    public StudentDAOImpl(String url , String username, String password) throws SQLException {
        databaseConnection =new DatabaseConnection(url, username, password);

    }

    public void findById(String id) throws SQLException {

        String query = " select * from student1.student "
                + "where id=?";

        ResultSet resultSet =  databaseConnection.select(query,id);

        while (resultSet.next()){
            System.out.println(resultSet.getString(1));

        }
    }

    public void findByEmail() {

    }

    public void save(Student s) {
        String query = " insert * into student1.student "
                + (" id,firstname,lastname,email,password,joinYear ") + " Values(?,?,?,?,?,?)";



    }

    public void update(Student r) {

    }


}
