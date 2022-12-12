package entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String ref;
    private double remboursement;
    @ManyToMany(mappedBy = "medicament")
    private List<Dossier> dossier;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public double getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(double remboursement) {
        this.remboursement = remboursement;
    }

    public List<Dossier> getDossier() {
        return dossier;
    }

    public void setDossier(List<Dossier> dossier) {
        this.dossier = dossier;
    }
}
