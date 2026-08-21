public class MediaNotasTurma {

  public static void main(String[] args) {

    int nro_estudante, soma, nota, notaslidas;
    double media;

    System.out.print("Numero de estudantes da turma: ");

    nro_estudante = Integer.parseInt(System.console().readLine());

    soma = 0;
    // mais um exemplo de atualização do codigo com o for, eu achei interessante, da pra usar em alguns lugares
    for(notaslidas = 0; notaslidas < nro_estudante; notaslidas = notaslidas + 1) {
      System.out.printf("Nota %d: ", notaslidas + 1);
      nota = Integer.parseInt(System.console().readLine());
      soma = soma + nota;
      }
    

    media = (double) soma / nro_estudante;
    System.out.printf("Media das notas = %.1f\n", media);


  }

}
