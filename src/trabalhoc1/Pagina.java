package trabalhoc1;

public class Pagina {
    private String url;
    private String titulo;

    public Pagina(String url, String titulo) {
        this.url = url;
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Título = " + titulo + " | URL = " + url;
    }
}
