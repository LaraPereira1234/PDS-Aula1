package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Retangulo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3 extends JFrame {

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
					Exercicio3 frame = new Exercicio3();
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
	public Exercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 391, 269);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAltura.setBounds(97, 60, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBase.setBounds(97, 26, 46, 14);
		contentPane.add(lblBase);
		
		txtBase = new JTextField();
		txtBase.setBounds(166, 24, 114, 20);
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		txtAltura = new JTextField();
		txtAltura.setBounds(166, 58, 114, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JLabel lblResultadoPerimetro = new JLabel("");
		lblResultadoPerimetro.setBounds(134, 174, 57, 14);
		contentPane.add(lblResultadoPerimetro);
		
		JLabel lblResultadoArea = new JLabel("");
		lblResultadoArea.setBounds(280, 174, 57, 14);
		contentPane.add(lblResultadoArea);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCalcular.setBounds(131, 97, 101, 23);
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float base = Float.valueOf(txtBase.getText());
				Float altura = Float.valueOf(txtAltura.getText()); 
				Retangulo retangulo = new Retangulo();
				Float perimetro = retangulo.CalcularPerimetro(base, altura);
				Float area = retangulo.CalcularArea(base, altura);
				lblResultadoPerimetro.setText(String.format("%.2f", perimetro));
				lblResultadoArea.setText(String.format("%.2f", area));
			}
		});
		contentPane.add(btnCalcular);

		JLabel lblPerimetro = new JLabel("Perímetro: ");
		lblPerimetro.setBounds(57, 165, 78, 23);
		lblPerimetro.setHorizontalAlignment(SwingConstants.LEFT);
		lblPerimetro.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblPerimetro);

		JLabel lblArea = new JLabel("Área: ");
		lblArea.setBounds(234, 165, 46, 23);
		lblArea.setHorizontalAlignment(SwingConstants.LEFT);
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblArea);
	}

}
