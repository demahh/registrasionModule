package com.ola.registration.model.dao.utils;

import java.sql.Connection;
import java.time.LocalDateTime;

public class ConnectionWrapper {

    private Connection connection;
    private LocalDateTime createDateTime;

    public ConnectionWrapper(Connection connection){
        this.connection=connection;
        this.createDateTime=LocalDateTime.now();
    }

    public boolean isAlive(){
        return this.createDateTime.plusHours(6).compareTo(LocalDateTime.now())>=0;
    }

    public Connection getConnection(){
        return this.connection;
    }
}
