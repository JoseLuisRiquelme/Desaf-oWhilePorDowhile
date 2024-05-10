import java.util.Scanner;

public class SumaImparLimite {
    public static void main(String[] args) {

        int n;
        int m;
        int suma=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el limite inferior:");
        n=sc.nextInt();
        System.out.println("Ingrese el limite superior:");
        m=sc.nextInt();

        for(int i=n; i<m;i++){
            if(i%2!=0){
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}
