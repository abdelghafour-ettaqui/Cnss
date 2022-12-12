package Dao;

import Config.JPA;
import entities.Dossier;
import jakarta.persistence.Query;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;

@Component
public class DossierDao implements DaoI<Dossier> {
    @Override
    public Dossier get(long id) {
        return JPA.entityManager().find(Dossier.class,id);

    }

    @Override
    public List<Dossier> getAll() {
        return null;
    }
    public List<Dossier> getAll(long id) {
        Query query = JPA.entityManager().createQuery("SELECT d FROM Dossier d where d.agent.iduser = :id AND d.status=:status").setParameter("id",id).setParameter("status","pending");
        return query.getResultList();
    }

    @Override
    public void save(Dossier dossier) {
        JPA.wrap(entityManager -> entityManager.persist(dossier));
    }

    @Override
    public void update(Dossier dossier) {
        JPA.wrap(entityManager -> entityManager.merge(dossier));
    }

    @Override
    public void delete(long id) throws SQLException {

    }
}
