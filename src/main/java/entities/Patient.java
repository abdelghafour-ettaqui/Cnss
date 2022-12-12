package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.Collection;
import java.util.List;

@Entity
public class Patient extends User {

    @OneToMany(mappedBy = "patient")
    private List<Dossier> dossiers;

    public List<Dossier> getDossiers() {
        return dossiers;
    }

    public void setDossiers(List<Dossier> dossiers) {
        this.dossiers = dossiers;
    }

    public Patient(){

    }
    public Patient(long iduser, String fullname, String email, String password, String role)  {
        super( iduser,fullname,email, password,role);

    }
}
