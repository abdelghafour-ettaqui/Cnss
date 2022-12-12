package Services;

import Dao.UserDao;
import entities.User;

public class LoginService {
    public boolean login(String email,String password){

        UserDao users = new UserDao();

        User user = users.validate(email,password);

        if(!user.equals(null)){
            return true;
        }
        return false;
    }
}
