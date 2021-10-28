import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarritodeComprasTest {

    @Test //reduce la cantidad del producto en 1 y que la cantidad siga siendo mayor a 0
    void reducircantidadproducto(){
       CarritodeCompras C1 = new CarritodeCompras(1500, "Negro", 3,"Equipo_de_Musica",4500);

       assertEquals(2, C1.reducircantidad(3,1));
    }

    @Test //se aumenta la cantidad del producto en 1
    void aumentarcantidadproducto(){
        CarritodeCompras C1 = new CarritodeCompras(1500, "Negro", 3,"Equipo_de_Musica",4500);

        assertEquals(4, C1.aumentarcantidad(3,1));
    }

    @Test //se reduce la cantidad de un producto en 1 y se modifica el precio total
    void modificarprecioaldisminuircantidad(){
        CarritodeCompras C1 = new CarritodeCompras(1500, "Negro", 3,"Equipo_de_Musica", 4500);

        assertEquals(3000, C1.modificar_precio(1500, 4500,
                "Equipo de Musica", C1.reducircantidad(3,1)));
    }

    @Test //se aumenta el total del precio al aumentar el producto
    void modificarprecioalaumentarproducto(){
        CarritodeCompras C1 = new CarritodeCompras(1500, "Negro", 3,"Equipo_de_Musica", 4500);

        assertEquals(6000, C1.modificar_precio(1500, 4500, "Equipo de Musica",
                C1.aumentarcantidad(3,1)));
    }
}
