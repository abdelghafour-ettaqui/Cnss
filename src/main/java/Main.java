import entities.Agent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Agent agent= new Agent();
        agent.setFullname("hellooooSouma");
        entityManager.getTransaction().begin();
        entityManager.persist(agent);
        entityManager.getTransaction().commit();
    }
}
