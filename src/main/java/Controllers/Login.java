package Controllers;


import Dao.MedicamentDao;
import entities.Medicament;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import Services.LoginService;

import java.net.http.HttpRequest;


@Controller
@RequestMapping("/login")
public class Login {
    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/Ulogin")
    public ModelAndView login(@RequestParam("email") String email, @RequestParam("password") String password){

        System.out.println("login "+email + " "+password);

        ModelAndView mv =new ModelAndView();

        if(email == null || password == null ){

            mv.setViewName("login");
            return mv;
        }

      LoginService login = new LoginService();

      boolean flag = login.login(email,password);

      if(flag){
          MedicamentDao med = new MedicamentDao();
            mv.addObject("medicament",med.getAll());

        mv.setViewName("addFolder");
      }
      return mv;

  }


}
