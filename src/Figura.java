import javax.swing.plaf.PanelUI;

public class Figura {
    int x,y;

    double perimetro,area;

    public void calcularPerimetro(){
        perimetro = 2*x+2*y;
    }

    public void calcularArea(){
        area = x*y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
