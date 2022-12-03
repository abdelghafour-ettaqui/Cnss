package Controllers;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import Services.LoginService;

import java.net.http.HttpRequest;


@Controller
@RequestMapping("/login")

public class Login {

    @PostMapping("/Ulogin")
    public ModelAndView login( @RequestParam("email") String email, @RequestParam("password") String password, @RequestParam("role") String role,HttpServletRequest request, HttpServletResponse response){

      LoginService login = new LoginService();

      boolean flag= login.login(email,password,role);

      if(flag){
        System.out.println("I'm logged in");
      }

      ModelAndView mv =new ModelAndView();
      mv.setViewName("index");
//      mv.addObject()
      return mv;

  }


}
