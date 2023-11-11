package Observer;

import java.util.Observable;

public abstract class ViaturaPolicial implements ViaturaPolicia {
    private String nome;

    public ViaturaPolicial(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof CarroRoubado) {
            String acao = (String) arg;
            System.out.println(nome + " - Carro roubado " + acao + "...");
        }
    }
}