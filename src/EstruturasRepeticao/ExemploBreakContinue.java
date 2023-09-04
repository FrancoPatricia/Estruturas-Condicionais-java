package EstruturasRepeticao;

public class ExemploBreakContinue {
  public static void main(String[] args) {
    
    for(int numero = 0; numero <= 5; numero++){
      if(numero == 3)
        break;

      System.out.println(numero);     
    }

    System.out.println("Outro programa abaixo:");

    for( int i = 0; i <= 5; i++){
      if(i == 3)
        continue;

      System.out.println(i);
    }
  }
}
