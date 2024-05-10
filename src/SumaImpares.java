import java.util.Scanner;

public class SumaImpares {
    public static void main(String[] args) {

        int n;
        int suma=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero hasta el cual desee sumar los impares:");
        n=sc.nextInt();

        for(int i=1; i<n;i++){
            if(i%2!=0){
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}
