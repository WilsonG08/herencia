public class Rectangulo extends Figura{
    // DICE QUE ES UN HIJO DE FIGURAS
    // LA LASE HIJA PUEDE HEREDAR ATRIBUTOS

    private double base;
    private double altura;

    public Rectangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
        calcularArea();
        calcularPerimetro();
    }

    @Override
    protected void calcularArea(){
        area=base*altura;
    }

    protected  void calcularPerimetro(){
        perimetro = base*2+altura*2;
    }
}
