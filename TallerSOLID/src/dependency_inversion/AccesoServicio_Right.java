
package dependency_inversion;

public class AccesoServicio_Right {
     private Conexion_Right conexion;

    public AccesoServicio_Right(Conexion_Right conexion){
        this.conexion = conexion;
    }

    public Beneficios getDatos(){
        conexion.getBenecios();
        //retorna beneficios del servicio escogido
        return null;
    }
    
}
