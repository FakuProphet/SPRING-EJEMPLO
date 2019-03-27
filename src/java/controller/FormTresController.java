
package controller;

import java.util.List;
import modelos.Conexion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class FormTresController {
    
    JdbcTemplate jdbcTemplate;

    public FormTresController() {
        
        Conexion c = new Conexion();
        jdbcTemplate = new JdbcTemplate(c.obtenerConexion());
        
    }
    
    
    
    
    @RequestMapping("formularioTres.htm")
    public ModelAndView formularioTres(){
        
        ModelAndView mav = new ModelAndView();
        String sql = "select * from turnoslab";
        List lista = jdbcTemplate.queryForList(sql);
        mav.setViewName("formularioTres");
        mav.addObject("listadoTurnos",lista);
        return mav;
    }
    
}
