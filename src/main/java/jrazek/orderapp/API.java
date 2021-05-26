package jrazek.orderapp;

import jrazek.orderapp.model.User;
import jrazek.orderapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class API {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    String loginForm(@RequestParam("login") String login, @RequestParam("password") String password){
        if(!login.equals("") && !password.equals("")){
            List<User> userList = userRepository.getByFirstAndLastName(login, password);
            if(userList.isEmpty()){
                return "-1";
            }
            return "1";
        }
        return "0";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    String registerForm(
                @RequestParam("login") String login,
                @RequestParam("fName") String fName,
                @RequestParam("lName") String lName,
                @RequestParam("password") String password,
                @RequestParam("email") String email){

        return "0";
    }
}
