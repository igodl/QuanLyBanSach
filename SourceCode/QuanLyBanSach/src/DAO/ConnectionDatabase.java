/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Ha
 */
public class ConnectionDatabase {

    String host;
    String user;
    String pass;
    String nameDb;

    Connection con = null;
    Statement statement = null;
    ResultSet result = null;

    public ConnectionDatabase() {

    }

    public ConnectionDatabase(String host, String user, String pass, String nameDB) {
        this.host = host;
        this.user = user;
        this.pass = pass;
        this.nameDb = nameDB;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNameDB() {
        return nameDb;
    }

    public void setNameDB(String nameDB) {
        this.nameDb = nameDB;
    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }

    public void driverTest() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Lỗi Driver");
            System.out.println(e);
        }
    }

    public void connectionTest() {
       if (con == null) {
            try {
                String url = "jdbc:mysql://" + this.host + ":3306/" + this.nameDb;
                con = DriverManager.getConnection(url, this.user, this.pass);
            } catch (Exception e) {
                System.out.println("Lỗi Connection");
                System.out.println(e);
            }
        }

    }

    public void statementTest() {
        if (statement == null) {
            try {
                statement = con.createStatement();
            } catch (Exception e) {
                System.out.println("Lỗi Statement");
                System.out.println(e);
            }
       }

    }

    public void Test() {
        driverTest();
        connectionTest();
        statementTest();
    }
      

}
