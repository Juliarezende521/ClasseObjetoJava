public class TestaConta {

    public static void main(String[] args) {

        // Criando conta João
        Conta c1 = new Conta(1001, 123, "João Silva");

        c1.depositar(500);
        c1.sacar(200);

        System.out.println(c1);

        // Criando conta Maria
        Conta c2 = new Conta(1002, 123, "Maria Souza");

        c2.sacar(50); // sem saldo

        // Tentando encerrar c1 com saldo
        c1.encerrarConta();

        // Sacando restante
        c1.sacar(300);

        // Encerrando conta
        c1.encerrarConta();

        System.out.println("\nDados finais da conta João:");
        System.out.println(c1);
    }
}