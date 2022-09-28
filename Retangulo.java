public class Retangulo extends FormaGeometrica {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
        super.setNome("Retangulo");
    }

    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }

    @Override
    public double getArea() {
        return lado1*lado2;
    }

    //a superclasse FormaGeometrica tem o getPerimetro. Aqui ele é calculado
    @Override
    public double getPerimetro() {
        return 2*(lado1 + lado2);
    }
}