public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", 5000.0);
        Empleado empleado2 = new Empleado("María", "Gómez", 6000.0);

        System.out.println("Salario anual de " + empleado1.obtenerPrimerNombre() + ": $" + empleado1.calcularSalarioAnual());
        System.out.println("Salario anual de " + empleado2.obtenerPrimerNombre() + ": $" + empleado2.calcularSalarioAnual());

        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual() * 1.10);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual() * 1.10);

        System.out.println("Nuevo salario anual de " + empleado1.obtenerPrimerNombre() + ": $" + empleado1.calcularSalarioAnual());
        System.out.println("Nuevo salario anual de " + empleado2.obtenerPrimerNombre() + ": $" + empleado2.calcularSalarioAnual());
    }
}
