import java.math.BigInteger;

public class Fatorial {

  public static void main(String[] args) {

    int numero, valor;
    BigInteger fatorial;

    System.out.print("Informe um numero inteiro: ");
    numero = Integer.parseInt(System.console().readLine());

    valor = 2;
    fatorial = BigInteger.ONE;
    // atulizando o fatorial para estrutura for
    for (valor = 2; valor <= numero; valor = valor + 1)

      fatorial = fatorial.multiply(BigInteger.valueOf(valor));


    System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);

  }

}
