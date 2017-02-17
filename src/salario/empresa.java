/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

public class empresa {
    empleado empleado1;
    empleado empleado2;
    

public empresa() {
        empleado1 = new empleado("Encargado",1500,20,250);
        empleado2 = new empleado("Vendedor",800,15,2000);

    }


    public empleado getEmpleado1() {
        return empleado1;
    }

    public empleado getEmpleado2() {
        return empleado2;
    }
    public void pedirInforme(){
       
      
        System.out.println("Sueldo del encargado:   sueldo base:"+empleado1.sueldoBa+"    sueldo bruto:   "+empleado1.calcularSueldoBruto()+"    sueldo neto:   "+empleado1.calcularSueldoNeto(empleado1.calcularSueldoBruto()));
        System.out.println("Sueldo del vendedor:    sueldo base:"+empleado2.sueldoBa+"    sueldo bruto:   "+empleado2.calcularSueldoBruto()+"    sueldo neto:   "+empleado2.calcularSueldoNeto(empleado2.calcularSueldoBruto()));
    }

}