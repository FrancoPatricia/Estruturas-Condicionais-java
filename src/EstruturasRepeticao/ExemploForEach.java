package EstruturasRepeticao;

public class ExemploForEach {
  public static void main(String[] args) {
    
    String alunos[] = {"PATRICIA", "MANUELLA", "MARCOS", "MATILDA"};

    for (String aluno : alunos) {
      System.out.println("Nome do aluno é: " + aluno);
    }
  }
}
