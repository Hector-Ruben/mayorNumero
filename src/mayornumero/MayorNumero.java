package mayornumero;
import java.util.Scanner;
public class MayorNumero {
    public void MayorNum(){
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer entero: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca segundo entero: ");
        n2 = entrada.nextInt();
        if (n1 > n2) {
            System.out.println("El mayor es " + n1);
        } else {
            System.out.println("El mayor es " + n2);
        }
    }
    public static void main(String[] args) {
        MayorNumero mayornumero = new MayorNumero();
        mayornumero.MayorNum();
    }
    
}
