package entities;

import jakarta.persistence.*;

@Entity
public class Medicament {
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idmedicament")
    private String idmedicament;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "ref")
    private String ref;
    @Basic
    @Column(name = "remboursement")
    private double remboursement;

}
