package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Paciente;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPaciente extends JFrame {
	public JPanel contentPane;
	public JTextField fieldNome;
	public JTextField fieldCpf;
	public JTextField fieldNascimento;
	public JButton btnCadastrar;
	public JButton btnLimpar;
	
	/**
	 * Create the panel.
	 */
	public CadastroPaciente() {
		setTitle("Cadastro de paciente");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(123, 46, 48, 15);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(129, 73, 42, 15);
		contentPane.add(lblCpf);
		
		JLabel lblAnoDe = new JLabel("Ano de nascimento");
		lblAnoDe.setBounds(27, 100, 144, 15);
		contentPane.add(lblAnoDe);
		
		fieldNome = new JTextField();
		fieldNome.setBounds(172, 44, 244, 19);
		contentPane.add(fieldNome);
		fieldNome.setColumns(10);
		
		fieldCpf = new JTextField();
		fieldCpf.setColumns(10);
		fieldCpf.setBounds(172, 73, 144, 19);
		contentPane.add(fieldCpf);
		
		fieldNascimento = new JTextField();
		fieldNascimento.setBounds(172, 98, 84, 19);
		contentPane.add(fieldNascimento);
		fieldNascimento.setColumns(10);
		
		btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.setBounds(69, 179, 121, 25);
		contentPane.add(btnCadastrar);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(244, 179, 121, 25);
		contentPane.add(btnLimpar);
		
		
		
	}
}
