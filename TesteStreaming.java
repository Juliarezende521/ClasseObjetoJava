public class TesteStreaming {
    public static void main(String[] args) {

        Streaming s1 = new Streaming("julia", "Premium");
        System.out.println(s1);

        s1.assistirFilme("Interestelar");
        System.out.println("\nDepois de assistir:");
        System.out.println(s1);

        s1.cancelarAssinatura();
        s1.assistirFilme("Matrix"); // deve avisar que está suspenso

        System.out.println("\nDados finais:");
        System.out.println(s1);

        // Teste plano inválido
        System.out.println("\n--- Plano inválido ---");
        Streaming s2 = new Streaming("maria", "Ultra");
        System.out.println(s2);
    }
}