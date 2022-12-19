public class Menu {
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(); //INSTANCIA CREACION
        miRectangulo.setX(20);
        miRectangulo.setY(10);
        miRectangulo.calcularPerimetro();
        System.out.println(miRectangulo.getPerimetro()); //

        miRectangulo.setX(10);
        miRectangulo.setY(20);
        miRectangulo.calcularArea();
        System.out.println(miRectangulo.getArea());

        Cuadrado miCuarado = new Cuadrado();
        miCuarado.setX(4);
        miCuarado.setY(4);
        miCuarado.calcularPerimetro();
        miCuarado.calcularArea();
        System.out.println(miCuarado.getPerimetro());
        System.out.println(miCuarado.getArea());

        colorTriangulo t1 = new colorTriangulo("Azul","Estilo x",8.8,12.0);
        colorTriangulo t2 = new colorTriangulo("Rojo","Estilo y",4.4,10.0);
        System.out.println("Datos del triangulo 1");
        t1.mostrarEstilo();
        t1.mostrarDimension();
        t1.mostrarColor();
        System.out.println("Su area e : "+t1.area());
        System.out.println("Datos el triangulo 2");
        t2.mostrarEstilo();
        t2.mostrarDimension();
        t2.mostrarColor();
        System.out.println("Su area es : "+t2.area());
    }
}
