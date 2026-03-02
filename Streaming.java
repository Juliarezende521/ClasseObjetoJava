public class Streaming {

    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    // Construtor
    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        switch (plano) {
            case "Básico":
                mensalidade = 25.90f;
                break;
            case "Premium":
                mensalidade = 45.90f;
                break;
            case "Família":
                mensalidade = 60.90f;
                break;
            default:
                mensalidade = 0;
                System.out.println("Plano inválido.");
        }
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. Regularize o pagamento.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    @Override
    public String toString() {
        return "Usuário: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + (ativo ? "Ativo" : "Suspenso") +
                "\nÚltimo Filme Assistido: " + ultimoFilmeAssistido;
    }
}