package com.cs304project.MotorTraffic.dto;

public class LoginRequestDTO {
    private String nic;
    private String password;

    public LoginRequestDTO(String nic, String password) {
        this.nic = nic;
        this.password = password;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}