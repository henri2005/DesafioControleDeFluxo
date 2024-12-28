import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Informe um numero");
            int primeiroNumero = terminal.nextInt();
            
            System.out.println("Informe um segundo numero");
            int segundoNumero = terminal.nextInt();

            if (segundoNumero < primeiroNumero) {
                throw new ParametrosInvalidosException("O segundo numero não pode ser menor que o primeiro");
            }
            
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println("Imprimindo o número " + i);
            }   
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
    }
}