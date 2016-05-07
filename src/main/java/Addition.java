import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addition extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addition frame = new Addition();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Addition() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber = new JLabel("Numero 1");
		lblNumber.setBounds(56, -26, 71, 88);
		contentPane.add(lblNumber);
		
		textField = new JTextField();
		textField.setBounds(121, 5, 141, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumber_1 = new JLabel("Numero 2");
		lblNumber_1.setBounds(56, 29, 65, 88);
		contentPane.add(lblNumber_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(121, 60, 141, 26);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(121, 128, 179, 88);
		contentPane.add(resultado);
		
		JPanel panel = new JPanel();
		panel.setBounds(145, 99, 86, 33);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Soma");
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero1 = Integer.valueOf(textField.getText());
				int numero2 = Integer.valueOf(textField_1.getText());
				int soma = numero1 + numero2;
				resultado.setText("Resultado: " + soma);
				JOptionPane.showMessageDialog(null, "A soma é " + soma);
			}
		});
	}

}