package Observer;

import java.util.Observable;

public class CarroRoubado extends Observable {
    private String acao;

    public void realizarAcao(String acao) {
        if (acao == null) {
            throw new IllegalArgumentException("Ação não pode ser nula.");
        }

        this.acao = acao;
        setChanged();
        notifyObservers(acao);
    }

    public String getAcao() {
        return acao;
    }
}