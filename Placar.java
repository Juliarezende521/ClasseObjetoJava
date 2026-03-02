public class Placar {

    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    // Construtor
    public Placar(String nomeTimeCasa, String nomeTimeVisitante) {
        this.nomeTimeCasa = nomeTimeCasa;
        this.nomeTimeVisitante = nomeTimeVisitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {

        if (periodoQuarto > 4) {
            System.out.println("Jogo já finalizado.");
            return;
        }

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        } else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        } else {
            System.out.println("Time inválido.");
        }
    }

    public void proximoQuarto() {
        if (periodoQuarto < 4) {
            periodoQuarto++;
        } else {
            System.out.println("O jogo terminou.");
            periodoQuarto++;
        }
    }

    @Override
    public String toString() {
        return nomeTimeCasa + " [" + pontosCasa + "] x [" +
                pontosVisitante + "] " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}