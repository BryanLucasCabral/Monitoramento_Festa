public class EntradaUser {
  String nome;
  int idade;
  int ingresso;

  boolean verificaIdade() {
    if (idade >= 18) {
      return true;
    } else {
      return false;
    }
  }

  boolean verificaIngresso() {
    int ingressoCorreto = 775;

    if (this.ingresso != ingressoCorreto) {
      return true;
    } else {

      return false;
    }

  }

  void exibirDetalhes() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Ingresso: " + ingresso);
  }
}
