package beans;

public class Perfume {
    private int id;
    private String nombre_perfume;
    private String fragancia;
    private String marca;
    private String genero;
    private int cantidad;

    public Perfume(int id, String nombre_perfume, String fragancia, String marca, String genero, int cantidad) {
        this.id = id;
        this.nombre_perfume = nombre_perfume;
        this.fragancia = fragancia;
        this.marca = marca;
        this.genero = genero;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_perfume() {
        return nombre_perfume;
    }

    public void setNombre_perfume(String nombre_perfume) {
        this.nombre_perfume = nombre_perfume;
    }

    public String getFragancia() {
        return fragancia;
    }

    public void setFragancia(String fragancia) {
        this.fragancia = fragancia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Perfume{" + "id=" + id + ", nombre_perfume=" + nombre_perfume + ", fragancia=" + fragancia + ", marca=" + marca + ", genero=" + genero + ", cantidad=" + cantidad + '}';
    }


}

