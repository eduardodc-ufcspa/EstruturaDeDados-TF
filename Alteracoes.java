/*
Modificação do método de adicionar testando se os campos estão devidamente preenchidos antes de inserir na fila
*/
public void actionPerformed(ActionEvent e) {
  //Verifica se algum dos dados campos esta vazio e nao permite inclusao na fila
  if (cp.fieldNome.getText().isEmpty() ||  cp.fieldCpf.getText().isEmpty() || cp.fieldNascimento.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Preenchimento dos campos está incorreto");
  }
  //Verifica se o CPF informado ja esta na fila (campo chave de redundancia)
  else if (listaPacientes.searchByID(cp.fieldCpf.getText()) != null) {
    JOptionPane.showMessageDialog(null, "Paciente com o CPF informado já está cadastrado");
  }
  //Caso passe pelos dois testes acima, o paciente pode ser incluido na fila
  else {
    Paciente novoPaciente = new Paciente (cp.fieldNome.getText(), cp.fieldCpf.getText(), Integer.parseInt(cp.fieldNascimento.getText()));
    listaPacientes.addBegin(novoPaciente);
    JOptionPane.showMessageDialog(null, "Paciente adicionado com sucesso!");
    cp.dispose();
  }
}

/*
  Modificação do método de pesquisa que já chama o método de cadastro caso o usuário não exista
*/
janelaPrincipal.mntmPesquisarPaciente.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent arg0) {
     PesquisaPaciente pp = new PesquisaPaciente();
     pp.setVisible(true);

     pp.btnPesquisa.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          //Caso encontre paciente com o CPF informado, retorna os dados referentes ao paciente
          if(listaPacientes.searchByID(pp.fieldCpfBusca.getText()) != null) {
            Paciente pesquisa = Paciente.class.cast(listaPacientes.searchByID(pp.fieldCpfBusca.getText()));
            pp.lblCpf1.setText(pesquisa.getCpf());
            pp.lblNascimento.setText(Integer.toString(pesquisa.getAnoNascimento()));
            pp.lblNome.setText(pesquisa.getNome());
            pp.lblNas.setVisible(true);
            pp.lblNomeLbl.setVisible(true);
            pp.lblCpfLbl.setVisible(true);
          } else {
            //Caso nao encontre o paciente atrelado ao CPF, mostra o aviso e inicia o procedimento
            //de cadastro de paciente seguindo a mesma logica do cadastro quando o usuario segue a rotina.
            //O CPF na nova janela de cadastro preenchido automaticamento pelo campo de pesquisa vem com
            //Editable == false;
            JOptionPane.showMessageDialog(null, "Paciente nao encontrado!");
            pp.dispose();
            CadastroPaciente cp = new CadastroPaciente();
            cp.setVisible(true);
            cp.fieldCpf.setText(pp.fieldCpfBusca.getText());
            cp.fieldCpf.setEditable(false);
            cp.btnCadastrar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              //Verifica se algum dos dados campos esta vazio e nao permite inclusao na fila
              if (cp.fieldNome.getText().isEmpty() ||  cp.fieldCpf.getText().isEmpty() || cp.fieldNascimento.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preenchimento dos campos está incorreto");
              }
              //Verifica se o CPF informado ja esta na fila (campo chave de redundancia)
              else if (listaPacientes.searchByID(cp.fieldCpf.getText()) != null) {
                JOptionPane.showMessageDialog(null, "Paciente com o CPF informado já está cadastrado");
              }
              //Caso passe pelos dois testes acima, o paciente pode ser incluido na fila
              else {
                Paciente novoPaciente = new Paciente (cp.fieldNome.getText(), cp.fieldCpf.getText(), Integer.parseInt(cp.fieldNascimento.getText()));
                listaPacientes.addBegin(novoPaciente);
                JOptionPane.showMessageDialog(null, "Paciente adicionado com sucesso!");
                cp.dispose();
              }
            }

          });

          cp.btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              cp.fieldNome.setText("");
              cp.fieldNascimento.setText("");
            }

          });

          }
        }

      });
  }

});
