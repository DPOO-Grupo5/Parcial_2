package exceptions;

public class CoeficienteCuadraticoCeroException extends Exception 
{
    public CoeficienteCuadraticoCeroException() 
    {
        super("El coeficiente a no puede ser 0: la ecuación no es de segundo orden.");
    }
}