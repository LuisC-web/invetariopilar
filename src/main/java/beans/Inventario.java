package beans;

import java.sql.Date;

public class Inventario {
    private int id;
    private String username;
    private Date fecha;
    private int cantidad_producto;
    private String movimiento;
    private Double precio_unitario;
    private Double precio_total;
    private String proveedor;

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", cantidad_producto=" + cantidad_producto + ", movimiento=" + movimiento + ", precio_unitario=" + precio_unitario + ", precio_total=" + precio_total + ", proveedor=" + proveedor + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public Double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(Double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public Double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(Double precio_total) {
        this.precio_total = precio_total;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Inventario(int id, String username, Date fecha, int cantidad_producto, String movimiento, Double precio_unitario, Double precio_total, String proveedor) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.cantidad_producto = cantidad_producto;
        this.movimiento = movimiento;
        this.precio_unitario = precio_unitario;
        this.precio_total = precio_total;
        this.proveedor = proveedor;
    }


}
