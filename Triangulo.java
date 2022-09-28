public class Triangulo extends FormaGeometrica {
    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        super.setNome("Triângulo");
    }
    public double getLado1() {
        return lado1;
    }
    public double getLado2() {
        return lado2;
    }
    public double getLado3() {
        return lado3;
    }

    //a superclasse FormaGeometrica tem o getPerimetro. Aqui ele é calculado
    @Override
    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    //aqui não vai calcular área por decisão de projeto
    public double getArea(){
        return 0;
    }
}