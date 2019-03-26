
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
    
    
    /*este metodo es de una vista*/
    /*recibe parametros para especificar como acceder por url*/
    @RequestMapping("home.htm")
    public ModelAndView home(HttpServletRequest request){
        /*metodo de vista */
        /*
            la clase ModelAndView permite renderizar
            vistas como servlet al estilo screen.
        */
        ModelAndView mav = new ModelAndView();
        mav.setViewName("home/home");
       
        
        String  id  = request.getParameter("id");
        String  id2  = request.getParameter("id2");
        
        
            int suma = Integer.parseInt(id) + Integer.parseInt(id2);
            mav.addObject("id", id);
            mav.addObject("id2", id2);
            mav.addObject("suma", suma);
        
        return mav;
    }
    
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros(){
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("nosotros");
        return mav;
    }
    
}
