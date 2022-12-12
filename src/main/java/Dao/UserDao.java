package Dao;

import Config.JPA;
import entities.*;
import jakarta.persistence.Query;

import java.sql.SQLException;
import java.util.List;

public class UserDao implements DaoI<User> {

    @Override
    public User get(long id) {

        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(long id) throws SQLException {

    }


    public  User validate(String email, String password) {


        try {
            Query query = JPA.entityManager().createQuery("select a from entities.Agent a where a.email = :email ");
            query.setParameter("email", email);
            User user = (User) query.getSingleResult();


            System.out.println("------------------------------------------------------------ " + user.getFullname());

            if ( user.getPassword().equals(password)) {
                return user;
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
        return null;
    }


}
