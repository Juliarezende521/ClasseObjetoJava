public class TestePlacar {
    public static void main(String[] args) {

        Placar p = new Placar("Franca", "Ribeirao");

        System.out.println(p);

        // Pontos do time casa
        p.registrarPonto("casa", 2);
        p.registrarPonto("casa", 3);
        p.registrarPonto("casa", 1);

        // Pontos do visitante
        p.registrarPonto("visitante", 2);
        p.registrarPonto("visitante", 3);

        System.out.println("\nPlacar após pontos:");
        System.out.println(p);

        // Avança quartos
        p.proximoQuarto();
        System.out.println("\nDepois do próximo quarto:");
        System.out.println(p);

        p.proximoQuarto();
        p.proximoQuarto();
        p.proximoQuarto(); // aqui deve avisar que terminou

        System.out.println("\nFinal:");
        System.out.println(p);

        // Tenta pontuar após o jogo terminar
        p.registrarPonto("casa", 2);
    }
}