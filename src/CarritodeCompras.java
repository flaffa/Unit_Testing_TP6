public class CarritodeCompras {

    private float precio;
    private String detalle;
    private int cantidad;
    private String nombre;
    private float preciototal;

    public CarritodeCompras(float precio, String detalle, int cantidad, String nombre, float preciototal) {
        this.precio = precio;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.preciototal = preciototal;
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

    public float modificar_precio (int precio, float preciototal, String nombre, int cantidad){
        float totalcalculado = cantidad * precio;
        preciototal = totalcalculado;
        System.out.println("El precio total es: "+ preciototal);
        return preciototal;
    }
}
