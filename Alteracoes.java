/*
Modificação do método de adicionar testando se os campos estão devidamente preenchidos antes de inserir na fila
*/

if (cp.fieldNome.getText().isEmpty() ||  cp.fieldCpf.getText().isEmpty() || cp.fieldNascimento.getText().isEmpty()) {
  JOptionPane.showMessageDialog(null, "Preenchimento dos campos está incorreto");
} else {
  Paciente novoPaciente = new Paciente (cp.fieldNome.getText(), cp.fieldCpf.getText(), Integer.parseInt(cp.fieldNascimento.getText()));
  listaPacientes.addBegin(novoPaciente);
  cp.dispose();
}
