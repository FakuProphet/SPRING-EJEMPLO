
package controller;

import modelos.Afiliado;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class FormController {
    
    @RequestMapping(value="formulario.htm",method=RequestMethod.GET)
    public ModelAndView formulario()
    {
        return new ModelAndView("formulario","command" ,new Afiliado());
    }
    
    
    @RequestMapping(value="formulario.htm",method=RequestMethod.POST)
    /*clase ModelMap permite procesar el mapeo de clases*/
    public String formulario(Afiliado a,ModelMap modelo)
    {
        modelo.addAttribute("codAfiliado",a.getCodAfiliado());
        modelo.addAttribute("dni",a.getDni());
        modelo.addAttribute("sueldo",a.getSueldo());
        modelo.addAttribute("area",a.getArea());
        
        return "salida";
    }
    
}
