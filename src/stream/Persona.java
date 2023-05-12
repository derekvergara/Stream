
package stream;

public class Persona implements Comparable<Persona> {
    
    private String Nombre;
    private String Apellido1;
    private String Apellido2;

    public Persona() {
    }

    public Persona(String Nombre, String Apellido1, String Apellido2) {
        this.Nombre = Nombre;
        this.Apellido1 = Apellido1;
        this.Apellido2 = Apellido2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido1=" + Apellido1 + ", Apellido2=" + Apellido2 + '}';
    }
    
    @Override
    public int compareTo(Persona o) {
        int comapareInt = this.Nombre.compareTo(o.Nombre);
        if (comapareInt < 0) return 1;
        if (comapareInt > 0) return -1;
        return 0;
    }
}
