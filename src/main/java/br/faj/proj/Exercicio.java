package br.faj.proj;

public class Exercicio {
    private int id;
    private String titulo;
    private String descricao;
    private int data_inicio;
    private int data_fim;
    private float nota_maxima;

    public Exercicio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(int data_inicio) {
        this.data_inicio = data_inicio;
    }

    public int getData_fim() {
        return data_fim;
    }

    public void setData_fim(int data_fim) {
        this.data_fim = data_fim;
    }

    public float getNota_maxima() {
        return nota_maxima;
    }

    public void setNota_maxima(float nota_maxima) {
        this.nota_maxima = nota_maxima;
    }
}
//Um Exercício possui ID, título, descrição, data de início, data fim, nota máxima