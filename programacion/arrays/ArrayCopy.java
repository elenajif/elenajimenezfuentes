public class ArrayCopy
{
  public static void main(String[] args)  {
        double[] pricesEnero = {1.29, 9.99, 22.50, 4.55, 7.35, 6.49};
        double[] pricesFebrero = new double[pricesEnero.length];
        for (int i=0; i<pricesEnero.length; i++) {
          pricesFebrero[i] = pricesEnero[i];
        }
        pricesFebrero[1] = 10.99;
        System.out.println("Ene", "Feb");
        for (int i=0; i<pricesEnero.length; i++) {
          System.out.println(pricesJanuary[i], pricesFebruary[i]);
        }
      } 
  } 
