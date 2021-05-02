package CalculoDeBonificacion;
public class Trabajador {
    
    String cliente, estado;
    int sueldo;
    
//                      Constructor

    public Trabajador(String cliente, String estado, int sueldo) {
        this.cliente = cliente;
        this.estado = estado;
        this.sueldo = sueldo;
    }

 
   
//                  Fin constructor
 
    public double bonificacion_estado_civil(){
        if (estado.equalsIgnoreCase("Soltero")) {
            return 100;
        }
        if (estado.equalsIgnoreCase("Casado")) {
            return 150;
        }
 
        return 0;
    }
    public double aumento_sueldo(){
        if (sueldo > 0 && sueldo <= 1500) {
            return  (sueldo*20)/100;
        }
        if (sueldo >= 1501 && sueldo <= 3000) {
            return  (sueldo*10)/100;
        }
        if (sueldo >= 3001 && sueldo <= 6000) {
            return  (sueldo*5)/100;
        }
        return 0;
    }
    public double suelto_total(){
        
        return sueldo + aumento_sueldo()+ bonificacion_estado_civil();
    }
 

  
    
}
