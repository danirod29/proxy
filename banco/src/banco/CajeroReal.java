/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author estudiantes
 */
public class CajeroReal implements Cajero{

    
    boolean acceder;
    String respuesta;
    
    @Override
    public String logear(String pin) {
        acceder=true;
        respuesta="acceso confirmado";
        return respuesta;
    }

    @Override
    public String retirar(int monto) {
        if(acceder==true){
            respuesta="retiro exitoso";
        }
        return respuesta;
    }
    
    
    
    
}
