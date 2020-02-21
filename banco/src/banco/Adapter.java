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
public class Adapter extends CajeroReal{

    CajeroReal cr;
    boolean ver;
    
    
    Adapter(){
        super();
        this.cr= new CajeroReal();
    }

    public String login(String cel, String cod){
        ver=true;
        return cr.logear("0");
        
    }
    
    public String retirar(int monto){
        if(ver==true)
            return cr.retirar(monto);
        else
            return "invalido";
        
    }
}
