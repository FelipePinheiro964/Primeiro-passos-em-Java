public class RepeteLeitura {

  public static void main(String[] args) {
    
    int numero;
    // while deve manter a repeticao ate que o teste de falso
    do {

      System.out.print("Digite o numero: ");
      numero = Integer.parseInt(System.console().readLine());


    } while(numero != 8);

    System.out.println("Voce acertou o numero");

  }

}
