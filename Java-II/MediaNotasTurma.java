public class MediaNotasTurma {

  public static void main(String[] args) {

    int nro_estudante, soma, nota, notaslidas;
    double media;

    System.out.print("Numero de estudantes da turma: ");

    nro_estudante = Integer.parseInt(System.console().readLine());

    soma = 0;

    notaslidas = 0;

    while(notaslidas < nro_estudante) {

      System.out.printf("Nota %d: ", notaslidas + 1);
      nota = Integer.parseInt(System.console().readLine());
      soma = soma + nota;
      notaslidas = notaslidas + 1;

    }

    media = (double) soma / nro_estudante;
    System.out.printf("Media das notas = %.1f\n", media);


  }

}
