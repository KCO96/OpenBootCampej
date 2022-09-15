public class Main {
    public static void main(String[] args) {
      Persona persona1 = new Persona();
      persona1.setNombre("Maria");
      persona1.setEdad(24);
      persona1.setTelefono(666555222);

        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());

    }
}

class Persona {
    private int edad;
    private String Nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getTelefono() {
        return telefono;
    }
}