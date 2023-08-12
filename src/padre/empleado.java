package padre;

class Empleado {

    private String nombre;
    private double sueldo;
    public String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("homero")) {
            this.nombre = "nohomeros";
        } else {
            this.nombre = nombre;
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
