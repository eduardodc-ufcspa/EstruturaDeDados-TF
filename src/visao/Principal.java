package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {
	
	private JPanel contentPane;
	public JMenu mnPaciente;
	public JMenuItem mntmCadastroDePaciente;
	public JMenuItem mntmIniciarAtendimento;
	public JMenuItem mntmChamarPacientePara;
	public JMenuItem mntmChamarPacientePara_1;
	public JMenuItem mntmLiberarPaciente;
	public JMenuItem mntmRelatriosGerencias;
	public JMenuItem mntmPesquisarPaciente;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Menu principal");
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(12, 0, 129, 21);
		contentPane.add(menuBar);
		
		mnPaciente = new JMenu("Paciente");
		menuBar.add(mnPaciente);
		
		/*
		 * Cadastro de paciente - clique no menu do JFrame
		 * 
		 */
		
		mntmCadastroDePaciente = new JMenuItem("Cadastro de paciente");
		mnPaciente.add(mntmCadastroDePaciente);
		
		
		/*
		 * Pesquisar de paciente - clique no menu do JFrame
		 * 
		 */
		
		mntmPesquisarPaciente = new JMenuItem("Pesquisar paciente");
		mnPaciente.add(mntmPesquisarPaciente);

		
		
		/*
		 * Iniciar atendimento - clique no menu do JFrame
		 * 
		 */
		
		mntmIniciarAtendimento = new JMenuItem("Iniciar atendimento");
		mnPaciente.add(mntmIniciarAtendimento);
		mntmIniciarAtendimento.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		/*
		 * Chamar paciente  para triagem - clique no menu do JFrame
		 * 
		 */
		
		mntmChamarPacientePara = new JMenuItem("Chamar paciente para triagem");
		mnPaciente.add(mntmChamarPacientePara);
		mntmChamarPacientePara.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		/*
		 * Chamar paciente para consulta - clique no menu do JFrame
		 * 
		 */
		
		mntmChamarPacientePara_1 = new JMenuItem("Chamar paciente para consulta");
		mnPaciente.add(mntmChamarPacientePara_1);
		mntmChamarPacientePara_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		/*
		 * Liberar paciente - clique no menu do JFrame
		 * 
		 */
		
		mntmLiberarPaciente = new JMenuItem("Liberar paciente");
		mnPaciente.add(mntmLiberarPaciente);
		mntmLiberarPaciente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		/*
		 * Relatorios gerenciais - clique no menu do JFrame
		 * 
		 */
		
		mntmRelatriosGerencias = new JMenuItem("Relatórios gerenciais");
		mnPaciente.add(mntmRelatriosGerencias);
		mntmRelatriosGerencias.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		/*
         * Pesquisar de paciente - clique no menu do JFrame
         * 
         */



	}
}
