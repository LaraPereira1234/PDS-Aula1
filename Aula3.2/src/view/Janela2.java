package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Janela2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroN;
	private JTextField txtSegundoN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela2 frame = new Janela2();
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
	public Janela2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 304, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrimeiroN = new JLabel("Primeiro número inteiro:");
		lblPrimeiroN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrimeiroN.setBounds(10, 11, 144, 14);
		contentPane.add(lblPrimeiroN);
		
		txtPrimeiroN = new JTextField();
		txtPrimeiroN.setBounds(156, 8, 117, 20);
		contentPane.add(txtPrimeiroN);
		txtPrimeiroN.setColumns(10);
		
		JLabel lblSegundoN = new JLabel("Segundo número inteiro:");
		lblSegundoN.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSegundoN.setBounds(10, 33, 139, 14);
		contentPane.add(lblSegundoN);
		
		txtSegundoN = new JTextField();
		txtSegundoN.setBounds(156, 30, 117, 20);
		contentPane.add(txtSegundoN);
		txtSegundoN.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		rdbtnAdicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnAdicao.setBounds(6, 54, 109, 23);
		contentPane.add(rdbtnAdicao);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		rdbtnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnSubtracao.setBounds(6, 80, 109, 23);
		contentPane.add(rdbtnSubtracao);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("x Multiplicação");
		rdbtnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnMultiplicacao.setBounds(6, 106, 109, 23);
		contentPane.add(rdbtnMultiplicacao);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		rdbtnDivisao.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnDivisao.setBounds(6, 132, 109, 23);
		contentPane.add(rdbtnDivisao);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(61, 162, 89, 23);
		contentPane.add(btnCalcular);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(160, 166, 80, 14);
		contentPane.add(lblResposta);
	}

}
