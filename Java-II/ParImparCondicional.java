public class ParImparCondicional {

  public static void main(String[] args) {
    
    int numero;
    String resposta;

    System.out.print("Digite um numero: ");
    numero = Integer.parseInt(System.console().readLine());

    // basicamente o ? pega os dois valores e se for verdadeiro (if true digamos)
    // ele armazena o primeiro valor na varievel
    // senao (else) ele armazena o segundo
    resposta  = numero % 2 == 0 ? "Par" : "Impar";

    System.out.printf("O numero eh %s.\n", resposta);


  }

}
