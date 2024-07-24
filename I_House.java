public class I_House {
    public static void main(String[] args) {
        House h1 = new House();
        System.out.println("Occupants: " + h1.occupants);
        System.out.println("Income: " + h1.income);

        System.out.println();
        House h2 = new House(2);
        System.out.println("Occupants: " + h1.getOccupants());
        h2.setIncome(2000.00);
        System.out.println("Income: " + h2.getIncome());

        System.out.println();
        House h3 = new House(3, 3000.00);
        System.out.println("Occupants: " + h3.getOccupants());
        System.out.println("Income: " + h3.getIncome());
    }
}
