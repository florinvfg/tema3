3.25 Crear un cronómetro que sume segundo a segundo (no en tiempo real, sino por pulsaciones).
 */
package javaapplication.cronometro.pkg3.pkg25;
import java.util.Scanner;

public class JavaApplicationCronometro325 {

   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int time = 0;
    
    while (true) {
      System.out.println("Presione Enter para sumar un segundo...");
      sc.nextLine();
      time++;
      System.out.println("Tiempo: " + time + " segundos");
    }
  }
}
    
