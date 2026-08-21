public class SimulaDado {

  public static void main(String[] args) {
    
    int cont, dado;

    for(cont = 1; cont <= 5; cont++) {
      dado = (int)(1 + Math.random() * 6); // Seria o idela pra isso, mas o curso se limita a explicar de forma muito rasa
      System.out.println(dado);

    }

  }

}
