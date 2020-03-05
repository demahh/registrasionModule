package com.ola.registration.model;

import com.ola.registration.model.dao.StudentDAO;
import com.ola.registration.model.dao.daoimpl.StudentDAOImpl;
import com.ola.registration.model.entity.Student;

import java.sql.SQLException;

public class main {

    public static void main(String[] args) throws SQLException {

        StudentDAOImpl studentDAOImpl=new StudentDAOImpl("jdbc:mysql://localhost:3306/student1?useSSL=false"
                                                                                 ,"root","root@JEA");
        studentDAOImpl.findByEmail("ola@gmail.com");

        studentDAOImpl.findById("9");

        studentDAOImpl.save(new Student("6","samar","ziad","ola@gmail.com","samar"
                                          ,"1/2/225"));
        studentDAOImpl.DeleteById("5");

         studentDAOImpl.update(new Student("9","kadash3","555","sam2ar@gmail.com","samar",
                                           "1/2/225"));

        // calc(1,6,8);
    }


    public static void calc(int... numbers){
        int sum=0;
        for (int i:numbers){
            sum=sum+i;
            System.out.println(sum);
        }

    }
}
