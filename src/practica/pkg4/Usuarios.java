
package practica.pkg4;

public class Usuarios {
    private String Nombre;
    private String Apellido;
    private int id;

    public Usuarios(String Nombre, String Apellido, int id) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
