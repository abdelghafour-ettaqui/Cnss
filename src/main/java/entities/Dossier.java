package entities;


import jakarta.persistence.*;

import java.util.Collection;
import java.util.List;

@Entity
public class Dossier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddossier")
    private long iddossier;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name="remboursement")
    private double remboursement;
    @Basic
    @Column(name = "description")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPatient" , referencedColumnName = "iduser")
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAgent" , referencedColumnName = "iduser")
    private Agent agent;


//    @JoinTable(
//            name = "patient_medicament",
//            joinColumns = @JoinColumn(name = "iddossier", referencedColumnName = "iddossier"),
//            inverseJoinColumns = @JoinColumn(name = "idmedicament", referencedColumnName = "idmedicament")
//    )
    @ManyToMany
    @JoinColumn(name = "idmedicament",referencedColumnName ="idmedicament")
    private List<Medicament> medicament;

    public long getIddossier() {
        return iddossier;
    }

    public void setIddossier(long iddossier) {
        this.iddossier = iddossier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(double remboursement) {
        this.remboursement = remboursement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public List<Medicament> getMedicament() {
        return medicament;
    }

    public void setMedicament(List<Medicament> medicament) {
        this.medicament = medicament;
    }
}
