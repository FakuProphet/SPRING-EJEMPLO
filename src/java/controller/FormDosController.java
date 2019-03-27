
package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import modelos.Afiliado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("formularioDos.htm")
public class FormDosController {
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView  formulario()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("formularioDos");
        mav.addObject("afiliado", new Afiliado());
        return mav;
    }
    
    @ModelAttribute("listadoAreas")
    public Map<String,String>listadoAreas()
    {
        Map<String,String> l = new LinkedHashMap<>();
        l.put("1", "Argentina");
        l.put("2", "Venezuela");
        l.put("3", "Ecuador");
        l.put("4", "México");
        return l;
    }
    
}
