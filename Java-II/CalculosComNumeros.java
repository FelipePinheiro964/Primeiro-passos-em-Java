public class CalculosComNumeros {

  public static void main(String[] args) {
    
    double numero, quad, cub, raiz_quad, raiz_cub;

    System.out.print("Numero: ");
    numero = Double.parseDouble(System.console().readLine());

    // Parecido com oq fazemos usando np, mas sem importar nada
    quad = Math.pow(numero, 2); // numero ao quadrado
    cub = Math.pow(numero, 3); // numero ao cubo
    raiz_quad = Math.sqrt(numero); // raiz quadrada
    raiz_cub = Math.cbrt(numero); // raiz cubica

    System.out.printf("N. ao quadrado: %f\n", quad);
    System.out.printf("N. ao cubo: %f\n", cub);
    System.out.printf("Raiz quadrada: %f\n", raiz_quad);
    System.out.printf("Raiz cubica: %f\n", raiz_cub);

  }


}
