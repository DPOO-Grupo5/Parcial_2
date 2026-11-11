package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exceptions.CoeficienteCuadraticoCeroException;
import exceptions.RaicesComplejasException;
import logica.Parcial;

public class ParcialTests {

    private Parcial parcial;

    @BeforeEach
    void setUp() {
        parcial = new Parcial();
    }

    @Test
    void testSolucionEcuacion() throws Exception {
        assertEquals("x1 = 3.0, x2 = 2.0", parcial.solucionEcuacion(1, -5, 6), "El resultado no es el esperado.");
    }

    @Test
    void testCoeficienteCuadraticoCero() {
        assertThrows(CoeficienteCuadraticoCeroException.class, () -> parcial.solucionEcuacion(0, 1, 2),
                     "Debió lanzarse CoeficienteCuadraticoCeroException.");
    }

    @Test
    void testRaicesComplejas() {
        assertThrows(RaicesComplejasException.class, () -> parcial.solucionEcuacion(1, 0, 1),
                     "Debió lanzarse RaicesComplejasException.");
    }
}