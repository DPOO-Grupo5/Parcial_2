package exceptions;

public class RaicesComplejasException extends Exception 
{
    public RaicesComplejasException(double discriminante) 
    {
        super("El discriminante es " + discriminante + " (negativo): las raíces son complejas.");
    }
}