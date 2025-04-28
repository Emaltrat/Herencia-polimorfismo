package ema.ejerciciointegradorpoo4;

import java.util.ArrayList;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        this.empleados.add(e);
    }

    public void mostrarSalarios() {
        System.out.printf("%-15s %10s%n", "  Empleados", "Salario");
        System.out.println("-------------------------------");
        for (Empleado emp : empleados) {
            System.out.printf("%-15s $%,10.2f%n",emp.nombreCompleto() , emp.getSalario());
        }
    }

    public void empleadoConMasClientes() {
        int max = -1;
        Empleado elMayor = null;
        for (Empleado e : empleados) {
            if (e instanceof EmpleadoAComision) {
                EmpleadoAComision eac = (EmpleadoAComision) e;
                int cant = eac.getCantClientesCaptados();
                if (cant > max) {
                    max = cant;
                    elMayor = eac;
                }
            }
        }
        System.out.println("El empleado con mas clientes :"+elMayor.nombreCompleto());
      
    }
}
