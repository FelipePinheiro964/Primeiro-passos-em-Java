import java.math.BigInteger;

public class Fatorial {

  public static void main(String[] args) {

    int numero, valor;
    BigInteger fatorial;

    System.out.print("Informe um numero inteiro: ");
    numero = Integer.parseInt(System.console().readLine());

    valor = 2;
    fatorial = BigInteger.ONE;

    while (valor <= numero) {

      fatorial = fatorial.multiply(BigInteger.valueOf(valor));
      valor = valor + 1;

    }

    System.out.printf("O fatorial de %d é %d.\n", numero, fatorial);

  }

}
