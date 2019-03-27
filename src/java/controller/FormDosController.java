
package controller;

import java.util.LinkedHashMap;
import java.util.Map;
import modelos.Afiliado;
import modelos.AfiliadoValidar;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("formularioDos.htm")
public class FormDosController {
    
    AfiliadoValidar v;

    public FormDosController() {
        v= new AfiliadoValidar();
    }
    
    
    
    
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView  formulario()
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("formularioDos");
        mav.addObject("afiliado", new Afiliado());
        return mav;
    }
    
    //validar
     @RequestMapping(method=RequestMethod.POST)
    public ModelAndView  formulario(@ModelAttribute("afiliado") Afiliado a,BindingResult result, SessionStatus status)
    {
       v.validate(a, result);
       if(result.hasErrors())
       {
           //volvemos al formulario , los datos no son correctos.
            ModelAndView mav = new ModelAndView();
            mav.setViewName("formularioDos");
            mav.addObject("afiliado", new Afiliado());
            return mav;
       }
       else
       {
           //aca cuando no se ejecuto el validator.
            ModelAndView mav = new ModelAndView();
            mav.setViewName("salida");
            mav.addObject("sueldo", a.getSueldo() );
            mav.addObject("dni", a.getDni() );
            mav.addObject("codAfiliado", a.getCodAfiliado() );
            mav.addObject("area", a.getArea());
            return mav;
       }
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
