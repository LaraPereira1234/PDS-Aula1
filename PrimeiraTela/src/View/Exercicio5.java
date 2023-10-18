package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Preco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPeso1;
	private JTextField txtQuilo;
	private JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5 frame = new Exercicio5();
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
	public Exercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 203);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreco = new JLabel("Preço:");
		lblPreco.setForeground(new Color(255, 0, 51));
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreco.setBounds(93, 30, 46, 14);
		contentPane.add(lblPreco);
		
		txtPeso1 = new JTextField();
		txtPeso1.setBounds(149, 28, 86, 20);
		contentPane.add(txtPeso1);
		txtPeso1.setColumns(10);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setForeground(new Color(255, 51, 51));
		lblPeso.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPeso.setBounds(93, 71, 46, 14);
		contentPane.add(lblPeso);
		
		txtQuilo = new JTextField();
		txtQuilo.setBounds(149, 69, 86, 20);
		contentPane.add(txtQuilo);
		txtQuilo.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPeso1.getText();
				float PrecoQuilo = Float.valueOf(txtQuilo.getText());
				float peso = Float.valueOf(txtPeso1.getText());
				Preco p = new Preco();
				float preco = p.CalcularPreco(PrecoQuilo, peso);
				JOptionPane.showMessageDialog(null, "O valor a pagar é R$" + String.format("%.2f", preco));
			}
		});
		btnCalcular.setBounds(123, 103, 89, 23);
		contentPane.add(btnCalcular);
		
		
	}

}
