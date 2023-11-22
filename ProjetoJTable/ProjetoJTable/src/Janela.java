import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JLabel labelNome;
	private JTextField txtNome;
	private JLabel lblCpf;
	private JTextField txtCPF;
	private JTextField txtTelefone;
	private JTextField txtIdade;
	private JTextField txtAltura;
	private JTextField txtPeso;
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	private JButton btnAlterar;

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
		setBounds(300, 300, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(38, 251, 391, 146);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				int linha = table.getSelectedRow();
				Pessoa pS = listaPessoas.get(linha);
				txtNome.setText(pS.getNome());
				txtCPF.setText(String.valueOf(pS.getCpf()));
				txtTelefone.setText(String.valueOf(pS.getTelefone()));
				txtIdade.setText(String.valueOf(pS.getIdade()));
				txtAltura.setText(String.valueOf(pS.getAltura()));
				txtPeso.setText(String.valueOf(pS.getPeso()));
			}
		});
		atualizarJTableModel();
		scrollPane.setViewportView(table);

		labelNome = new JLabel("Nome");
		labelNome.setBounds(15, 11, 46, 14);
		contentPane.add(labelNome);

		txtNome = new JTextField();
		txtNome.setBounds(10, 36, 146, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		lblCpf = new JLabel("CPF");
		lblCpf.setBounds(185, 11, 46, 14);
		contentPane.add(lblCpf);

		txtCPF = new JTextField();
		txtCPF.setBounds(181, 36, 118, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(10);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
			    String cpf = txtCPF.getText();
			    String telefone = txtTelefone.getText();
			    String idade = txtIdade.getText();
			    String peso = txtPeso.getText();
			    String altura = txtAltura.getText();

				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setCpf(Integer.parseInt(cpf));
				p.setTelefone(Integer.parseInt(telefone));
				p.setIdade(Integer.parseInt(idade));
				p.setPeso(Float.parseFloat(peso));
				p.setAltura(Float.parseFloat(altura));

				listaPessoas.add(p);

				atualizarJTableModel();
				limparCampos();

			}
		});
		btnAdicionar.setBounds(55, 191, 89, 23);
		contentPane.add(btnAdicionar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idx_linha = table.getSelectedRow();
				listaPessoas.remove(idx_linha);
				atualizarJTableModel();
				limparCampos();
			}
			});
		btnExcluir.setBounds(190, 191, 89, 23);
		contentPane.add(btnExcluir);

		btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						 // pegar os valores digitados nos campos de textotxtNome.setText("");
						Pessoa p = listaPessoas.get(table.getSelectedRow());
						String nome = txtNome.getText();
						String cpf= txtCPF.getText();
						String telefone = txtTelefone.getText();
						String idade = txtIdade.getText();
						String peso = txtPeso.getText();
						String altura = txtAltura.getText();
						
						// setar no obj do arraylist
						p.setNome(nome);
						p.setCpf(Integer.parseInt(cpf));
						p.setTelefone(Integer.parseInt(telefone));
						p.setIdade(Integer.parseInt(idade));
						p.setPeso(Float.parseFloat(peso));
						p.setAltura(Float.parseFloat(altura));
						
						atualizarJTableModel();
						limparCampos();
					}
				
			
		});
		btnAlterar.setBounds(318, 191, 89, 23);
		contentPane.add(btnAlterar);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(15, 98, 141, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);

		txtIdade = new JTextField();
		txtIdade.setBounds(185, 98, 114, 20);
		contentPane.add(txtIdade);
		txtIdade.setColumns(10);

		txtAltura = new JTextField();
		txtAltura.setBounds(327, 36, 128, 20);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		txtPeso = new JTextField();
		txtPeso.setBounds(327, 98, 128, 20);
		contentPane.add(txtPeso);
		txtPeso.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(15, 81, 62, 14);
		contentPane.add(lblTelefone);

		JLabel lblIdade = new JLabel("Idade");
		lblIdade.setBounds(185, 81, 46, 14);
		contentPane.add(lblIdade);

		JLabel lblPeso = new JLabel("Peso");
		lblPeso.setBounds(328, 81, 46, 14);
		contentPane.add(lblPeso);

		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(328, 11, 46, 14);
		contentPane.add(lblAltura);
	}

	public void atualizarJTableModel() {
		table.setModel(new PessoaJTableModel(listaPessoas));

	}

	public void limparCampos() {
		txtNome.setText("");
		txtCPF.setText("");
		txtTelefone.setText("");
		txtIdade.setText("");
		txtPeso.setText("");
		txtAltura.setText("");
	}
}
