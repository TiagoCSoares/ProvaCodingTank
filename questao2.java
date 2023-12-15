import java.util.Scanner;

public class questao2 {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        double temperatura = scanner.nextDouble();

        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        char origem = scanner.next().charAt(0);
        if(!(origem == 'C' || origem == 'F' || origem == 'K')){
            System.out.println("A entrada especificada não é válida!");
            return;
        }
    
        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        char destino = scanner.next().charAt(0);
        if(!(destino == 'C' || destino == 'F' || destino == 'K')){
            System.out.println("A entrada especificada não é válida!");
            return;
        }

        double temperatura_convertida = temperatura;

        switch (origem){
            case 'C':
                if(destino == 'K') 
                    temperatura_convertida = temperatura + 273.15;
                else if (destino == 'F')
                    temperatura_convertida = (temperatura*9)/5 + 32;
                break;

            case 'K':
                if(destino == 'C')
                    temperatura_convertida = temperatura - 273.15;
                else if(destino == 'F') {
                    System.out.println("Conversão não disponível");
                    return ;
                }
                break;
            
            case 'F':
                if(destino == 'C')
                    temperatura_convertida = (temperatura-32)*5 / 9;
                else if(destino == 'K') {
                    System.out.println("Conversão não disponível");
                    return ;
                }
                break;
        }

        System.out.printf("%.2f %s = %.2f %s\n", temperatura, origem, temperatura_convertida, destino);

        scanner.close();
    }
}
