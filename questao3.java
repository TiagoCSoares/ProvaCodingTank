import java.util.Scanner;

public class questao3 {
    
    public static void main (String[] args) {

        System.out.println("Digite o valor da base do triângulo:");
        Scanner scanner = new Scanner(System.in);
        
        int base = scanner.nextInt();

        if(base % 2 == 0) {
            System.out.println("O programa aceita apenas valores ímpares!");
            scanner.close();
            return ;
        }

        for(int i = 1; i <= base; i+=2) {
            int numeroEspacoBranco = (base - i)/2;
            for(int j = 0; j < numeroEspacoBranco; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i = base; i >= 1; i-=2) {
            int numeroEspacoBranco = (base - i)/2;
            for(int j = 0; j < numeroEspacoBranco; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        scanner.close();

}
}
