package Dao;

import Config.JPA;
import entities.Dossier;
import entities.Medicament;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;


@Component
public class MedicamentDao implements DaoI <Medicament>{
    @Override
    public Medicament get(long id) {
        return JPA.entityManager().find(Medicament.class,id);
    }

    @Override
    public List<Medicament> getAll() {
        Query query = JPA.entityManager().createQuery("SELECT p FROM Medicament p");
        return query.getResultList();
    }

    @Override
    public void save(Medicament medicament) {

    }

    @Override
    public void update(Medicament medicament) {

    }

    @Override
    public void delete(long id) throws SQLException {

    }
}
