public class Usuario {

    // Declaración de los atributos
    private int idUsuario;
    private String nombre;
    private String correo;
    private String contraseña;

    // Constructor vacio
    public Usuario() {}

    // Constructor con todos los campos.
    public Usuario(int idUsuario, String nombre, String correo, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int getIdUsuario() { return idUsuario;}
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario;}

    public String getNombre() { return nombre;}
    public void setNombre(String nombre) { this.nombre = nombre;}

    public String getCorreo() { return correo;}
    public void setCorreo(String correo) { this.correo = correo;}

    public String getContraseña() { return contraseña;}
    public void setContraseña(String contraseña) { this.contraseña = contraseña;}

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}