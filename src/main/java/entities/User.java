package entities;

import jakarta.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    @Column(name="iduser")
    private long iduser;
    @Basic
    @Column(name="fullname")
    private String fullname;
    @Basic
    @Column(name="email")
    private String email;
    @Basic
    @Column(name="password")
    private String password;
    @Basic
    @Column(name="role")
    private String role;




    public long getIduser() {
        return iduser;
    }

    public void setIduser(long iduser) {
        this.iduser = iduser;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
