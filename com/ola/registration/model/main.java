package com.ola.registration.model;

import com.ola.registration.model.dao.StudentDAO;
import com.ola.registration.model.dao.daoimpl.StudentDAOImpl;
import com.ola.registration.model.entity.Student;

import java.sql.SQLException;

public class main {
    public static void calc(int... numbers){
        int sum=0;
        for (int i:numbers){
           sum=sum+i;
            System.out.println(sum);
        }

    }
    public static void main(String[] args) throws SQLException {
        StudentDAOImpl studentDAOImplO=new StudentDAOImpl("jdbc:mysql://localhost:3306/student1?useSSL=false"
                ,"root","root@JEA");

        studentDAOImplO.findById("4");
        studentDAOImplO.save(new Student("8","samar","ziad","sama5r@gmail.com","samar","1/2/225"));
      // calc(1,6,8);
        studentDAOImplO.update(new Student("5","samar","555","sam2ar@gmail.com","samar","1/2/225"));

    }
}
