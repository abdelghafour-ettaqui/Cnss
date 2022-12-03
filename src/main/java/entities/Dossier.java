package entities;


import jakarta.persistence.*;

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
}
