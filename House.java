public class House {
    int occupants;
    double income;

    House(){
        occupants = 1; 
        income = 0.00;
    }

    House(int occupants){
        this.occupants = occupants;
    }

    House(int occupants, double income){
        this.occupants = occupants;
        this.income = income;
    }

    public void setOccupants(int occupants){
        this.occupants = occupants;
    }

    public int getOccupants(){
        return occupants;
    }

    public void setIncome(double income){
        this.income = income;
    }

    public double getIncome(){
        return income;
    }
}
