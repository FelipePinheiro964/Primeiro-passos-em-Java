public class DiferencaValores {

  public static void main(String[] args) {

    double n1, n2, dif;

    System.out.print("Digite o primeiro numero: ");
    n1 = Double.parseDouble(System.console().readLine());

    System.out.print("Digite o segundo numero: ");
    n2 = Double.parseDouble(System.console().readLine());


    if(n1 >= n2) {
      dif = n1 - n2;
      if(dif == 0)
        System.out.printf("Não tem diferença entre os valores %f\n", dif);
      else
        System.out.printf("O total de diferença entre os valores: %f\n", dif);
      }

    else {
      dif = n2 - n1;
      if(dif == 0)
        System.out.printf("Não tem diferença entre os valores %f\n", dif);
      else
        System.out.printf("O total de diferença entre os valores: %f\n", dif);
      }
      

  } 

}
