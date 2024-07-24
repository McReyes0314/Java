public class Test {
    public static void main(String[] args) {
        Circle smallRad = new Circle();
        smallRad.setRad(2);
        double rad2 = smallRad.getRad();
        System.out.println("Area: " + smallRad.computeArea(rad2));
        System.out.println("Diameter: " + smallRad.computeDiameter(rad2) + "\n");

        Circle largerRad = new Circle();
        largerRad.setRad(3);
        double rad3 = largerRad.getRad();
        System.out.println("Area: " + largerRad.computeArea(rad3));
        System.out.println("Diameter: " + largerRad.computeDiameter(rad3) + "\n");

        Circle def = new Circle();
        double rad1 = def.radius;
        System.out.println("Area: " + def.computeArea(rad1));
        System.out.println("Diameter: " + def.computeDiameter(rad1));
    }
}
