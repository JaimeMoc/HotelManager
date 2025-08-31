public class Habitacion {
    // Declaración de atributos.
    private int idHabitacion;
    private String numero;
    private String tipo;
    private double precio;

    // constructor vacio
    public Habitacion(){}

    // Constructor con todos los campos
    public Habitacion(int idHabitacion, String numero, String tipo, double precio) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    // Getters y setters
    public int getIdHabitacion() { return idHabitacion;}
    public void setIdHabitacion(int idHabitacion) { this.idHabitacion = idHabitacion;}

    public String getNumero() { return numero;}
    public void setNumero(String numero) { this.numero = numero;}

    public String getTipo() { return tipo;}
    public void setTipo(String tipo) { this.tipo = tipo;}

    public double getPrecio() { return precio;}
    public void setPrecio(double precio) { this.precio = precio;}

    // ToString
    @Overide
    public String toString() {
        return "Habitacion{" +
                "idHabitacion=" + idHabitacion +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }
}