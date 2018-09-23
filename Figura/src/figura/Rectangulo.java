package figura;

public class Rectangulo {
    private double lado;
    private double ancho;
    public double area;
    
    public Rectangulo(double lado,double ancho){
        this.ancho = ancho;
        this.lado = lado;
}
    public double get_lado(){
        return lado;
    
}
    public double get_ancho(){
        return ancho;
    }
    
    public double arearectangulo(){
        area=lado*ancho;
        return area;
    }
}
