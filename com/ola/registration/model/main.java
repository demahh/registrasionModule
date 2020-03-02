package com.ola.registration.model;

import com.ola.registration.model.dao.StudentDAO;
import com.ola.registration.model.dao.daoimpl.StudentDAOImpl;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        StudentDAOImpl studentDAOImplO=new StudentDAOImpl("jdbc:mysql://localhost:3306/student1?useSSL=false"
                ,"root","root@JEA");

        studentDAOImplO.findById("4");

    }
}
