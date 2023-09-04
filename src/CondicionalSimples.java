public class CondicionalSimples {
    public static void main(String[] args) throws Exception {
        
        double saldo = 25.0;
        double saqueSolicitado = 17.0;

        if(saqueSolicitado < saldo){
            saldo = saldo - saqueSolicitado;
        }

        System.out.println(saldo);
    }
}
