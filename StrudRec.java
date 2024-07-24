public class StrudRec {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        int i = s2.fetchschoolcode();
        System.out.println("S2-School Code: " + i);

        s2.changeschoolcode(14344);

        int j = s1.fetchschoolcode();
        System.out.println("S1-School Code: " + j);
    }
}
