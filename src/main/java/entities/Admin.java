package entities;


import jakarta.persistence.Entity;

import java.util.Collection;

@Entity
public class Admin extends User{
    public Admin() {
    }

    public Admin(long iduser, String fullname, String email, String password, String role)  {
        super( iduser,fullname,email, password,role);

    }


}
