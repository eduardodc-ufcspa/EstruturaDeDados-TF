package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Atendimento;
import modelo.Paciente;
import modelo.TAD_Fila;
import modelo.TAD_Lista;
import visao.CadastroPaciente;
import visao.PesquisaPaciente;
import visao.Principal;

public class Controle implements ActionListener{
	
	public Principal janelaPrincipal;
	
	
	TAD_Fila atendimentos = new TAD_Fila();
	TAD_Fila esperaPrioridade1 = new TAD_Fila(); 
	TAD_Fila esperaPrioridade2 = new TAD_Fila();
	TAD_Fila esperaPrioridade3 = new TAD_Fila();
	TAD_Fila esperaPrioridade4 = new TAD_Fila();
	TAD_Fila esperaPrioridade5 = new TAD_Fila();
	
	TAD_Lista listaPacientes = new TAD_Lista();
	TAD_Lista atendimentosEmAndamento = new TAD_Lista();
	TAD_Lista atendimentosEncerrados = new TAD_Lista();
	
	public void telaPrincipal() {
		
		Principal janelaPrincipal = new Principal();
		janelaPrincipal.setVisible(true);
		
		janelaPrincipal.mntmCadastroDePaciente.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				CadastroPaciente cp = new CadastroPaciente();
				cp.setVisible(true);
				cp.btnCadastrar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						Paciente novoPaciente = new Paciente (cp.fieldNome.getText(), cp.fieldCpf.getText(), Integer.parseInt(cp.fieldNascimento.getText()));
						listaPacientes.addBegin(novoPaciente);
						cp.dispose();

					}
					
				});
				cp.btnLimpar.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						cp.fieldCpf.setText("");
						cp.fieldNome.setText("");
						cp.fieldNascimento.setText("");
					}
					
				});
				
			}
		});
		
		janelaPrincipal.mntmPesquisarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 PesquisaPaciente pp = new PesquisaPaciente();
				 pp.setVisible(true);
				 
				 pp.btnPesquisa.addActionListener(new ActionListener() {

						public void actionPerformed(ActionEvent e) {
							
							if(listaPacientes.searchByID(pp.fieldCpfBusca.getText()) != null) {
								Paciente pesquisa = Paciente.class.cast(listaPacientes.searchByID(pp.fieldCpfBusca.getText()));
								pp.lblCpf1.setText(pesquisa.getCpf());
								pp.lblNascimento.setText(Integer.toString(pesquisa.getAnoNascimento()));
								pp.lblNome.setText(pesquisa.getNome());
								pp.lblNas.setVisible(true);
								pp.lblNomeLbl.setVisible(true);
								pp.lblCpfLbl.setVisible(true);
							} else {
								JOptionPane.showMessageDialog(null, "Paciente nao encontrado!");
							}
						}
						
					});
			}
	
		});
	}
	
	public static void main(String[] args) {
		
		Controle iniciar = new Controle();
		iniciar.telaPrincipal();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	

}
