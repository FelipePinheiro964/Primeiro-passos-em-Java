public class MaiorDeDoisNumeros {

  public static void main(String[] args) {

    double n1, n2;

    System.out.print("Digite um numero: ");
    n1 = Double.parseDouble(System.console().readLine());

    System.out.print("Digite o segundo numero: ");
    n2 = Double.parseDouble(System.console().readLine());

    if(n1 > n2)
      System.out.printf("Maior número: %f\n", n1);

    if(n1 < n2)
      System.out.printf("Maior numero: %f\n", n2);

    if(n1 == n2)
      System.out.println("Os numeros são iguais");

  }

}
