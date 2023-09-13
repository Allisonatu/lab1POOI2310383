public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0;
        }
    }

        // Método para establecer el primer nombre
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    // Método para obtener el primer nombre
    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    // Método para establecer el apellido paterno
    public void establecerApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    // Método para obtener el apellido paterno
    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    // Método para establecer el salario mensual
    public void establecerSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0; // Opcional: establecer salario en cero si no es positivo
        }
    }

    // Método para obtener el salario mensual
    public double obtenerSalarioMensual() {
        return salarioMensual;
    }

    // Método para calcular el salario anual
    public double calcularSalarioAnual() {
        return salarioMensual * 12;
    }
    
   
}
