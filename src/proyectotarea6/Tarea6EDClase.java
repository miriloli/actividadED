
package proyectotarea6;

/**
 *
 * @author Miriam
 */
public class Tarea6EDClase {
    static final int NUMERO_PRODUCTOS_MINIMOS_PARA_DESCUENTO = 3;
    static final int DESCUENTO = 5;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;

        if (numProductos > NUMERO_PRODUCTOS_MINIMOS_PARA_DESCUENTO) {
            precioProducto -= DESCUENTO;

            if (numProductos != 0) {
                total = calcularTotal(0.8, precioProducto);
                mensaje(total);
            } else {
                total = calcularTotal(0.95, precioProducto);
                mensaje(total);
            }
        }
    }

    public void mensaje(double total) {

        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }

    public double calcularTotal(double porcentaje, double precioProducto) {

        return precioProducto * porcentaje;
    }
    
}
