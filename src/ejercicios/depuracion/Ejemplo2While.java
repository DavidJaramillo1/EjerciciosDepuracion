package ejercicios.depuracion;

/* 
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        while (contador< n){
               System.out.println(" * ");
               contador++;

        }

        public static int pedirNumero (){
            Scanner sc = new Scanner (System.in);
            System.out.print("Introduce un numero");
            return sc.nextInt();
        }

    }
}

