package br.faj.proj;

public class Disciplina {
    private int id;
    private String nome;
    private String dia_semana;
    private String descricao;

    public Disciplina() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dia_semana='" + dia_semana + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
//Uma Disciplina possui ID, nome, dia da semana, descrição, ...