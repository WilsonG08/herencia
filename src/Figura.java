import javax.swing.plaf.PanelUI;

public abstract class Figura {
    int x,y;

    double perimetro,area;

    protected abstract void calcularPerimetro();

    protected abstract void calcularArea();

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

    /*@Override
    protected abstract void calcularArea();

    protected abstract void calcularPerimetro();*/

}
