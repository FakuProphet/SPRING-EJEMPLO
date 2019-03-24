
package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
    
    
    /*este metodo es de una vista*/
    /*recibe parametros para especificar como acceder por url*/
    @RequestMapping("home.htm")
    public ModelAndView home(){
        /*metodo de vista */
        /*
            la clase ModelAndView permite renderizar
            vistas como servlet al estilo screen.
        */
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home");
        return mav;
    }
    
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros(){
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nosotros");
        return mav;
    }
    
}
