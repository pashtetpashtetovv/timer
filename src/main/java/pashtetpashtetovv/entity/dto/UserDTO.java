package pashtetpashtetovv.entity.dto;

import pashtetpashtetovv.utils.Role;

import java.util.Set;

public class UserDTO {

    private String email;

    private String username;

    private Set<Role> role;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }
}
