public class Circle {
    double radius;
    double diameter = 2; 
    double area = 3.14;

    public void setRadius(double rad){
        radius = rad;
    }

    public double getRadius(){
        return radius;
    } 

    public double computeDiameter(double rad){
        diameter *= rad;
        return diameter;
    }

    public double computeArea(double rad){
        area *= (rad * rad);
        return area;
    }
}
