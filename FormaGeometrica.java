//Java mostrando que diagrama de Venn é útil depois do Ensino Médio

public abstract class FormaGeometrica {
    //não consegui fazer os métodos do nome da forma geométrica serem abstratos
    private String nome;

    public abstract double getArea();

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    //o perímetro é calculado nas subclasses de forma geométrica
    public abstract double getPerimetro();

    //convertendo o perímetro da forma geométrica em string
    public String perimetroToString(){
        return String.format("%.2f", getPerimetro());
    }

    //convertendo a área da forma geométrica em string
    public String areaToString(){
        return String.format("%.2f", getArea());
    }
}
