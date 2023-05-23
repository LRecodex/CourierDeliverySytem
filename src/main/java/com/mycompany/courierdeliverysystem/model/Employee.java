/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courierdeliverysystem.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author MUHAMMAD FAUZUL AZIM BIN IMRAN HAYAT
 */
public class Employee {
    private String EmployeeId;
    private String username;
    private String name;
    private String password;
    private String email;
    private String phone;
    private String Occupation;
    private String Account_type;

    
    public Employee(String un, String name, String pass, String email, String phone,String type ,String occ) {
        super();
        this.username = un;
        this.Occupation = occ;
        this.email = email;
        this.name = name;
        this.password = pass;
        this.phone = phone;
        this.EmployeeId = generateRandomEmpId();
    }

    public Employee(String id, String un, String name, String pass, String email, String phone,String type, String occ) {
        super();
    }
    public Employee(){}
    /**
     * @return the EmployeeId
     */
    
    
    public String getEmployeeId() {
        return EmployeeId;
    }

    /**
     * @param EmployeeId the EmployeeId to set
     */
    public void setEmployeeId(String EmployeeId) {
        this.EmployeeId = EmployeeId;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }


    /**
     * @return the Occupation
     */
    public String getOccupation() {
        return Occupation;
    }

    /**
     * @param Occupation the Occupation to set
     */
    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }
    
    //Auto-create EmployeeId
    public String generateRandomEmpId() {
        String generatedEmpId = "";

        // Generate random number
        Random random = new Random();
        int randomNumber = random.nextInt(90000) + 10000; // Random number between 10000 and 99999

        // Combine 'C' and random number
        generatedEmpId = "E" + randomNumber;

        // Check if generated CustId already exists in the database
        boolean isUnique = false;
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {
            // Establish database connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/courierdeliverysystem");

            // Prepare SQL statement to check if CustId already exists
            String query = "SELECT * FROM employee WHERE EmployeeId = ?";
            statement = connection.prepareStatement(query);
            statement.setString(1, generatedEmpId);

            // Execute the query
            resultSet = statement.executeQuery();

            // Check if any row is returned
            if (!resultSet.next()) {
                // CustId is unique
                isUnique = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database resources
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        // If generated CustId is not unique, recursively call the method to generate a new one
        if (!isUnique) {
            generatedEmpId = generateRandomEmpId();
        }
        
        return generatedEmpId;
    }

    /**
     * @return the Account_type
     */
    public String getAccount_type() {
        return Account_type;
    }

    /**
     * @param Account_type the Account_type to set
     */
    public void setAccount_type(String Account_type) {
        this.Account_type = Account_type;
    }

}
