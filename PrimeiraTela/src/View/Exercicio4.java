package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Gasolina;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Exercicio4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtGasolina;
	private JTextField txtPagamento;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4 frame = new Exercicio4();
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
	public Exercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 198);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPrecoGasolina = new JLabel("Preço da Gasolina:");
		lblPrecoGasolina.setForeground(new Color(51, 204, 0));
		lblPrecoGasolina.setBackground(new Color(0, 153, 51));
		lblPrecoGasolina.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecoGasolina.setBounds(81, 22, 132, 14);
		contentPane.add(lblPrecoGasolina);
		
		txtGasolina = new JTextField();
		txtGasolina.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtGasolina.setBounds(213, 20, 86, 20);
		contentPane.add(txtGasolina);
		txtGasolina.setColumns(10);
		
		JLabel lblPagamento = new JLabel("Pagamento:");
		lblPagamento.setForeground(new Color(51, 204, 0));
		lblPagamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPagamento.setBounds(117, 58, 86, 14);
		contentPane.add(lblPagamento);
		
		txtPagamento = new JTextField();
		txtPagamento.setBounds(213, 56, 86, 20);
		contentPane.add(txtPagamento);
		txtPagamento.setColumns(10);
		
		
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(new Color(0, 0, 0));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String precoStr = txtGasolina.getText();
				Float preco = Float.valueOf(precoStr);
				String pagamentoStr = txtPagamento.getText();
				Float pagamento = Float.valueOf(pagamentoStr);
				Gasolina gasolina = new Gasolina();
				Float litro =  gasolina.CalcularLitro(preco, pagamento);
				JOptionPane.showMessageDialog(null, "Será possível colocar " + String.format("%.2f", litro) + " litros de combustível");
			}
		});
		btnCalcular.setBounds(160, 87, 101, 23);
		contentPane.add(btnCalcular);
	}

}
