package logica;
import exceptions.*;

public class Parcial {

    public String solucionEcuacion(int a, int b, int c) throws CoeficienteCuadraticoCeroException, RaicesComplejasException 
    {
        if (a == 0) {
            throw new CoeficienteCuadraticoCeroException();
        }

        double discriminante = (double) b*b - 4.0 * a * c;

        if (discriminante < 0) {
            throw new RaicesComplejasException(discriminante);
        }

        double raiz = Math.sqrt(discriminante);
        double x1 = (-b + raiz) / (2.0 * a);
        double x2 = (-b - raiz) / (2.0 * a);

        return "x1 = " + x1 + ", x2 = " + x2;
    }
}