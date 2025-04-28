
package ema.ejerciciointegradorpoo4;

public class EjercicioIntegradorPOO4 {

    public static void main(String[] args) {
        Empresa emp = new Empresa();

        emp.agregarEmpleado(new EmpleadoSalarioFijo("41253640", "Walter", "Lopez", 2022, 700000));
        emp.agregarEmpleado(new EmpleadoAComision("20810223", "Oscar", "Cortez", 2021, 150000, 30, 30000));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("42251640", "Ale", "Gelez", 2024,650000));
        emp.agregarEmpleado(new EmpleadoAComision("14657984", "Leo", "Guirin", 2018, 120000, 20, 50000));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("50321574", "Daniela", "Perez", 2019, 850000));

        emp.mostrarSalarios();
        System.out.println("-------------------------------");
        emp.empleadoConMasClientes();
    }
}


