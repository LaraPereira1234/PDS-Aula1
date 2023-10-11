import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTexto = new JLabel(" Olá Mundo!");
		lblTexto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			    JOptionPane.showMessageDialog(null, "O foco esta no JLabel");
			}
		});
		
		lblTexto.setForeground(Color.MAGENTA);
		lblTexto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblTexto.setBounds(140, 54, 130, 23);
		contentPane.add(lblTexto);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnFechar.setForeground(Color.BLACK);
		btnFechar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnFechar.setBounds(293, 213, 87, 23);
		contentPane.add(btnFechar);
		
		txtNome = new JTextField();
		txtNome.setBackground(Color.WHITE);
		txtNome.setBounds(128, 99, 215, 31);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setForeground(Color.MAGENTA);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNome.setBounds(71, 105, 56, 14);
		contentPane.add(lblNome);
		
		JButton btnValidar = new JButton("VALIDAR");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pegar o texto digitado no JTexteField (txtNome)
				String nome = txtNome.getText();
				// Mostrar o nome digitado na tela usando JOptionPane
				JOptionPane.showMessageDialog(null, "O nome digitado é: "+ nome);
			}
		});
		btnValidar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnValidar.setForeground(Color.BLACK);
		btnValidar.setBackground(Color.MAGENTA);
		btnValidar.setBounds(136, 154, 88, 23);
		contentPane.add(btnValidar);
		
		JButton btnDefinirNome = new JButton("Limpar");
		btnDefinirNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText("");
			}
		});
		btnDefinirNome.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDefinirNome.setBounds(247, 153, 89, 24);
		contentPane.add(btnDefinirNome);
	}
}
