package pashtetpashtetovv.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import pashtetpashtetovv.utils.Role;

import java.util.*;

@Component
public class User implements Persistable<String>, UserDetails {

    private String email;

    @Id
    private String username;

    private String password;

    private Set<Role> roles = Collections.singleton(Role.USER);

    @Transient
    private boolean isNew;

    public User() {}

    public User(String email, String name, String password, Set<Role> roles) {
        this.email = email;
        this.username = name;
        this.password = password;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return roles.stream().map(role->{
            return new SimpleGrantedAuthority(role.name());
        }).toList();
        //return Collections.singleton(new SimpleGrantedAuthority(role.name()));
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRole() {
        return roles;
    }

    public void setRole(Set<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getId() {
        return username;
    }

    @Override
    @Transient
    public boolean isNew() {
        return this.isNew;
    }

    public User setAsNew(){
        this.isNew = true;
        return this;
    }
}
