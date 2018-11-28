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
  Precisa fazer o teste de -> Se não existe paciente com o CPF informado, direcionar para a página de cadastro de paciente.
*/
