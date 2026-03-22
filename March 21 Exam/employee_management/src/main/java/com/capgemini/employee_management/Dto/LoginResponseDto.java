package com.capgemini.employee_management.Dto;

import com.capgemini.employee_management.model.EmpType;

public class LoginResponseDto {

    private int id;
    private String name;
    private String email;
    private EmpType role;
    private String message;

    public LoginResponseDto() {
    }

    public LoginResponseDto(int id, String name, String email, EmpType role, String message) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmpType getRole() {
        return role;
    }

    public void setRole(EmpType role) {
        this.role = role;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}