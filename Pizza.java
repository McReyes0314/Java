public class Pizza{
    String toppings = "Pepperoni"; 
    int diameter = 12;
    double prize = 13.99;
    
    public void setToppings(String t){
        toppings = t;
    }

    public String getToppings(){
        return toppings;
    }

    public void setDiameter(int d){
        diameter = d;
    }

    public int getDiameter(){
        return diameter;
    }

    public void setPrize(double p){
        prize = p;
    }

    public double getPrize(){
        return prize;
    }
}