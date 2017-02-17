/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

public class empleado {

    float sueldoBa;
    float horasEx;
    float vent;
    String tipoEmp;

    public empleado() {
    }
   


    public empleado(String tipoEmpleado, float sueldoBase, float horasExtras, float ventas) {
        tipoEmp = tipoEmpleado;
        sueldoBa = sueldoBase;
        horasEx = horasExtras;
        vent = ventas;
    }



  
    
    public float calcularSueldoBruto() {
        float sueldoBru;
        
        if (vent > 1500) {
            sueldoBru = sueldoBa + 100;
        } else {
            sueldoBru = sueldoBa;
        }
        
       return sueldoBru;
    }
    

    public float calcularSueldoNeto(float sueldoBru) {
        float sueldoNe;
        if (sueldoBru < 1000) {
            sueldoNe = sueldoBru;
        } else if (sueldoBru<1500){
            sueldoNe=(float)(sueldoBru*0.84);
        }
        else{
           sueldoNe=(float)(sueldoBru*0.82); 
        }
        return sueldoNe;
    }

}
