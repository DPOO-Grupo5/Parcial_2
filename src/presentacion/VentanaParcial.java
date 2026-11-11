package presentacion;

import java.awt.GridLayout;
import javax.swing.*;

import exceptions.CoeficienteCuadraticoCeroException;
import exceptions.RaicesComplejasException;
import logica.Parcial;

public class VentanaParcial extends JFrame 
{
    private JTextField txtA = new JTextField();
    private JTextField txtB = new JTextField();
    private JTextField txtC = new JTextField();
    private JButton btnCalcular = new JButton("Calcular");
    private JLabel lblResultado = new JLabel("");

    public VentanaParcial() 
    {
        setTitle("Yury Velasquez, Parcial 2");
        setLayout(new GridLayout(4, 2));
        
        add(new JLabel("a:", SwingConstants.CENTER));
        add(txtA);
        add(new JLabel("b:", SwingConstants.CENTER));
        add(txtB);
        add(new JLabel("c:", SwingConstants.CENTER));
        add(txtC);
        add(btnCalcular);
        add(lblResultado);

        btnCalcular.addActionListener(e -> {
            try {
            	int a = Integer.parseInt(txtA.getText());
            	int b = Integer.parseInt(txtB.getText());
            	int c = Integer.parseInt(txtC.getText());
            	
            	Parcial parcial = new Parcial();
            	String resultado = parcial.solucionEcuacion(a,b,c);
                
            	lblResultado.setText(resultado);
            } catch (NumberFormatException ex) {
                lblResultado.setText("a, b y c deben ser enteros");
            } catch (CoeficienteCuadraticoCeroException | RaicesComplejasException ex) {
                lblResultado.setText(ex.getMessage());
            }
        });
        
        setSize(320, 220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}