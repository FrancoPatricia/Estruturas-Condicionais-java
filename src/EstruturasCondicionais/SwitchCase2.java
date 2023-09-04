package EstruturasCondicionais;
public class SwitchCase2 {
  public static void main(String[] args) {
    //Exemplo sem usar o break
    
    String plano = "M"; 

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
		}
  }
}
