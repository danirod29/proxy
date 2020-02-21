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
public class Proxy implements Cajero{
    
    CajeroReal cr;
    Adapter cl;
    
    @Override
    public String logear(String pin) {
        if(cr==null)
            cr=new CajeroReal();
        return cr.logear(pin);
    }

    @Override
    public String retirar(int monto) {
        if(cr==null)
            cr=new CajeroReal();
        return cr.retirar(monto);
    }
    
    public String logear(String cel,String cod) {
        if(cl==null)
            cl=new Adapter();
        return cl.login(cel, cod);
    }
    
    public String retirarcel(int monto){
        if(cl==null)
            cl=new Adapter();
        return cl.retirar(monto);
    }

    
    
    
}
