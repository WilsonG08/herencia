public class DosDimensiones {
    private double base;
    private double altura;

    DosDimensiones(){ //ATRIBUTOS CON CONSTRUCTOR
        base=altura=0.0;
    }

    DosDimensiones(double b, double h){
        base=b;
        altura=h;
    }

    DosDimensiones(double x){
        base=altura=x;
    }

    double getBase(){
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double b) {
        base = b;
    }

    public void setAltura(double h) {
        altura = h;
    }

    void mostrarDimension(){
        System.out.println("La base es : "+base+" y la altura es : "+altura);
    }
}
