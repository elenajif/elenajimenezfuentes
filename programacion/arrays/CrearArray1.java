import java.util.Scanner;
public class CrearArray1 {
  public static void main(String [] a) {
    final int tam = 10;
    Scanner entrada = new Scanner(System.in);
    int []nums= new int[tam];
    int total = 1;
    System.out.println("Por favor, introduzca " + tam + " datos");
    for (int i = 0; i < tam; i++) {
      nums[i] = entrada.nextInt();
    }
    System.out.print("\nLista de números: ");
    for (int i = 0; i < tam; i++) {
      System.out.print(" " + nums[i]);
      total *= nums[i];
    }
    System.out.println("\nEl producto de los números es " + total);
    }
}
