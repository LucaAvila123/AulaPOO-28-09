public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        super.setNome("Círculo");
    }

    public double getRaio() {
        return raio;
    }

    //tem como usar o super aqui? Eis a questão
    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    //a superclasse FormaGeometrica tem o getPerimetro. Aqui ele é calculado
    @Override
    public double getPerimetro() {
        return Math.PI * 2 * raio;
    }
}