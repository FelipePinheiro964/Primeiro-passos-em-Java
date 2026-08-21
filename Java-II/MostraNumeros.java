public class MostraNumeros {

  public static void main(String[] args) {
    
    int numero;
    
    System.out.print("Informe um numero inteiro de 0 a 10: ");
    numero = Integer.parseInt(System.console().readLine());
    switch (numero) {
      
    case 0: System.out.println("Zero"); break;
          
    case 1: System.out.println("Um"); break;
          
    case 2: System.out.println("Dois"); break;
          
    case 3: System.out.println("Três"); break;
          
    case 4: System.out.println("Quatro"); break;
          
    case 5: System.out.println("Cinco"); break;
          
    case 6: System.out.println("Seis"); break;
          
    case 7: System.out.println("Sete"); break;
      
    case 8: System.out.println("Oito"); break;

    case 9: System.out.println("Nove"); break;      
    
    case 10: System.out.println("Dez"); break;
    // Sei como esse codigo e EXTREMAMENTE simples, mas nao vou pular etapas do curso
    default: System.out.println("Numero invalido");
    }

  }

}
