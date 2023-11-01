package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Retangulo;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;

public class Janela1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		setBounds(100, 100, 338, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblBase);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblAltura);
		
		txtBase = new JTextField();
		contentPane.add(txtBase);
		txtBase.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		txtAltura = new JTextField();
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);
		
		JRadioButton rdbtnArea = new JRadioButton("Área");
		buttonGroup.add(rdbtnArea);
		rdbtnArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnArea);
		
		JLabel label_2 = new JLabel("");
		contentPane.add(label_2);
		
		JRadioButton rdbtnPerimetro = new JRadioButton("Perímetro");
		buttonGroup.add(rdbtnPerimetro);
		rdbtnPerimetro.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(rdbtnPerimetro);
		
		JLabel lblResultado = new JLabel("");
		contentPane.add(lblResultado);
		
		JLabel label_3 = new JLabel("");
		contentPane.add(label_3);
		
		JLabel lbllabel_4 = new JLabel("");
		contentPane.add(lbllabel_4);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float base = Float.valueOf(txtBase.getText());
				float altura = Float.valueOf(txtAltura.getText());
				Retangulo retangulo = new Retangulo();
				Float perimetro = retangulo.calcularPerimetro(base, altura);
				Float area = retangulo.calcularArea(base, altura);
				if(rdbtnArea.isSelected()) {
					lblResultado.setText("Área:"+area);
				}
				else if(rdbtnPerimetro.isSelected()) {
					lblResultado.setText("Perímetro:"+perimetro);
				}
			
			}
		});
		contentPane.add(btnCalcular);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnLimpar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(btnFechar);
	}
}
