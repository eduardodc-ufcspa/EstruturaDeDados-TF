package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PesquisaPaciente extends JFrame {
	
	private JPanel contentPane;
	public JTextField fieldCpfBusca;
	public JLabel lblNome;
	public JLabel lblCpf1;
	public JLabel lblNascimento;
	public JButton btnPesquisa;
	public JLabel lblNomeLbl;
	public JLabel lblCpfLbl;
	public JLabel lblNas;
	/**
	 * Create the panel.
	 */
	public PesquisaPaciente() {
		setTitle("Pesquisa de paciente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(45, 48, 70, 15);
		contentPane.add(lblCpf);
		
		fieldCpfBusca = new JTextField();
		fieldCpfBusca.setColumns(10);
		fieldCpfBusca.setBounds(87, 46, 144, 19);
		contentPane.add(fieldCpfBusca);
		
		lblNomeLbl = new JLabel("Nome");
		lblNomeLbl.setBounds(49, 96, 46, 15);
		contentPane.add(lblNomeLbl);
		lblNomeLbl.setVisible(false);
		
		lblNome = new JLabel("");
		lblNome.setBounds(107, 96, 310, 15);
		contentPane.add(lblNome);
		
		
		lblCpfLbl = new JLabel("CPF");
		lblCpfLbl.setBounds(59, 123, 32, 15);
		contentPane.add(lblCpfLbl);
		lblCpfLbl.setVisible(false);
		
		lblCpf1 = new JLabel("");
		lblCpf1.setBounds(107, 123, 144, 15);
		contentPane.add(lblCpf1);
		
		lblNas = new JLabel("Nascimento");
		lblNas.setBounds(12, 150, 83, 15);
		contentPane.add(lblNas);
		lblNas.setVisible(false);
		
		lblNascimento = new JLabel("");
		lblNascimento.setBounds(107, 150, 70, 15);
		contentPane.add(lblNascimento);
		
		btnPesquisa = new JButton("Pesquisar");
//		btnPesquisa.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				
//				System.out.println(lista.searchByID(fieldCpfBusca.getText()));
//				boolean encontrou = true;
//				// Caso tenha encontrado paciente com o CPF informado
//				if (encontrou) {
//					lblNomeLbl.setVisible(true);
//					lblNas.setVisible(true);
//					lblCpfLbl.setVisible(true);
//					lblNome.setText("Aqui vai o nome");
//					lblCpf1.setText("C.P.F");
//					lblNascimento.setText("Ano");
//					
//				} else {
//					JOptionPane.showMessageDialog(null, "Paciente não encontrado!");
//				}
//				
//			}
//		});
		btnPesquisa.setBounds(248, 43, 117, 25);
		contentPane.add(btnPesquisa);
		
		
	}

}
