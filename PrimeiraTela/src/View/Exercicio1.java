package View;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.ConversaoTemperatura;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDigitar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 frame = new Exercicio1();
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
	public Exercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 208);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTemperatura = new JLabel("TEMPERATURA (F):");
		lblTemperatura.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblTemperatura.setBounds(72, 52, 121, 14);
		contentPane.add(lblTemperatura);
		
		txtDigitar = new JTextField();
		txtDigitar.setBounds(203, 46, 86, 28);
		contentPane.add(txtDigitar);
		txtDigitar.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Pegar a temperatura digitada no componente de texto 
				String tempDigitar = txtDigitar.getText();
				//Converter a temp de string -> float 
				float tempConvertidaF = Float.valueOf(tempDigitar);
				// Criar objeto da class ConversaoTemperatura 
				ConversaoTemperatura conv = new ConversaoTemperatura();				
				// Chamar método conversao
				float tempC = conv.converterFtoC(tempConvertidaF);
				// Mostrar Temperatura convertida
				JOptionPane.showMessageDialog(null, "Temperatura convertida: "+tempC);
			}
		});
		btnCalcular.setBackground(Color.GREEN);
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalcular.setBounds(131, 96, 96, 23);
		contentPane.add(btnCalcular);
	}

}
