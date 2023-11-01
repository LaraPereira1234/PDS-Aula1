package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Janela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela1 frame = new Janela1();
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
	public Janela1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBase.setBounds(41, 11, 46, 14);
		contentPane.add(lblBase);
		
		txtBase = new JTextField();
		txtBase.setBounds(41, 30, 86, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAltura.setBounds(164, 12, 46, 14);
		contentPane.add(lblAltura);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(164, 30, 86, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		rdbtnArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnArea.setBounds(52, 71, 78, 23);
		contentPane.add(rdbtnArea);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnPerimetro.setBounds(141, 71, 109, 23);
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblArea = new JLabel("");
		lblArea.setBounds(41, 104, 73, 14);
		contentPane.add(lblArea);
		
		JLabel lblPerimetro = new JLabel("");
		lblPerimetro.setBounds(151, 104, 73, 14);
		contentPane.add(lblPerimetro);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(10, 140, 89, 23);
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLimpar.setBounds(99, 140, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFechar.setBounds(187, 140, 89, 23);
		contentPane.add(btnFechar);
	}
}
