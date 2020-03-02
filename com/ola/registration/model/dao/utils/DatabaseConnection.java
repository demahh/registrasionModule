package com.ola.registration.model.dao.utils;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    PreparedStatement pre ;
    ResultSet res;

    private JeaQueue <ConnectionWrapper> connection;
    ConnectionWrapper connectionWrapper;
    private String url;
    private String userName;
    private String password;

    public DatabaseConnection(String url,String userName,String password){
        this.connection=new JeaQueue(10);
        this.url = url;
        this.userName = userName;
        this.password = password;
    }

    public ConnectionWrapper getConnection () throws SQLException {
        if(this.connection.isempty()){
            return new ConnectionWrapper(DriverManager.getConnection(url,userName,password));

        }else {
             connectionWrapper=this.connection.deQueue();
            if(connectionWrapper.isAlive()){
                return connectionWrapper;
            } else{
                connectionWrapper.getConnection().close();
                return getConnection();
            }
        }
    }

    public void release() throws SQLException {

        this.connection.enQueue(connectionWrapper);

    }


    public ResultSet select(String query,String id) {

        try {
            pre = getConnection().getConnection().prepareStatement(query);

            pre.setString(1,id);
            res=pre.executeQuery();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
    public void insert(String query){


    }
}
