package com.getarrays.employeemanager.Exception;

//created an exception class to handle the exception
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {

        super(message);
    }
}
