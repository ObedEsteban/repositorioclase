import padre.Empleado;

public class Main {

    public static void main(String[] args) {
        Empleado em = new Empleado();

        // Using constructor to initialize properties
        em.setNombre("juan");
        em.setSueldo(3500);

        System.out.println("Nombre = " + em.getNombre());
        System.out.println("Sueldo = " + em.getSueldo());

        em.setNombre("homero");
        System.out.println("Nombre = " + em.getNombre());
    }
}
