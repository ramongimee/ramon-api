package br.com.ramon.srgc.Model;

public class Ramon {

    private final Long id;
    private final String nome;

    public Ramon(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
