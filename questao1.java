import java.util.Scanner;

public class questao1 {
    
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do empréstimo desejado: ");
        double valorEmprestimo = scanner.nextDouble();

        System.out.print("\nDigite o valor da taxa de juros do empréstimo: ");
        double taxaDeJuros = scanner.nextDouble();

        System.out.print("\nDigite o tempo de pagamento (em meses):");
        int tempoPagamento = scanner.nextInt();

        double amortizacao = valorEmprestimo/tempoPagamento;

        System.out.printf("\n\nValor fixo da amortização R$ %.2f, ", amortizacao);
        System.out.printf("Saldo devedor total R$ %.2f ", valorEmprestimo);
        System.out.printf("com um juros de %.1f%%\n\n", taxaDeJuros);

        double saldo_devedor_atual = valorEmprestimo;
        double total_juros = 0;
        for(int i = 1; i <= tempoPagamento; i++) {
            double juros_mensal = (saldo_devedor_atual*taxaDeJuros)/100;
            double parcela_mensal = juros_mensal + amortizacao;
            total_juros += juros_mensal;
            saldo_devedor_atual -= amortizacao;
            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo Devedor: %.2f\n\n", i, juros_mensal, parcela_mensal, saldo_devedor_atual);
        }

        double total_saldo = valorEmprestimo + total_juros;

        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", total_saldo, total_juros, valorEmprestimo);
   
        scanner.close();
    }
}
