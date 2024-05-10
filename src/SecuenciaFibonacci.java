import java.util.Scanner;

public class SecuenciaFibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números de la secuencia de Fibonacci que desea mostrar: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.printf("Los primeros %d  números de la secuencia de Fibonacci son:\n",n);

        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
