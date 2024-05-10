import java.util.Scanner;

public class SoloPares2 {

    public static void main(String[] args) {

        int n;
        int suma=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el numero de pares + 0 que desea visualizar:");
        n=sc.nextInt();

        for(int i=2; i<=(n+4);i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
