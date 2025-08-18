package diagnostica;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota01;
    private double nota02;
    private double media;

    public Aluno(String nome, int matricula, double nota01, double nota02, double media) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.media = media;
    }

    public Aluno() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMtricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota01() {
        return nota01;
    }

    public void setNota01(double nota01) {
        this.nota01 = nota01;
    }

    public double getNota02() {
        return nota02;
    }

    public void setNota02(double nota02) {
        this.nota02 = nota02;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota01=" + nota01 + ", nota02=" + nota02
                + ", media=" + media + "]";
    }
}
