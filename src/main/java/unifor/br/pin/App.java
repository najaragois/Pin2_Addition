package unifor.br.pin;

import javax.print.attribute.standard.JobOriginatingUserName;
import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
    	String firstnumber =
    			JOptionPane.showInputDialog("Enter first number");
        String secondnumber = 
        		JOptionPane.showInputDialog("Enter second number");
        int number1 = Integer.parseInt(firstnumber);
        int number2 = Integer.parseInt(secondnumber);
        int sum = number1 + number2;
        	JOptionPane.showMessageDialog(null, "The sum is " + sum);
    }
}
