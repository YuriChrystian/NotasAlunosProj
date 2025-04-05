package br.faj.proj;

public class EntregaExercicio {
    private int id;
    private float nota_correcao;
    private int ra_aluno;

    public EntregaExercicio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getNota_correcao() {
        return nota_correcao;
    }

    public void setNota_correcao(float nota_correcao) {
        this.nota_correcao = nota_correcao;
    }

    public int getRa_aluno() {
        return ra_aluno;
    }

    public void setRa_aluno(int ra_aluno) {
        this.ra_aluno = ra_aluno;
    }
}
//Uma Entrega de exercício possui o RA do aluno, ID do Exercício e a nota de correção que varia de 0 ao valor máximo do exercício.
