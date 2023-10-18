package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 frame = new Exercicio2();
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
	public Exercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setForeground(new Color(255, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNome.setBounds(151, 55, 188, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBackground(new Color(255, 51, 204));
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome.setBounds(88, 57, 53, 17);
		contentPane.add(lblNome);
		
		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setBackground(new Color(255, 51, 204));
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSobrenome.setBounds(56, 101, 79, 14);
		contentPane.add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSobrenome.setBounds(151, 99, 188, 20);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);
		
		JLabel lblNomeCompleto = new JLabel("");
		lblNomeCompleto.setBounds(37, 218, 324, 14);
		contentPane.add(lblNomeCompleto);
		
		JButton btnVerificar = new JButton("VERIFICAR");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Pegar o nome e o sobrenome digitado no TextField
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				//Mostrar o nome com o Jlabel
				lblNomeCompleto.setText(nome+ " "+sobrenome);
			}
		});
		btnVerificar.setBackground(new Color(204, 204, 204));
		btnVerificar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVerificar.setBounds(151, 153, 101, 23);
		contentPane.add(btnVerificar);
		
	
	}
}
