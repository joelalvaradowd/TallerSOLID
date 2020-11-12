/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DIP;

/**
 *
 * @author rpale
 */
public class AccederServicio_error {
     private ServicioAgua_error servicioAgua;
     

    public AccederServicio_error(ServicioAgua_error servicio){
        this.servicioAgua = servicio;
    }

    public Beneficios getBeneficios(){
        servicioAgua.getServicioAgua();
        //...
         return null;
        
    }
    
    
}
