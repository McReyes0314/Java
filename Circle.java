class Circle{
    double radius, area = 3.14, diameter = 2; 
    Circle(){
        radius = 1;
    }

    public void setRad(double radius){
        this.radius = radius;
    }

    public double getRad(){
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