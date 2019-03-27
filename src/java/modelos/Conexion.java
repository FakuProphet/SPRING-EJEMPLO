
package modelos;

import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class Conexion {
    
    /*esta libreria se puede usar en ambientes de servlets, sin usar spring*/
    public DriverManagerDataSource obtenerConexion()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/turnos?zeroDateTimeBehavior=convertToNull");
        ds.setUsername("root");
        ds.setPassword("");
        return ds;
    }
    
}
