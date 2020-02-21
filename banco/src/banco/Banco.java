/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author estudiantes
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner (System.in);
        
        
        
        
        System.out.println("Seleccione el medio para retirar");
        System.out.println("1) Tarjeta");
        System.out.println("2) Celular");
        
        
        String opcion=in.next();
        int op= Integer.parseInt(opcion);
        
        String monto;
        int montot;
        Proxy ret= new Proxy();
        
        switch (op){
            case 1:
                System.out.println("digite su pin");
                String pin=in.next();
                System.out.println(ret.logear(pin));
                System.out.println("digite la cantidad a retirar");
                monto=in.next();
                montot=Integer.parseInt(monto);
                System.out.println(ret.retirar(montot));
                break;
            case 2:
                System.out.println("digite su numero celular");
                String cel=in.next();
                System.out.println("digite su codigo");
                String cod=in.next();
                System.out.println(ret.logear(cel, cod));
                System.out.println("digite la cantidad a retirar");
                monto=in.next();
                montot=Integer.parseInt(monto);
                System.out.println(ret.retirarcel(montot));
                break;
            default:
                break;
        }
        
        
        
    }
    
    
}
