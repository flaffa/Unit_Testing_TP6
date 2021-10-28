public class CarritodeCompras {

    private float precio;
    private String detalle;
    private int cantidad;
    private String nombre;

    public CarritodeCompras(float precio, String detalle, int cantidad, String nombre) {
        this.precio = precio;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int reducircantidad (int cantidad, int c){
        int d = cantidad;
        if (d-c == 0){
            System.out.println("Producto Eliminado");
        }else d = d - c;
        return d;
    }

    public int aumentarcantidad (int cantidad, int c){
        int d = cantidad;
        d = d + c;
        return d;
    }
}
