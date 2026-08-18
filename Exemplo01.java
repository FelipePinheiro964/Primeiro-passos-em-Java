public class Exemplo01 {
  public static void main(String[] args) {
    double N1, N2, N3, N4, RES;
    
    System.out.print("Informe a nota do primeiro bimestre: ");
    N1 = Double.parseDouble(System.console().readLine());

    System.out.print("Informe a nota do segundo bimestre: ");
    N2 = Double.parseDouble(System.console().readLine());

    System.out.print("Informe a nota do terceior bimestre: ");
    N3 = Double.parseDouble(System.console().readLine());

    System.out.print("Informe a nota do quarto bimestre: ");
    N4 = Double.parseDouble(System.console().readLine());


    System.out.print("Sua nota media: ");
    RES = (N1 + N2 + N3 + N4) / 4;

    System.out.println(RES);
  }
}
