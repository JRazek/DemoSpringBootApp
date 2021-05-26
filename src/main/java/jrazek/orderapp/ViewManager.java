package jrazek.orderapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ViewManager {
    ViewManager(){
        System.out.println("created ViewManager...");
    }
    @RequestMapping(value = "/")
    ModelAndView home(HttpServletRequest request){
        System.out.println("mapping in home()");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("jsp/home.jsp");
        return mv;
    }
}
