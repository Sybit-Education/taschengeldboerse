package com.sybit.education.taschengeldboerse.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created by stl on 11.06.2015.
 */
@Entity(name = "user")
public class User implements Serializable {

    @Size(min = 5, message = "Bitte E-Mail angeben")
    @Column(unique = true)
    @Id
    private String email;

    @Basic
    @NotNull
    private String authority;

    @Basic
    @Size(min = 3, message = "Dein \"Passwort\" ist zu kurz")
    private String password;

    @Basic
    private boolean enabled;

    public User() {

    }

    public User(String email, String password) {

        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = encodePassword(password);
    }

    public String encodePassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

        public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
