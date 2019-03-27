
package modelos;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class AfiliadoValidar implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        //la clase que queremos validar
        
        return Afiliado.class.isAssignableFrom(type);
       // return Afiliado.class.isAssignableFrom(tuClase);
        
    }

    @Override
    public void validate(Object o, Errors errors) {
         
        Afiliado a =  (Afiliado) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"dni","required.dni","El campo dni esta vacio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"codAfiliado","required.codAfiliado","El campo código afiliado esta vacio.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"sueldo","required.sueldo","El campo sueldo esta vacio.");
       
      
    }
    
}
