package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Calculadora;
import model.Retangulo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Janela2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrimeiroN;
	private JTextField txtSegundoN;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 360, 231);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblPrimeiroN = new JLabel("Primeiro número:");
		lblPrimeiroN.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblPrimeiroN);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		txtPrimeiroN = new JTextField();
		contentPane.add(txtPrimeiroN);
		txtPrimeiroN.setColumns(10);
		
		JLabel lblSegundoN = new JLabel("Segundo número:");
		lblSegundoN.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblSegundoN);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		txtSegundoN = new JTextField();
		contentPane.add(txtSegundoN);
		txtSegundoN.setColumns(10);
		
		JRadioButton rdbtnAdicao = new JRadioButton("+ Adição");
		buttonGroup.add(rdbtnAdicao);
		rdbtnAdicao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnAdicao);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JRadioButton rdbtnSubtracao = new JRadioButton("- Subtração");
		buttonGroup.add(rdbtnSubtracao);
		rdbtnSubtracao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnSubtracao);
		
		JLabel label_4 = new JLabel("");
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("");
		contentPane.add(label_5);
		
		JRadioButton rdbtnMultiplicacao = new JRadioButton("x Multiplicação");
		buttonGroup.add(rdbtnMultiplicacao);
		rdbtnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnMultiplicacao);
		
		JLabel label_6 = new JLabel("");
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("");
		contentPane.add(label_7);
		
		JRadioButton rdbtnDivisao = new JRadioButton("/ Divisão");
		buttonGroup.add(rdbtnDivisao);
		rdbtnDivisao.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnDivisao);
		
		JLabel label_8 = new JLabel("");
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("");
		contentPane.add(label_9);
		
		JLabel lblResposta = new JLabel("");
		contentPane.add(lblResposta);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int primeiro = Integer.valueOf(txtPrimeiroN.getText());
				int segundo = Integer.valueOf(txtSegundoN.getText());
				Calculadora calculo = new Calculadora();
				int adicao = calculo.calcAdicao(primeiro, segundo);
				int subtracao = calculo.calcSubtracao(primeiro, segundo);
				int multiplicacao = calculo.calcMultiplicacao(primeiro, segundo);
				int divisao = calculo.calcDivisao(primeiro, segundo);
				if(rdbtnAdicao.isSelected()) {
					lblResposta.setText("Resultado:"+adicao);
			    }
				else if(rdbtnSubtracao.isSelected()) {
					lblResposta.setText("Resultado:"+subtracao);
				}
				else if(rdbtnMultiplicacao.isSelected()) {
					lblResposta.setText("Resultado:"+multiplicacao);
				}
				else if(rdbtnDivisao.isSelected()) {
					lblResposta.setText("Resultado:"+divisao);
				}


			}
		});
		contentPane.add(btnCalcular);
		
		
		
	}
}
