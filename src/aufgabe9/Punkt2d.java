package aufgabe9;

public class Punkt2d {

    private double x, y;

    public Punkt2d(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punkt2d(){
        this(0, 0);
    }

    // getter & setter
    public double getX(){
        return this.x;
    }
    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }
    public void setY(double y){
        this.y = y;
    }


    // Kalkulation's Methoden
    public void add(Punkt2d punkt){
        this.x += punkt.x;
        this.y += punkt.y;
    }

    public void subtract(Punkt2d punkt){
        this.x -= punkt.x;
        this.y -= punkt.y;
    }

    public void multiply(double multiplikator){
        this.x *= multiplikator;
        this.y *= multiplikator;
    }

    public void divide(double multiplikator){
        this.x /= multiplikator;
        this.y /= multiplikator;
    }

    public double distance(Punkt2d punkt) {
        double dx = this.x - punkt.x;
        double dy = this.y - punkt.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString(){
        return "x, y: \n(" + this.x + ", " + this.y + ")";
    }

}
